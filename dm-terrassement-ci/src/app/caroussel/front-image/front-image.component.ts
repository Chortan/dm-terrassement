import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-front-image',
  templateUrl: './front-image.component.html',
  styleUrls: ['./front-image.component.css']
})
export class FrontImageComponent implements OnInit {

  @Input() image : string;
  
  constructor() { }

  ngOnInit() {
  }

}
