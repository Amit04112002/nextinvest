package com.nextinvest.service.controller;

import com.nextinvest.service.models.Product;
import com.nextinvest.service.models.Users;
import com.nextinvest.service.service.ProductService;
import com.nextinvest.service.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
   ProductService productService;


    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        productService.saveDetails(product);
        return ResponseEntity.ok(product);
    }



}