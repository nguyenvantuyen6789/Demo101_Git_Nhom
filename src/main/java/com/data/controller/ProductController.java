package com.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// de1
// de2
//de3

// z1
// z2

public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "List of products: Car, hat";
    }
}