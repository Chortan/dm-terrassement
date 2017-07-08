import { Component, OnInit } from '@angular/core';

import {MaterializeDirective} from "angular2-materialize";

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
  motifs:string[] = ["Demande d'information","Demande de devis","Problèmes technique", "Autre"];
  motif:string ;
  textInitial:string= "Choisir type de demande";
  constructor() { 
    this.motif=this.textInitial;
  }

  ngOnInit() {
  }

  onChange(motif:string){
    this.motif = motif;

  }

}
