package com.devmaster.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaster.Library.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
