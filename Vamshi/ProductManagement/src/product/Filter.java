package product;

import java.sql.Date;

public class Filter {
	String productCode;
	String productName;
	String category;
	Date dateOfPurchase;
	double quantity;
	double rate;
	double Total_Amount;
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
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(double total_Amount) {
		Total_Amount = total_Amount;
	}
	public Filter(String productCode, String productName, String category, Date dateOfPurchase, double quantity,
			double rate, double total_Amount) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.dateOfPurchase = dateOfPurchase;
		this.quantity = quantity;
		this.rate = rate;
		Total_Amount = total_Amount;
	}
	@Override
	public String toString() {
		return "Filter [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", dateOfPurchase=" + dateOfPurchase + ", quantity=" + quantity + ", rate=" + rate + ", Total_Amount="
				+ Total_Amount + "]";
	}
	

}
