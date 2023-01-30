package com.jpa.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.jpa.dao.ProductDao;
import com.jpa.entities.Product;


public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product product;
		System.out.println("enter the product code :");
		String productCode = sc.next();
		System.out.println("enter the productName : ");
		sc.nextLine();
		String productName = sc.nextLine();
		System.out.println("enter the catagory :");
		String category = sc.next();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		 ProductDao productDao = context.getBean("productDaoBean",ProductDao.class);
		 productDao.createProduct(productCode, productName, category, null, null);
	}

}
