import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import "materialize-css";
import { MaterializeModule } from "angular2-materialize";
import { CeiboShare } from "ng2-social-share";

import { DataService } from "./data.service";

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SocialNetworkComponent } from './social-network/social-network.component';
import { AccueilComponent } from './accueil/accueil.component';
import { ContactComponent } from './contact/contact.component';
import { ServiceComponent } from './service/service.component';
import { CategorieComponent } from './service/categorie/categorie.component';
import { CarousselComponent } from './caroussel/caroussel.component';
import { ImageComponent } from './caroussel/image/image.component';
import { FrontImageComponent } from './caroussel/front-image/front-image.component';



const appRoutes: Routes = [
  { path: '', component: AccueilComponent },
  { path: 'services', component: ServiceComponent },
  { path: 'qui-sommes-nous', component: AccueilComponent },
  { path: 'contact', component: ContactComponent }
];


@NgModule({
  declarations: [
    CeiboShare,
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SocialNetworkComponent,
    AccueilComponent,
    ContactComponent,
    ServiceComponent,
    CategorieComponent,
    CarousselComponent,
    ImageComponent,
    FrontImageComponent
  ],
  imports: [
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    FormsModule,
    HttpModule,
    MaterializeModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
