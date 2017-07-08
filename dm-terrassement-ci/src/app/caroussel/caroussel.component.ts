import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-caroussel',
  templateUrl: './caroussel.component.html',
  styleUrls: ['./caroussel.component.css']
})
export class CarousselComponent implements OnInit {

  @Input() images : string[];
  currentImage : number = 0;

  constructor() { }

  ngOnInit() {
  }

  left(){
    if((this.currentImage+1)<this.images.length){
      this.currentImage++;
    }else {
      this.currentImage=0;
    }
  }

  right(){
    if((this.currentImage-1)>0){
      this.currentImage--;
    }else {
      this.currentImage=this.images.length-1;
    }
  }

}
