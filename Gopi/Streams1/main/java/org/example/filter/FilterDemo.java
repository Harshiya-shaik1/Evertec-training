package org.example.filter;

import java.util.ArrayList;

class Product{
    int id;
    String brand;
    int price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int id, String brand, int price) {
        this.id = id;
        this.brand=brand;
        this.price=price;


    }
}

public class FilterDemo {
    public static void main(String[] args) {

        ArrayList<Product> Pl=new ArrayList<>();
        Pl.add(new Product(1,"hp",25000));
        Pl.add(new Product(2,"dell",50000));
        Pl.add(new Product(3,"acecr",30000));
        Pl.add(new Product(4,"apple",80000));
        Pl.add(new Product(5,"msi",40000));
        Pl.stream().filter(l->l.price>30000).forEach(l-> System.out.println(l));
    }
}
