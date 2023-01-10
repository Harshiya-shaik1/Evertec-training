import java.sql.Date;

public class Purchase {
	private String productcode;
	private int quantity;
	private double rate;
	private Date dateofpurchase;
	public Purchase() {
		// TODO Auto-generated constructor stub
	}
	public Purchase(String productcode, int quantity, double rate, Date dateofpurchase) {
		super();
		this.productcode = productcode;
		this.quantity = quantity;
		this.rate = rate;
		this.dateofpurchase = dateofpurchase;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
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
	public Date getDateofpurchase() {
		return dateofpurchase;
	}
	public void setDateofpurchase(Date dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}


}
