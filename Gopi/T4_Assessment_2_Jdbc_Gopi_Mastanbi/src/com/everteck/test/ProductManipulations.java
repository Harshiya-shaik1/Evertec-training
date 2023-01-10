package com.everteck.test;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.everteck.entity.Product;
import com.everteck.entity.PurchaseProduct;
import com.everteck.jdbcConnection.JdbcConnection;

public class ProductManipulations {
	static JdbcConnection jdbccont;

	public static void main(String[] args) {

		
			Product product;
			PurchaseProduct purchaseProduct;
			String productCode;

			Scanner sc = new Scanner(System.in);

			
			SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");

			while (true) {
				try {
					jdbccont = new JdbcConnection();
				System.out.println("enter the your choice \n 1 menu: for create product  ");
				System.out.println("\n 2 menu : for create purchase product");
				System.out.println("\n 3 menu : for view all details");
				System.out.println("\n 4 menu :for view details based on purchase date");
				System.out.println("\n 5 menu : for view details based on total ammount");
				System.out.println("\n 6 menu : for edit product");
				System.out.println("\n 7 menu : for delete product");
				System.out.println("\n 8 menu: for filter");
				int a = sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("enter the product code :");
					productCode = sc.next();
					if (productCode.charAt(0) != 'P') {
						throw new UserDefinedException("the first letter should be start with 'P'");
					}
					if (productCode.length() != 4) {
						throw new UserDefinedException("the product code length should be 4");
					}

					System.out.println("enter the productName : ");
					sc.nextLine();
					String productName = sc.nextLine();
					System.out.println("enter the catagory :");
					String category = sc.next();
					product = new Product(productCode, productName, category, new Date(System.currentTimeMillis()),
							null);
					System.out.println(" Do you want to create Product Y/n: ");
					String y = sc.next();
					if (y.charAt(0) == 'y') {
						jdbccont.saveProduct(product);
					}
					break;

				case 2:

					System.out.println("enter product code : ");
					productCode = sc.next();

					Product prod = jdbccont.getProduct(productCode);
					if (prod == null) {
						throw new UserDefinedException("please enter valid product code : ");

					}

					if (prod.getProductCode() != null) {
						System.out.println("enter the quantity : ");
						int quantity = sc.nextInt();
						System.out.println("enter rate : ");
						double rate = sc.nextDouble();

						purchaseProduct = new PurchaseProduct(0, productCode, quantity, rate,
								new Date(System.currentTimeMillis()),new Date (System.currentTimeMillis()));
						System.out.println("Do you want to purchase the Product Y/n: ");
						String yes = sc.next();

						if (yes.charAt(0) == 'y') {
							jdbccont.savePurchaseProduct(purchaseProduct);
						}

					} else {
						System.out.println("Product not found");
					}
					break;
				case 3:
					
					List<Product> products = jdbccont.getProducts();
			        List<PurchaseProduct> pps = jdbccont.getDetails(products);
					String code = "";
					String cata = "";
					System.out.println(
							"Product code | product name | average price | total quantity | average stock amount ");
					for (PurchaseProduct pp : pps) {

						Product p = products.stream().filter(id -> id.getProductCode().equals(pp.getProductCode()))
								.findAny().orElse(null);

						if (p!=null&&!p.getProductCode().equals(code)) {
							if(!p.getCategory().equals(cata)) {
							System.out.println("catagory: " + p.getCategory());
							}
							double sum = pps.stream().filter(pdc -> pdc.getProductCode().equals(p.getProductCode()))
									.mapToDouble(i -> i.getRate()).sum();
							int totq = pps.stream().filter(j -> j.getProductCode().equals(p.getProductCode()))
									.mapToInt(k -> k.getQuantity()).sum();
							System.out.println(p.getProductCode() + " | " + p.getProductName() + " | "
									+ (sum * totq) / totq + "|" + totq + "|" + sum * totq);
							code = pp.getProductCode();
							cata=p.getCategory();
						}
					}
					break;
				case 4:
					System.out.println("enter product code : ");
					productCode = sc.next();
					Product p4 = jdbccont.getProduct(productCode);
					if (p4 == null) {
						throw new UserDefinedException("please enter valid product code");

					}
					List<PurchaseProduct> pp1 = jdbccont.getDetailsBasedOnPurchaseDate(productCode);
					System.out.println("purchaseDate | quatity | rate | total ammount");
					for (PurchaseProduct p : pp1) {

						double totalaAmmount = p.getRate() * p.getQuantity();
						System.out.println(p.getPurchasedate() + " | " + p.getQuantity() + "| " + p.getRate() + " | "
								+ totalaAmmount);

					}
					break;

				case 5:
					System.out.println("enter product code : ");
					productCode = sc.next();
					Product p1 = jdbccont.getProduct(productCode);
					if (p1 == null) {
						throw new UserDefinedException("please enter valid product code");

					}
					List<PurchaseProduct> pp12 = jdbccont.getDetailsBasedOnTotalAmmount(productCode);
					System.out.println("Product code | productName | purchaseDate | quatity | rate | total ammount");
					for (PurchaseProduct p : pp12) {

						double totalaAmmount = p.getRate() * p.getQuantity();
						System.out.println(productCode + " | " + p1.getProductName() + " | " + p.getPurchasedate()
								+ " | " + p.getQuantity() + "| " + p.getRate() + " | " + totalaAmmount);

					}
					break;

				case 6:
					System.out.println("enter productcode : ");
					productCode = sc.next();
					Product p2 = jdbccont.getProduct(productCode);
					if (p2 == null) {
						throw new UserDefinedException("please enter valid product code");

					}
					System.out.println("product code : " + p2.getProductCode());
					System.out.println("\n product name : " + p2.getProductName());
					System.out.println("\n catagory : " + p2.getCategory());
					System.out.println("Do you want to edit Y/n?: ");
					String ch = sc.next();
					if (ch.charAt(0) == 'y') {
						System.out.println("do you want edit product name y/n:");
						String epn=sc.next();
						if(epn.charAt(0)=='y') {
							System.out.println("enter the new name : ");
							String newName = sc.next();
							jdbccont.editProductNameByProductCode(productCode, newName);
						}
						
						System.out.println("do you want edit catagory y/n:");
						String epc=sc.next();
						if(epc.charAt(0)=='y') {
							System.out.println("enter new catagory : ");
							String newCatagory = sc.next();
							jdbccont.editProductCtagoryByProductCode(productCode,newCatagory );
						}
						
						
						p2 = jdbccont.getProduct(productCode);
						System.out.println("updated product details  ");
						System.out.println("product code : " + p2.getProductCode());
						System.out.println("\n product name : " + p2.getProductName());
						System.out.println("\n catagory : " + p2.getCategory());
					}

					break;

				case 7:
					System.out.println("enter productcode : ");
					productCode = sc.next();
					Product p3 = jdbccont.getProduct(productCode);
					if (p3 == null) {
						throw new UserDefinedException("please enter valid product code");

					}
					System.out.println("product code : " + p3.getProductCode());
					System.out.println("\n product name : " + p3.getProductName());
					System.out.println("\n catagory : " + p3.getCategory());
					System.out.println("Do you want to delete Y/n?: ");
					String ch1 = sc.next();
					if (ch1.charAt(0) == 'y') {
						jdbccont.deleteProduct(productCode);
						System.out.println("deleted successfully");
					}

					break;

				case 8:

//					List<PurchaseProduct> respp = new ArrayList<PurchaseProduct>();
//
//					System.out.println("you want filter with catagory y/n : ");
//					char che = sc.next().toLowerCase().charAt(0);
//					String cat = "";
//					if (che == 'y') {
//						System.out.println("enter catagory name : ");
//						cat = sc.next();
//					 String catagories = jdbccont.getDistinctCatagories(cat);
//						if (catagories.isEmpty()) {
//							throw new UserDefinedException("please enter valid catagory");
//						}
//					}
//					System.out.println("you want filter with date ranges y/n : ");
//					char cha = sc.next().toLowerCase().charAt(0);
//					java.sql.Date fromdate = null;
//					java.sql.Date todate = null;
//					if (cha == 'y') {
//						System.out.print("enter from date in the format of yyyy/MM/dd: ");
//						fromdate = new java.sql.Date(date.parse(sc.next()).getTime());
//						System.out.print("enter to  date in the format of yyyy/MM/dd: ");
//						todate = new java.sql.Date(date.parse(sc.next()).getTime());
//					}
//					System.out.println("you want filter with amount ranges y/n : ");
//					char chart = sc.next().toLowerCase().charAt(0);
//					double minamount = 0.0;
//					double maxamount = 0.0;
//					if (chart == 'y') {
//						System.out.println("enter min amount : ");
//						minamount = sc.nextDouble();
//						System.out.println("enter maxamount : ");
//						maxamount = sc.nextDouble();
//					}
//					respp = jdbccont.filterbyAllTheDetails(cat, fromdate, todate, minamount, maxamount);
//
//					System.out.println("Product code | productName | purchaseDate | quatity | rate | total ammount");
//					for (PurchaseProduct p : respp) {
//						Product tempProd = jdbccont.getProduct(p.getProductCode());
//						double totalaAmmount = p.getRate() * p.getQuantity();
//						System.out.println(
//								p.getProductCode() + " | " + tempProd.getProductName() + " | " + p.getPurchasedate()
//										+ " | " + p.getQuantity() + "| " + p.getRate() + " | " + totalaAmmount);
//
//	              }
					List<PurchaseProduct> respp = new ArrayList<>();
					List<Product> products1 = new ArrayList<>();
					List<PurchaseProduct> filterPurchase=new ArrayList<>();

					System.out.println("you want filter with catagory y/n : ");
					char che = sc.next().toLowerCase().charAt(0);
					String cat ;

					respp = jdbccont.getPurchaseProduct();
					products1 = jdbccont.getProducts();

					if (che == 'y') {
					System.out.println("enter catagory name : ");
					cat = sc.next();
					String catagories = jdbccont.getDistinctCatagories(cat);
					if (catagories.isEmpty()) {
					throw new UserDefinedException("please enter valid catagory");

					}
					List<Product> pro1 = products1.stream().filter(p -> p.getCategory().equals(cat))
					.collect(Collectors.toList());

					for (Product pr1 : pro1) {
					List<PurchaseProduct> pur = respp.stream()
					.filter(e1 -> e1.getProductCode().equals(pr1.getProductCode()))
					.collect(Collectors.toList());

					filterPurchase.addAll(pur);

					}


					}else {
					filterPurchase.addAll(respp);
					}
					System.out.println("you want filter with date ranges y/n : ");
					char cha = sc.next().toLowerCase().charAt(0);
					java.sql.Date fromdate ;
					java.sql.Date todate ;
					if (cha == 'y') {
					System.out.print("enter from date in the format of yyyy/MM/dd: ");
					fromdate = new java.sql.Date(date.parse(sc.next()).getTime());
					System.out.print("enter to date in the format of yyyy/MM/dd: ");
					todate = new java.sql.Date(date.parse(sc.next()).getTime());
					filterPurchase= filterPurchase.stream().filter(e3->e3.getPurchasedate().after(fromdate) && e3.getPurchasedate().before(todate)).collect(Collectors.toList());

					}

					System.out.println("you want filter with Amount ranges y/n : ");
					char chart = sc.next().toLowerCase().charAt(0);
					double minamount ;
					double maxamount ;
					if (chart == 'y') {
					System.out.println("enter min amount : ");
					minamount = sc.nextDouble();
					System.out.println("enter maxamount : ");
					maxamount = sc.nextDouble();
					filterPurchase= filterPurchase.stream().filter(e3->e3.getQuantity()*e3.getRate()>=minamount && e3.getQuantity()*e3.getRate()<=maxamount).collect(Collectors.toList());

					}

					// respp = jdbccont.filterbyAllTheDetails(cat, fromdate, todate, minamount,
					// maxamount);

					System.out.println("Product code | productName | purchaseDate | quatity | rate | total ammount");
					for (PurchaseProduct p :filterPurchase) {
					Product tempProd = jdbccont.getProduct(p.getProductCode());
					double totalaAmmount = p.getRate() * p.getQuantity();
					System.out.println(
					p.getProductCode() + " | " + tempProd.getProductName() + " | " + p.getPurchasedate()
					+ " | " + p.getQuantity() + "| " + p.getRate() + " | " + totalaAmmount);

					}
					break;

				}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		

	}

}
