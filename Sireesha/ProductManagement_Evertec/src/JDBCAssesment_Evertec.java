import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



public class JDBCAssesment_Evertec{
	static Connection con;
	static Statement st;
	static PreparedStatement prd;

	public static void main(String[] args) throws SQLException, UserDefinedException {
		Scanner scn = new Scanner(System.in);
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Productdb", "root", "Sireesha@12345");
			st = con.createStatement();
			ResultSet rs;
			while (true) {
				System.out.println(
						"1.Add Product \n2.Purchase Product\n3.View Product Details\n4.View by Product code order by Purchase date \n"
								+ "5.View by product code order by total amount\n"
								+ "6.Edit Product\n7.Delete Product\n8.filter Product");
				int a = scn.nextInt();
				if (a == 1) {
					System.out.println("product_Code ");
					String code ;
					while(true) {
						code = scn.next();
						rs=st.executeQuery("select * from product where product_Code='"+code+"'");
						if(!rs.next()) {
							break;
						}
						System.err.println("The product code is already exist");
						System.out.println("product_Code ");

					}
					System.out.println("Product_Name");
					String name = scn.next();
					System.out.println("description");
					String des = scn.next();
					System.out.println("Category");
					String cat = scn.next();

					System.out.println("Do you want to create product y/n");
					char ch = scn.next().charAt(0);
					if (ch == 'y'||ch=='Y') {

						st.executeUpdate("insert into product values('" + code + "','" + name + "','" + des + "','"
								+ cat + "','" + new Date(System.currentTimeMillis()) + "','"
								+ new Date(System.currentTimeMillis()) + "') ");
						System.out.println("Successfully updated in database");
					}

					else {
						System.out.println("Not Updated");
					}
				}

				if (a == 2) {
					try {
						System.out.println("product code");
						String pcode = scn.next();
						if(!Pattern.matches("p[0-9]{3}", pcode))
							throw new UserDefinedException(" Enter valid product_Code ");
						System.out.println("quantity");
						int q = scn.nextInt();
						System.out.println("rate");
						double r = scn.nextInt();
						System.out.println("enter the purchase date");
						String dt = scn.next();
						LocalDate date = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
						System.out.println("Do you want to save the purchased details y/n");
						char ch1 = scn.next().charAt(0);
						if (ch1 == 'y'||ch1=='Y') {
							st.executeUpdate("insert into Purchase_product values('" + pcode + "','" + q + "','" + r + "','"
									+ date  + "','" + new Date(System.currentTimeMillis())+ "')");
							System.out.println("Successfully  updated in database");

						} else 
							System.out.println("Not Updated");
					}
					catch(DateTimeParseException e) {
						System.err.println("date couldnot be parsed. valid format is dd/mm/yyyy");
					}
					catch(UserDefinedException e) {
						System.err.println("Purchase_product could  not be added ");
					}
				}
				if (a == 3) {
					System.out.println("View Product Details by category:");
					System.out.println();


					List<Product> p = new ArrayList<>();
					Product pr=new Product();
					rs = st.executeQuery("select * from product");
					while (rs.next()) {
						pr = new Product();
						pr.setProductCode(rs.getString(1));
						pr.setProductName(rs.getString(2));
						pr.setDescription(rs.getString(3));
						pr.setCategory(rs.getString(4));
						p.add(pr);
					}
					List<String> b = p.stream().map(x -> x.getCategory()).distinct().toList();
					List<Purchase> p1 = new ArrayList<>();
					Purchase ps;

					rs = st.executeQuery("select * from  Purchase_product");
					while (rs.next()) {
						ps = new Purchase();
						ps.setProductcode(rs.getString(1));
						ps.setQuantity(rs.getInt(2));
						ps.setRate(rs.getDouble(3));
						ps.setDateofpurchase(rs.getDate(4));
						p1.add(ps);
					}

					for (String sr : b) {

						List<String> in = p.stream().filter(z -> z.getCategory().equals(sr))
								.map(y -> y.getProductCode()).distinct().toList();

						for (String sr1 : in) {
							Product prd = p.stream().filter(u -> u.getProductCode().equals(sr1)).findAny().orElse(null);
							List<Purchase> pn = p1.stream().filter(q -> q.getProductcode().equals(sr1))
									.collect(Collectors.toList());
							double sum = pn.stream().mapToDouble(w -> w.getRate()).sum();
							int tq = pn.stream().mapToInt(v -> v.getQuantity()).sum();
							for (Purchase prs : pn) {
								System.out.println( );
								System.out.println(prs.getProductcode()+" | "+ prd.getProductName()+" | "+prd.getCategory()+" | "
										+(sum * tq) / tq + " | " + tq + " | " + sum * tq);
							}
						}


					}

				}
				if (a == 4) {
					try {
						System.out.println(" Enter Product Code:");
						String s2 = scn.next();
						if(!Pattern.matches("p[0-9]{3}", s2))
							throw new UserDefinedException(" Enter valid product_Code ");
						System.out.println("Purchase Date"+"  "+"Quantity"+"  "+" Rate"+"  "+"Total Amount");
						prd=con.prepareStatement("select pp.DateOfPurchase,pp.quantity,pp.rate,(pp.quantity*pp.rate) as Total_Amount from Purchase_product as pp   where pp.product_Code=?  order by DateOfPurchase desc");
						prd.setString(1, s2);
						rs=prd.executeQuery();
						while(rs.next()) {
							System.out.println(rs.getDate("DateOfPurchase")+"\t"+rs.getInt("quantity")+"\t"+rs.getInt("rate")+"\t"+rs.getDouble("Total_Amount"));
						}
					}
					catch(UserDefinedException e) {
						System.err.println("Product code is wrong enter valid code");
					}
				}
				if(a==5) {
					try {
						System.out.println(" Enter Product Code:");
						String s3 = scn.next();
						if(!Pattern.matches("p[0-9]{3}", s3))
							throw new UserDefinedException(" Enter valid product_Code ");
						System.out.println("Product_Code"+" "+"Product_Name"+" "+" Total Quantity"+" "+"Rate"+" "+"DateOfPurchase"+"  "+"Total_Amount");
						prd=con.prepareStatement("Select \r\n"
								+ " p.product_Code,p.Product_Name,pp.quantity,pp.rate,pp.DateOfPurchase,(pp.quantity*pp.rate) as Total_Amount\r\n"
								+ "From product as p\r\n"
								+ " join Purchase_product as pp on p.product_Code=pp.product_Code\r\n"
								+ " where p.product_Code=?"
								+ " order by Total_Amount desc");
						prd.setString(1, s3);
						rs=prd.executeQuery();
						while(rs.next()) {
							System.out.println(rs.getString("product_Code")+"\t\t"+rs.getString("product_Name")+"\t\t"+rs.getInt("quantity")+" \t "+rs.getInt("rate")+" \t"+rs.getDate("DateOfPurchase")+"\t"+rs.getDouble("Total_Amount"));
						}
					}

					catch(UserDefinedException e) {
						System.err.println("Product code is wrong enter valid code");
					}
				}
				if(a==6) {

					System.out.println("Enter Product Code:");
					String s4=scn.next();
					System.out.println("Product_Code   Product_Name     Description    Category    Updated_Date");
					prd=con.prepareStatement("select * from product where product_Code=?");
					prd.setString(1, s4);
					rs=prd.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getString("product_Code")+"\t\t"+rs.getString("product_Name")+"\t\t"+rs.getString("description")+" \t\t"+rs.getString("Category")+"\t"+rs.getDate("Updated_Date"));
					}
					System.out.println("Do you want to edit y/n");
					char ch = scn.next().charAt(0);
					if (ch == 'y'||ch=='Y') {
						System.out.println("Product_Name");
						String pName=scn.next();
						System.out.println("description");
						String desc=scn.next();
						System.out.println("Category");
						String cat=scn.next();
						PreparedStatement ps1=con.prepareStatement("update product set Product_Name=?,description=?,Category=?,Updated_Date=? where product_Code=?");
						ps1.setString(1, pName);
						ps1.setString(2, desc);
						ps1.setString(3, cat);
						ps1.setDate(4,new Date(System.currentTimeMillis()));
						ps1.setString(5, s4);
						int i=ps1.executeUpdate();
						System.out.println(i+"Record Sucessfully edited");
					}
					else {
						System.out.println("Thanks");
					}

				}

				if(a==7) {
					try {
						System.out.println(" Enter Product Code:");
						String s5 = scn.next();
						if(!Pattern.matches("p[0-9]{3}", s5))
							throw new UserDefinedException(" Enter valid product_Code ");
						System.out.println("Product_Code"+"   "+"Product_Name"+"   "+"Description"+"   "+"Category"+"  "+"Created_Date"+"Updated_Date");
						prd=con.prepareStatement("  select * from product where product_Code=?  ");
						prd.setString(1, s5);
						rs = prd.executeQuery();
						while(rs.next()) {
							System.out.println(rs.getString("product_Code")+"\t\t"+rs.getString("product_Name")+"\t\t"+rs.getString("description")+"\t\t"+rs.getString("Category")+"\t\t"+rs.getDate("Created_Date")+"\t\t"+rs.getDate("Updated_Date"));
						}
						System.out.println("do you want delete product? y/n");
						char ch=scn.next().charAt(0);
						if(ch=='y'||ch=='Y') {
							prd=con.prepareStatement("  delete from  product where product_Code=?  ");
							prd.setString(1, s5);
							int n=prd.executeUpdate();
							System.out.println(s5+" record deleted sucessfully ");
						}
					}
					catch(UserDefinedException e) {
						System.err.println("Product code is wrong enter valid code");
					}
				}
				if(a==8) {
					System.out.println("do you want to filter with the Category ? y/n");
					char ch=scn.next().charAt(0);
					String sqlQuery="select p.product_code,p.product_Name,p.Category,pp.DateOfPurchase,pp.quantity,pp.rate,(pp.quantity*pp.rate) as Total_Amount from product p, Purchase_product pp\r\n"
							+ "where p.product_Code=pp.product_Code and ";
					if(ch=='y'||ch=='Y') {
						System.out.println("Enter category");
						String cat=scn.next();
						sqlQuery+="Category='"+cat+"' and ";
					}
					System.out.println("do you want to filter with the DateOfPurchase ? y/n");
					ch=scn.next().charAt(0);
					if(ch=='y'||ch=='Y') {
						System.out.println("Enter FromDate");
						String fdate=scn.next();
						System.out.println("Enter ToDate");
						String tdate=scn.next();
						sqlQuery+="DateOfPurchase>= '"+fdate+"' and DateOfPurchase< '"+tdate+"' and " ;
					}
					System.out.println("do you want to filter with the rate ? y/n");
					ch=scn.next().charAt(0);
					if(ch=='y'||ch=='Y') {
						System.out.println("Enter Minimum Amount");
						Double minAmount=scn.nextDouble();
						System.out.println("Enter Maximum Amount");
						Double maxAmount=scn.nextDouble();
						sqlQuery+="rate>= "+minAmount+" and rate< "+maxAmount+" and " ;
					}
					sqlQuery=sqlQuery.substring(0,sqlQuery.length()-4);
					rs=st.executeQuery(sqlQuery);
					while(rs.next()) {
						System.out.println(rs.getString("product_Code")+" "+rs.getString("product_Name")+" "+rs.getString("Category")+" "+rs.getDate("DateOfPurchase")+" "+rs.getInt("quantity")+" "+rs.getDouble("rate")+" "+rs.getDouble("Total_Amount"));
					}	
				}

			}
		}
		
		
		                               /*try {
						String sqlQuery="select p.product_code,p.product_Name,p.Category,pp.DateOfPurchase,pp.quantity,pp.rate,(pp.quantity*pp.rate) as Total_Amount from product p, Purchase_product pp\r\n"
								+ "where p.product_Code=pp.product_Code ";
						rs=st.executeQuery(sqlQuery);
						List<Filter> filterList=new ArrayList<>();
						while(rs.next()) {
							Filter obj=new Filter(rs.getString("product_Code"), 
									rs.getString("product_Name"),
									rs.getString("Category"),
									rs.getDate("DateOfPurchase"), 
									rs.getDouble("quantity"),
									rs.getDouble("rate"),
									rs.getDouble("Total_Amount"));
							filterList.add(obj);

						}

						System.out.println("do you want to filter with the Category ? y/n");
						ch=scn.next().charAt(0);

						List<Filter> fList=null;
						if(ch=='y'||ch=='Y') {
							System.out.println("Enter the Category");
							String category=scn.next();
							fList=filterList.stream().filter(f-> f.getCategory().equals(category)).collect(Collectors.toList());
						}
						System.out.println("do you want to filter with the Rate? y/n");
						ch=scn.next().charAt(0);

						if(ch=='y'||ch=='Y') {
							System.out.println(" Enter max value ");
							double maxRate=scn.nextDouble();
							System.out.println(" Enter min value ");
							double minRate=scn.nextDouble();
							fList=filterList.stream().filter(f->f.getRate()>=maxRate&& f.getRate()<minRate).collect(Collectors.toList());
						}
						System.out.println("do you want to filter with the DateOfPurchase? y/n");
						ch=scn.next().charAt(0);
						if(ch=='y'||ch=='Y') {
							System.out.println(" Enter From Date ");
							String fromDate=scn.next();

							java.util.Date fDate = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);

							System.out.println(" Enter To Date ");
							String toDate=scn.next();

							java.util.Date  tDate = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
							fList=filterList.stream().filter(f->f.getDateOfPurchase().compareTo(fDate) > 0&&f.getDateOfPurchase().compareTo(tDate) < 0).collect(Collectors.toList());		
						}
						
							fList.stream().distinct().toList().forEach(fL->System.out.println(fL))	;

						}
					catch(Exception e) {
						e.printStackTrace();
					}
				}*/
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

