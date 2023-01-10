import java.sql.Date;

public class Product {
	private String productCode;
	private String description;
	private String productName;
	private String category;
	private Date Created_Date;
	private Date Updated_Date;

	public Date getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}

	public Date getUpdated_Date() {
		return Updated_Date;
	}

	public void setUpdated_Date(Date updated_Date) {
		Updated_Date = updated_Date;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productCode, String description, String productName, String category) {
		super();
		this.productCode = productCode;
		this.description = description;
		this.productName = productName;
		this.category = category;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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


}
