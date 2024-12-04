import { Component, OnInit } from '@angular/core';
import { Users } from '../model/users.model';
import { LoginService } from '../services/login.services';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-login',
  standalone: false,
  
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit{
  model = new Users();
password: any;
  ngOnInit(): void {
  }

  constructor(private loginService: LoginService, private router: Router){
  }

  validateUser(loginForm: NgForm){
    this.loginService.validateLoginDetailsOnObject(this.model).subscribe(
      responseData => {
        console.log(responseData);
        window.sessionStorage.setItem("userDetails", JSON.stringify(this.model));
        this.model = <any> responseData.body;
        this.router.navigate(['/dashboard']);
      }
    );
  }
}
