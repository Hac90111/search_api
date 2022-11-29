package com.udemy.search_api.REST.API.products.search.service;

import com.udemy.search_api.REST.API.products.search.entity.Product;
import com.udemy.search_api.REST.API.products.search.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepo repo;
    @Override
    public Product createProduct(Product product) {
     return repo.save(product);
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = repo.searchProducts(query);
        return products;
    }
}
