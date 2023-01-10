package product;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
//import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//import javax.naming.InitialContext;

public class MainClass {
	public Connection init() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "vamshi33333");
		return con;
	}
	public static void main(String[] args) throws Exception {

		MainClass ms = new MainClass();
		Connection con = null;
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("Enter any of the following  Key\n1. Create Product      2. Purchase Product \n"
					+ "3. View all product    4. view product based on purchase date \n"
					+ "5. view product by Total Amount    6. Edit product \n"
					+ "7. Delete product     8. Filter Product by category, purchaseDate, Amount");
			System.out.println("Press 0 to close the App");
			int button = sc.nextInt();
			if(button==0) {
				System.out.println("App Closed");
				break;
			}

			try {

				switch (button) {
				case 1:// Create Product
					System.out.print("Enter Product Code : ");
					String pcode = sc.next();
					if (!Pattern.matches("P[0-9]{4}", pcode)) {

						throw new Exception("ArgumentException : Please enter Proper product code");
					}

					System.out.print("Enter Product Name : ");
					String pname = sc.next();
					if (pname.isEmpty()) {

						throw new Exception("ArgumentException : product name cannot be blank");
					}

					System.out.print("Enter its Category: ");
					String cat = sc.next();
					System.out.println("Do you want to save in database y/n ?");
					String c = sc.next("[y|Y|N|n]");
					if (c.equalsIgnoreCase("y")) {
						con = ms.init();
						PreparedStatement p = con.prepareStatement("insert into product (p_code,p_name,category,created_date,updated_date) values('"
								+ pcode + "','" + pname + "','" + cat + "','" + new Timestamp(System.currentTimeMillis())
								+ "',null);");
						p.executeUpdate();
						System.out.println("Product inserted into Database successfully");
					}
					//con.close();

					break;
				case 2: // Purchase Product
					System.out.print("Enter the product code : ");
					String ppc = sc.next();
					if (!Pattern.matches("P[0-9]{4}", ppc)) {

						throw new Exception("ArgumentException : INVALID PRODUCT CODE , Please enter Proper product code");
					}
					String query = "select p_code from product where p_code='" + ppc + "';";

					con = ms.init();
					ResultSet p = con.createStatement().executeQuery(query);
					String pcode2 = new String();
					while (p.next()) {
						pcode2 = p.getString(1);
					}
					if (pcode2.equals("")) {
						throw new Exception("Entered product does'nt exist ");
					}

					System.out.print("Enter Quantity : ");
					int qt = sc.nextInt();
					System.out.print("Enter Rate : ");
					double rt = sc.nextDouble();
					System.out.print("\nEnter Date of Purchase in (dd-mmm-yyyy) format only: ");
					String date = sc.next();
					if (!Pattern.matches("[0-9]{2}-[A-Za-z]{3}-[0-9]{4}", date))
						throw new Exception("ArgumentException : Please enter Date in proper given format");
					DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
					LocalDate dt=LocalDate.parse(date,formater);

					System.out.println("Do you want to purchase product y/n ?");
					String c2= sc.next("[y|Y|N|n]");
					if (c2.equalsIgnoreCase("y")) {
						PreparedStatement p2 = con.prepareStatement("insert into purchase (p_code,quantity,rate,purchase_date,createdAt) "
								+ "values('" + ppc + "'," + qt + "," + rt + ",'" + dt + "','"+ new Timestamp(System.currentTimeMillis())+"');");
						p2.executeUpdate();
						System.out.println("Purchase has been done");
					}

					break;

				case 3:// View all product
					con=ms.init();
					ResultSet rs =con.createStatement().executeQuery("select distinct category from product");
					while(rs.next()){
						String category = rs.getString("category");
						System.out.println("Category: "+ category);
						System.out.println("Product Code\tProduct Name\t Average price\t total quantity\tAverage Stock Price");
						ResultSet rs2 =con.createStatement().executeQuery(
								"select \r\n"
										+ "		p.p_code, \r\n"
										+ "        p.p_name, \r\n"
										+ "        sum(o.rate*o.quantity) as quan_rate,\r\n"
										+ "        sum(o.quantity) as total_quantity\r\n"
										+ "	from product p, purchase o\r\n"
										+ "    where \r\n"
										+ "		o.p_code=p.p_code\r\n"
										+ "		and p.category='"+category+"'\r\n"
										+ "    group by p_code");
						while(rs2.next()){
							double average_Price = rs2.getDouble("quan_rate")/rs2.getDouble("total_quantity");
							double average_Stock_Amount = average_Price * rs2.getDouble("total_quantity");
							System.out.println(rs2.getString("p_code")+"\t\t"+rs2.getString("p_name")+"\t\t"
									+average_Price+"\t\t"+rs2.getDouble("total_quantity")+"\t\t"+average_Stock_Amount);
						}
					}
					//con.close();

					break;

				case 4:// view product based on purchase date
					System.out.print("Enter Product Code : ");
					String pc4 = sc.next();
					if (!Pattern.matches("P[0-9]{4}", pc4)) {

						throw new Exception("ArgumentException : INVALID PRODUCT CODE ,Please enter Proper product code");
					}
					con=ms.init();
					ResultSet rs4 =con.createStatement().executeQuery(
							"select purchase_date, quantity, rate, (quantity*rate) as total_amount\r\n"

						+ " from purchase\r\n"

						+ " where p_code = '"+pc4+"'\r\n"

						+ " order by purchase_date desc");

					System.out.println("Purchase Date\t Quantity\t Rate\t Total Amount");

					while(rs4.next()){

						System.out.println(rs4.getString("purchase_date")+"\t\t"+rs4.getDouble("quantity")

						+"\t\t"+rs4.getDouble("rate")+"\t\t"+rs4.getDouble("total_amount"));

					}
					//con.close();

					break;

				case 5:// view product by Total Amount
					System.out.print("Enter Product Code : ");
					String pc5 = sc.next();
					if (!Pattern.matches("P[0-9]{4}", pc5)) {
						throw new Exception("ArgumentException : INVALID PRODUCT CODE ,Please enter Proper product code");
					}
					con=ms.init();
					ResultSet rs5 =con.createStatement().executeQuery(

							"select p.p_code ,p.p_name,pp.purchase_date, pp.quantity, rate, (quantity*rate) as total_amount\r\n"
							//select purchase_date, quantity, rate, (quantity*rate) as total_amount

							+ " from purchase pp, product p\r\n"

						+ " where pp.p_code = '"+pc5+"'\r\n"

						+ " and p.p_code=pp.p_code\r\n"

						+ " order by total_amount desc");

					System.out.println("Purchase Date\tName\t Quantity\t Rate\t Total Amount");

					while(rs5.next()){

						System.out.println(rs5.getString("p_code")+"\t"+rs5.getString("p_name")+"\t"+rs5.getString("purchase_date")+"\t"+rs5.getDouble("quantity")+"\t"+rs5.getDouble("rate")+"\t"+rs5.getDouble("total_amount"));
					}

					break;

				case 6:// Edit product
					System.out.println("Enter product code to Edit ");
					String pc6 = sc.next();
					if (!Pattern.matches("P[0-9]{4}", pc6)) {
						throw new Exception("ArgumentException : Please enter Proper product code");
					}
					con=ms.init();
					String query6="select p_code,p_name,category from product where p_code='"+pc6+"';";
					ResultSet r6 = con.createStatement().executeQuery(query6);
					ResultSet rs6=con.createStatement().executeQuery(query6);
					System.out.println("Prodcut code\tProduct Name\tCategory");
					if(rs6.next()) {
						System.out.println(rs6.getString("p_code")+"\t"+rs6.getString("p_name")+"\t"+rs6.getString("category"));
					}else{
						throw new Exception("Product code does'nt exist in Database");
					}
					System.out.println("do you want to edit y\n");
					String c6 = sc.next("[y|Y|N|n]");
					if (c6.equalsIgnoreCase("y")) {
						if(r6.next()) {
							System.out.println("Field\tOld value\tNew value");
							System.out.print("Product name\t"+r6.getString("p_name")+"\t");
							String product_new=sc.next();
							System.out.println();
							System.out.print("Category\t"+r6.getString("category")+"\t");
							String cat_new=sc.next();
							System.out.println("Do you want to store edited values");
							String c7 = sc.next("[y|Y|N|n]");
							if (c7.equalsIgnoreCase("y")) {
								String querys6=" update product set p_name='"+product_new+"',category='"+cat_new+"',updated_date='"+new Timestamp(System.currentTimeMillis())+"' where p_code='"+pc6+"';";
								PreparedStatement pst6=con.prepareStatement(querys6);
								pst6.executeUpdate();
								System.out.println("\nTable Updated successfully");
							}
						}
						System.out.println("edited value did not stored");
					}
					//con.close();

					break;

				case 7:// Delete product
					System.out.println("Enter product code to delete : ");
					String pc7 = sc.next();
					if (!Pattern.matches("P[0-9]{4}", pc7)) {
						throw new Exception("ArgumentException : Please enter Proper product code");
					}
					con=ms.init();
					String query7="select p_code,p_name,category from product where p_code='"+pc7+"';";
					ResultSet rs7 = con.createStatement().executeQuery(query7);
					if(rs7.next()) {
						System.out.println("Prodcut code\tProduct Name\tCategory");
						System.out.println(rs7.getString("p_code")+"\t"+rs7.getString("p_name")+"\t"+rs7.getString("category"));
					}else {
						throw new Exception("Product code doesn't exist to delete");
					}
					System.out.println("Do you want to delete y/n");
					String c7 = sc.next("[y|Y|N|n]");
					if(c7.equalsIgnoreCase("y")) {

						Statement smt =con.createStatement();
						smt.executeUpdate("delete from purchase where p_code='" + pc7 + "'");
						System.out.println();

						int row=smt.executeUpdate("delete from product where p_code='" + pc7 + "'");
						if(row>0) {
							System.out.println("Product " + pc7 + " got deleted");

						}
					}


					break;

				case 8:// Filter Product by category, purchaseDate, Amount
					
					con=ms.init();
					Statement st= con.createStatement();
					char ch;
					try {
						String sqlQuery="select p.p_code,p.p_name,p.category,pp.purchase_date,pp.quantity,pp.rate,(pp.quantity*pp.rate) as Total_Amount from product p, purchase pp\r\n"
								+ "where p.p_code=pp.p_Code ";
						
						rs=st.executeQuery(sqlQuery);
						List<Filter> filterList=new ArrayList<>();
						while(rs.next()) {
							Filter obj=new Filter(rs.getString("p_code"), 
									rs.getString("p_name"),
									rs.getString("category"),
									rs.getDate("purchase_date"), 
									rs.getDouble("quantity"),
									rs.getDouble("rate"),
									rs.getDouble("Total_Amount"));
							filterList.add(obj);

						}

						System.out.println("do you want to filter with the Category ? y/n");
						ch=sc.next().charAt(0);

						List<Filter> fList=null;
						if(ch=='y'||ch=='Y') {
							System.out.println("Enter the Category");
							String category=sc.next();
							fList=filterList.stream().filter(f-> f.getCategory().equals(category)).collect(Collectors.toList());
						}
						System.out.println("do you want to filter with the Rate? y/n");
						ch=sc.next().charAt(0);

						if(ch=='y'||ch=='Y') {
							System.out.println(" Enter max value ");
							double maxRate=sc.nextDouble();
							System.out.println(" Enter min value ");
							double minRate=sc.nextDouble();
							fList=filterList.stream().filter(f->f.getRate()>=maxRate&& f.getRate()<minRate).collect(Collectors.toList());
						}
						System.out.println("do you want to filter with the DateOfPurchase? y/n");
						ch=sc.next().charAt(0);
						if(ch=='y'||ch=='Y') {
							System.out.println(" Enter From Date ");
							String fromDate=sc.next();

							java.util.Date fDate = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);

							System.out.println(" Enter To Date ");
							String toDate=sc.next();

							java.util.Date  tDate = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
							fList=filterList.stream().filter(f->f.getDateOfPurchase().compareTo(fDate) > 0&&f.getDateOfPurchase().compareTo(tDate) < 0).collect(Collectors.toList());		
						}
						
						 fList.stream().distinct().toList().forEach(fL->System.out.println(fL));
						 
						 }
					catch(Exception e) {
						e.printStackTrace();
					}

					break;
				default:
					System.err.println("INVALID KEY \nPlease Enter valid Above key");
					break;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}



}
