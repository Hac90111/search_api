package com.udemy.search_api.REST.API.products.search.repository;

import com.udemy.search_api.REST.API.products.search.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE " +
    "p.name LIKE CONCAT('$',:query, '%') " +
    "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

    @Query(value = "SELECT * FROM products p WHERE " +
            "p.name LIKE CONCAT('$',:query, '%') " +
            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<Product> searchProductsSql(String query);
}
