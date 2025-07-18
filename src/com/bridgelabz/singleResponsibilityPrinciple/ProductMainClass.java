package com.bridgelabz.singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class ProductMainClass {
   static CartInvoicePrinter cartInvoicePrinter=new CartInvoicePrinter();
     static  ShoppingCart shoppingCart=new ShoppingCart();
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        Product P1=new Product("Laptop",455500);
        Product P2=new Product("Mobile",95500);
        Product P3=new Product("Sunscream",500);
        Product P4=new Product("Lipstick",900);
        Product P5=new Product("Shoe",5500);

        productList.add(P1);
        productList.add(P2);
        productList.add(P3);
        productList.add(P4);
        productList.add(P5);

        int total=shoppingCart.calculateTotalPrice(productList);
        System.out.println("TotalPrice of products:"+total);
        cartInvoicePrinter.invoicePrinter(productList);







    }
}
