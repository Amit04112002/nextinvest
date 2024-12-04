package com.nextinvest.service.service;

import com.nextinvest.service.models.Product;
import com.nextinvest.service.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
   private ProductRepository productRepository;

    public void saveDetails(Product product){
       productRepository.save(product);
    }

    public void saveProduct(Product product) {
    }
}