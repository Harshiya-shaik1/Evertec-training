package com.jpa.dao;

import com.jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<Product, Integer> {
}
