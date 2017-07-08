import { Component, OnInit } from '@angular/core';

import {DataService} from "../data.service";
import {Service} from "./service";

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {

  services: Service[];
  constructor(private data:DataService) { }

  

showInitialized = false;

  ngOnInit() {
    this.data.getServices().subscribe(t=>{
      this.services=t;
      console.log(t);
    });
  }

}
