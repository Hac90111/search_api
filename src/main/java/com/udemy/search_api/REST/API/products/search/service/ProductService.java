package com.udemy.search_api.REST.API.products.search.service;

import com.udemy.search_api.REST.API.products.search.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product createProduct(Product product);

    List<Product> searchProducts(String query);
}
