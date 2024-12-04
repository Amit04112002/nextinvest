package com.nextinvest.service.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tag;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String tittle;

    @Column(nullable = false, unique = true)
    private String location;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String total_price;

    @Column(nullable = false)
    private String get_price;

    @Column(nullable = false)
    private String security_type;

    @Column(nullable = false)
    private String investment_multiple;

    @Column(nullable = false)
    private String maturity;

    @Column(nullable = false)
    private String minimum_investment;

}
