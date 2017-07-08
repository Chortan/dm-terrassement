import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-social-network',
  templateUrl: './social-network.component.html',
  styleUrls: ['./social-network.component.css']
})
export class SocialNetworkComponent implements OnInit {
  repoUrl : string = "http://www.dm-terrassement.fr";


  constructor() { }

  ngOnInit() {
  }

}
