package com.everteck.jdbcConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.everteck.entity.Product;
import com.everteck.entity.PurchaseProduct;

public class JdbcConnection {
	Connection con = null;
	PreparedStatement stmt = null;

	public JdbcConnection() throws ClassNotFoundException, SQLException {
		super();
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "Gopi@123");

	}

	public void saveProduct(Product product) throws SQLException {
		
		stmt = con.prepareStatement("insert into product values(?,?,?,?,?)");
		stmt.setString(1, product.getProductCode());
		stmt.setString(2, product.getProductName());
		stmt.setString(3, product.getCategory());
		stmt.setDate(4, product.getCreatedDate());
		stmt.setDate(5, product.getUpdatedDate());
		stmt.executeUpdate();

	}

	public Product getProduct(String productCode) throws SQLException {
		Product product = null;
		stmt = con.prepareStatement("select * from product where productcode=?");
		stmt.setString(1, productCode);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			product=new Product();
			product.setProductCode(rs.getString(1));
			product.setProductName(rs.getString(2));
			product.setCategory(rs.getString(3));
			product.setCreatedDate(rs.getDate(4));
			product.setUpdatedDate(rs.getDate(5));

		}
		return product;

	}

	public void savePurchaseProduct(PurchaseProduct purchaProud) throws SQLException {
		stmt = con.prepareStatement("insert into  purchaseProduct(productCode,quantity,rate,purchaseDate,createdDate) values(?,?,?,?,?)");
		
		stmt.setString(1, purchaProud.getProductCode());
		stmt.setInt(2, purchaProud.getQuantity());
		stmt.setDouble(3, purchaProud.getRate());
		stmt.setDate(4, purchaProud.getPurchasedate());
		stmt.setDate(5, purchaProud.getCreatedDate());

		stmt.executeUpdate();

	}

	public List<PurchaseProduct> getDetails(List<Product> products) throws SQLException {
		List<PurchaseProduct> pps = new ArrayList<>();
		PurchaseProduct pp;

		for (Product p : products) {

			stmt = con.prepareStatement("select * from purchaseProduct where productcode=?");
			stmt.setString(1, p.getProductCode());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				pp=new PurchaseProduct();
				pp.setPurchaseId(rs.getInt(1));
				pp.setProductCode(rs.getString(2));
				pp.setQuantity(rs.getInt(3));
				pp.setRate(rs.getDouble(4));
				pp.setPurchasedate(rs.getDate(5));
				pp.setCreatedDate(rs.getDate(6));

				
				pps.add(pp);
			}

		}
		return pps;
	}

	public List<Product> getProducts() throws SQLException {
		List<Product> products = new ArrayList<>();
		stmt = con.prepareStatement("select * from product ");
		//stmt.setString(1, cat);
		ResultSet rs = stmt.executeQuery();
		Product prod;
		while (rs.next()) {
			prod = new Product();
			prod.setProductCode(rs.getString(1));
			prod.setProductName(rs.getString(2));
			prod.setCategory(rs.getString(3));
			products.add(prod);
		}

		return products;
	}
	
	
	public List<PurchaseProduct> getDetailsBasedOnPurchaseDate(String productCode) throws SQLException {
		List<PurchaseProduct> purchaprod = new ArrayList<PurchaseProduct>();
		stmt = con.prepareStatement("select * from purchaseProduct where productcode=? order by purchaseDate desc");
		stmt.setString(1, productCode);
		ResultSet rs = stmt.executeQuery();
		PurchaseProduct pp;
		while(rs.next()) {
			pp=new PurchaseProduct();
			pp.setPurchaseId(rs.getInt(1));
			pp.setProductCode(rs.getString(2));
			pp.setQuantity(rs.getInt(3));
			pp.setRate(rs.getDouble(4));
			pp.setPurchasedate(rs.getDate(5));
			pp.setCreatedDate(rs.getDate(6));
			
			purchaprod.add(pp);
			 
		}
		return  purchaprod;
		
		
		
	}

	public List<PurchaseProduct> getDetailsBasedOnTotalAmmount(String productCode) throws SQLException {
		List<PurchaseProduct> purchaprod = new ArrayList<PurchaseProduct>();
		stmt = con.prepareStatement("select * from purchaseProduct where productcode=? order by (rate*quantity) desc");
		stmt.setString(1, productCode);
		ResultSet rs = stmt.executeQuery();
		PurchaseProduct pp;
		while(rs.next()) {
			pp=new PurchaseProduct();
			pp.setPurchaseId(rs.getInt(1));
			pp.setProductCode(rs.getString(2));
			pp.setQuantity(rs.getInt(3));
			pp.setRate(rs.getDouble(4));
			pp.setPurchasedate(rs.getDate(5));
			pp.setCreatedDate(rs.getDate(6));
			
			purchaprod.add(pp);
			 
		}
		return  purchaprod;

}
	public void editProductNameByProductCode(String productCode,String productName) throws SQLException {
		stmt = con.prepareStatement("UPDATE product SET productName = ?,UpdatedDate = ? WHERE productCode = ?");
		stmt.setString(1, productName);
	
		stmt.setDate(2, new Date(System.currentTimeMillis()));
		stmt.setString(3, productCode);
		
		stmt.executeUpdate();
		
	}
	public void editProductCtagoryByProductCode(String productCode,String catagory) throws SQLException {
		stmt = con.prepareStatement("UPDATE product SET catagory = ?,UpdatedDate = ? WHERE productCode = ?");
		stmt.setString(1, catagory);
	
		stmt.setDate(2, new Date(System.currentTimeMillis()));
		stmt.setString(3, productCode);
		
		stmt.executeUpdate();
		
	}
	
	public void deleteProduct(String productCode) throws SQLException {
		stmt=con.prepareStatement("select  purchaseId from purchaseProduct where productCode=?");
		stmt.setString(1, productCode);
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			stmt=con.prepareStatement("DELETE FROM purchaseProduct WHERE purchaseId=?");

			stmt.setInt(1, rs.getInt(1));
			stmt.execute();
		}
		
		stmt = con.prepareStatement("DELETE FROM Product WHERE productCode = ? ");
		
		stmt.setString(1, productCode);
		
		stmt.executeUpdate();
		
	}

	
//	public List<PurchaseProduct> filterbyAllTheDetails(String catagory,Date fromDate,Date toDate,double minAmount,double maxAmount) throws SQLException {
//		List<PurchaseProduct> purchaprod=new ArrayList<PurchaseProduct>();
//		 if(catagory.isEmpty()&&fromDate==null&&toDate==null  ) {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where   purchaseProduct.rate*purchaseProduct.quantity between ? AND ? AND product.productCode=purchaseProduct.productCode");
//			stmt.setDouble(1, minAmount);
//			stmt.setDouble(2, maxAmount);
//		}
//		
//		else if(fromDate==null&&toDate==null&&minAmount==0.0&&minAmount==0.0) {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where product.catagory=?   AND product.productCode=purchaseProduct.productCode");
//			stmt.setString(1, catagory);
//			
//		}
//		else if(catagory.isEmpty()&&minAmount==0.0&&minAmount==0.0) {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where purchaseProduct.purchaseDate between ? And ?  AND product.productCode=purchaseProduct.productCode");
//			
//			stmt.setDate(1, fromDate);
//			stmt.setDate(2, toDate);
//		}
//		else if(catagory.isEmpty()) {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where  purchaseProduct.purchaseDate between ? And ? AND purchaseProduct.rate*purchaseProduct.quantity between ? AND ? AND product.productCode=purchaseProduct.productCode");
//			stmt.setDate(1, fromDate);
//			stmt.setDate(2, toDate);
//			stmt.setDouble(3, minAmount);
//			stmt.setDouble(4, maxAmount);
//	      }
//		else if(fromDate==null&&toDate==null) {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where product.catagory=?  AND purchaseProduct.rate*purchaseProduct.quantity between ? AND ? AND product.productCode=purchaseProduct.productCode");
//			stmt.setString(1, catagory);
//			
//			stmt.setDouble(2, minAmount);
//			stmt.setDouble(3, maxAmount);
//		}
//		else if(minAmount==0.0&&minAmount==0.0) {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where product.catagory=? AND purchaseProduct.purchaseDate between ? And ?  AND product.productCode=purchaseProduct.productCode");
//			stmt.setString(1, catagory);
//			stmt.setDate(2, fromDate);
//			stmt.setDate(3, toDate);
//			}
//		
//		
//		
//		
//		else  {
//			stmt = con.prepareStatement(" select product.productCode,product.catagory,productName,quantity,rate,purchaseDate from product,purchaseProduct where product.catagory=? AND purchaseProduct.purchaseDate between ? And ? AND purchaseProduct.rate*purchaseProduct.quantity between ? AND ? AND product.productCode=purchaseProduct.productCode");
//			stmt.setString(1, catagory);
//			stmt.setDate(2, fromDate);
//			stmt.setDate(3, toDate);
//			stmt.setDouble(4, minAmount);
//			stmt.setDouble(5, maxAmount);
//			
//		}
//		
//		ResultSet rs = stmt.executeQuery();
//		PurchaseProduct pp;
//		while(rs.next()) {
//			pp=new PurchaseProduct();
//			pp.setProductCode(rs.getString(1));
//			pp.setQuantity(rs.getInt(4));
//			pp.setRate(rs.getDouble(5));
//			pp.setPurchasedate(rs.getDate(6));
//			
//			purchaprod.add(pp);
//			
//		}
//		return purchaprod;
//	}
//	
	public String getDistinctCatagories(String cat) throws SQLException{
		String catagory="";
		stmt = con.prepareStatement("select Distinct catagory from product where catagory=?");
		stmt.setString(1, cat);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			catagory=rs.getString(1);
		}
				
		return catagory;
	}
	public List<Product> getProduct() throws SQLException{
		List<Product> products=new ArrayList<>();
		Product product;
		stmt = con.prepareStatement("select * from product ");


		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
		product = new Product();
		product.setProductCode(rs.getString(1));
		product.setProductName(rs.getString(2));
		product.setCategory(rs.getString(3));
		product.setCreatedDate(rs.getDate(4));
		product.setUpdatedDate(rs.getDate(5));
		products.add(product);

		}
		return products;

		}
		public List<PurchaseProduct> getPurchaseProduct() throws SQLException {
		List<PurchaseProduct> purchaprod = new ArrayList<PurchaseProduct>();
		stmt = con.prepareStatement("select * from purchaseProduct ");

		ResultSet rs = stmt.executeQuery();
		PurchaseProduct pp;
		while (rs.next()) {
		pp = new PurchaseProduct();
		pp.setPurchaseId(rs.getInt(1));
		pp.setProductCode(rs.getString(2));
		pp.setQuantity(rs.getInt(3));
		pp.setRate(rs.getDouble(4));
		pp.setPurchasedate(rs.getDate(5));
		pp.setCreatedDate(rs.getDate(6));

		purchaprod.add(pp);

		}
		return purchaprod;

		}
	
}