package com.jpa.dao;

import com.jpa.entities.PurchaseProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;


@Component
public class PurchaseProductDao {

    @Autowired
    private PurchaseProductRepository purchaseProductRepository;

    public void createPurchaseProduct(int purchaseId, String productCode, int quantity, double rate, Date purchasedate,
                                      Date createdDate) {
        PurchaseProduct purchaseProd = new PurchaseProduct(purchaseId, productCode, quantity, rate, purchasedate,
                createdDate);
        purchaseProductRepository.save(purchaseProd);
    }

}
