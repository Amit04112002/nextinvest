import { Component, OnInit } from '@angular/core';
import { Users } from '../model/users.model';

@Component({
  selector: 'app-dashboard',
  standalone: false,
  
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent implements OnInit{
  users = new Users();
  constructor(){}

  ngOnInit(): void {
   if(sessionStorage.getItem("userDetails")){
    this.users = JSON.parse(sessionStorage.getItem("userDetails") || "");
   }
  }
}
