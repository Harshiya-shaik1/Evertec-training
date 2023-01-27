package com.jpa.entities;

import java.sql.Date;

public class PurchaseProduct {
	private int purchaseId;
	private String productCode;
	private int quantity;
	private double rate;
	private Date purchasedate;
	private Date createdDate;
	
	public PurchaseProduct() {
		
	}

	public PurchaseProduct(int purchaseId, String productCode, int quantity, double rate, Date purchasedate,
			Date createdDate) {
		super();
		this.purchaseId = purchaseId;
		this.productCode = productCode;
		this.quantity = quantity;
		this.rate = rate;
		this.purchasedate = purchasedate;
		this.createdDate = createdDate;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Date getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "PurchaseProduct [purchaseId=" + purchaseId + ", productCode=" + productCode + ", quantity=" + quantity
				+ ", rate=" + rate + ", purchasedate=" + purchasedate + ", createdDate=" + createdDate + "]";
	}
	

}
