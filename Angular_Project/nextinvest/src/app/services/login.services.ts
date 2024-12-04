import { Component, Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Users } from '../model/users.model';

@Injectable({
    providedIn: 'root'
})
export class LoginService {
    constructor(private http: HttpClient){
    }

    validateLoginDetails(email: string, password: string){
        //window.sessionStorage.setItem("userDetails", JSON.stringify(users));
        return this.http.get("/api/validateUser?email="+email+"&password="+password);
    }

    validateLoginDetailsOnObject(users: Users){
        //window.sessionStorage.setItem("userDetails", JSON.stringify(users));
        return this.http.get("/api/validateUser?email="+users.email+"&password="+users.password, {observe: 'response', withCredentials:true});
    }
}