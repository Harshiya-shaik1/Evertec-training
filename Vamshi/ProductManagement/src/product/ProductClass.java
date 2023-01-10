package product;

public class ProductClass {
	private String pCode;
	private String pName;
	private String category;
	
	public ProductClass(String pCode, String pName, String category) {
		
		this.pCode = pCode;
		this.pName = pName;
		this.category = category;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	

}
