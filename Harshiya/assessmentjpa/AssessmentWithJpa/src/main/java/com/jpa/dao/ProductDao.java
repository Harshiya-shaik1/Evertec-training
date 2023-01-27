package com.jpa.dao;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.orm.jpa.JpaTemplate;

import com.jpa.entities.Product;


@Transactional
public class ProductDao {
	public JpaTemplate template;

	public JpaTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JpaTemplate template) {
		this.template = template;
	}
	 public void createProduct(String productCode, String productName, String category, Date createdDate, Date updatedDate){  
	       Product prod=new Product(productCode,productName,category,createdDate,updatedDate);  
	       template.persist(prod);
	    }  

}
