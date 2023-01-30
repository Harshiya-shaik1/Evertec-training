package com.jpa.dao;

import com.jpa.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.sql.Date;


@Component
public class ProductDao {

    @Autowired
    private ProductRespository productRespository;



    public void createProduct(String productCode, String productName, String category, Date createdDate, Date updatedDate) {
        Product prod = new Product(productCode, productName, category, createdDate, updatedDate);
        productRespository.save(prod);
    }

}
