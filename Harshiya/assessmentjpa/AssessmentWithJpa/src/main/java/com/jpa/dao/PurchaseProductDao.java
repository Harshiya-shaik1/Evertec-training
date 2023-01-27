package com.jpa.dao;

import java.sql.Date;

import org.springframework.orm.jpa.JpaTemplate;

import com.jpa.entities.PurchaseProduct;



public class PurchaseProductDao {
	public JpaTemplate purchaseTemplate;

	public JpaTemplate getPurchaseTemplate() {
		return purchaseTemplate;
	}

	public void setPurchaseTemplate(JpaTemplate purchaseTemplate) {
		this.purchaseTemplate = purchaseTemplate;
	}
	public void createPurchaseProduct(int purchaseId, String productCode, int quantity, double rate, Date purchasedate,
			Date createdDate){  
	       PurchaseProduct purchaseProd=new PurchaseProduct( purchaseId,  productCode,  quantity,  rate,  purchasedate,
	   			 createdDate);  
	       purchaseTemplate.persist(purchaseProd);
	    }  

}
