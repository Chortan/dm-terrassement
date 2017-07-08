import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {


 imageURLs = [
    "/assets/images/galeries/1.jpg",
"/assets/images/galeries/2.jpg",
"/assets/images/galeries/20170522_133640.jpg",
"/assets/images/galeries/20170522_133648.jpg",
"/assets/images/galeries/20170522_140645.jpg",
"/assets/images/galeries/20170522_140652.jpg",
"/assets/images/galeries/20170529_133844.jpg",
"/assets/images/galeries/20170529_133850.jpg",
"/assets/images/galeries/20170529_133855.jpg",
"/assets/images/galeries/20170529_133911.jpg",
"/assets/images/galeries/3.jpg",
"/assets/images/galeries/4.jpg",
"/assets/images/galeries/5.jpg",
"/assets/images/galeries/6.jpg",
"/assets/images/galeries/7.jpg",
  ];
  
  constructor() { }

  ngOnInit() {
  }

}
