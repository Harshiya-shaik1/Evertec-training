package com.jpa.entities;

import java.sql.Date;

public class Product {
	private String productCode;
	private String productName;
	private String category ;
	private Date createdDate;
	private Date updatedDate;
	
	public Product() {
		
	}

	public Product(String productCode, String productName, String category, Date createdDate, Date updatedDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	

}
