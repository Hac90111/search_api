package com.udemy.search_api.REST.API.products.search.controller;

import com.udemy.search_api.REST.API.products.search.entity.Product;
import com.udemy.search_api.REST.API.products.search.repository.ProductRepo;
import com.udemy.search_api.REST.API.products.search.service.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class PostController {
    @Autowired
    private ProductService productService;

    // create product
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
      return   productService.createProduct(product);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
       List<Product> products= productService.searchProducts(query);
        return ResponseEntity.ok(products);
    }
}
