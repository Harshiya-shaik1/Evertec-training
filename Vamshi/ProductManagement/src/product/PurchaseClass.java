package product;

import java.time.LocalDate;

public class PurchaseClass {
	private String pCode;
	private int quantity;
	private double rate;
	private LocalDate dateOfPurchase;
	
	public PurchaseClass(String pCode, int quantity, double rate, LocalDate dateOfPurchase) {
		
		this.pCode = pCode;
		this.quantity = quantity;
		this.rate = rate;
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
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

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
	
	
	
	
	
	
	

}
