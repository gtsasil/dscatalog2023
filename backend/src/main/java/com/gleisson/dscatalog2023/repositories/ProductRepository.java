package com.gleisson.dscatalog2023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleisson.dscatalog2023.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
