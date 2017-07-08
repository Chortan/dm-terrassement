import { Component, OnInit, Input } from '@angular/core';

import { Service } from "../service";

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {

  @Input() service : Service;

  constructor() { }

  ngOnInit() {
  }

}
