package com.nextinvest.service.controller;

import com.nextinvest.service.dto.UsersDTO;
import com.nextinvest.service.models.Product;
import com.nextinvest.service.models.Users;
import com.nextinvest.service.service.ProductService;
import com.nextinvest.service.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class NextInvestController {

    @Autowired
    UsersService usersService;


    @PostMapping("/saveUsers")
    public ResponseEntity<?> saveUsers(@RequestBody Users users) {
        usersService.saveUsers(users);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/validateUser")
    public ResponseEntity<?> validateUser(@RequestParam String email, @RequestParam String password){
        UsersDTO users = usersService.validateUser(email, password);
        return ResponseEntity.ok(users);
    }

}