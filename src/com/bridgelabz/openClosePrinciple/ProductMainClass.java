package com.bridgelabz.openClosePrinciple;

import com.bridgelabz.singleResponsibilityPrinciple.CartInvoicePrinter;
import com.bridgelabz.singleResponsibilityPrinciple.Product;
import com.bridgelabz.singleResponsibilityPrinciple.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ProductMainClass {
   static CartInvoicePrinter cartInvoicePrinter=new CartInvoicePrinter();
     static ShoppingCart shoppingCart=new ShoppingCart();
    public static void main(String[] args) {
        List<com.bridgelabz.singleResponsibilityPrinciple.Product> productList=new ArrayList<>();
        com.bridgelabz.singleResponsibilityPrinciple.Product P1=new com.bridgelabz.singleResponsibilityPrinciple.Product("Laptop",455500);
        com.bridgelabz.singleResponsibilityPrinciple.Product P2=new com.bridgelabz.singleResponsibilityPrinciple.Product("Mobile",95500);
        com.bridgelabz.singleResponsibilityPrinciple.Product P3=new com.bridgelabz.singleResponsibilityPrinciple.Product("Sunscream",500);
        com.bridgelabz.singleResponsibilityPrinciple.Product P4=new com.bridgelabz.singleResponsibilityPrinciple.Product("Lipstick",900);
        com.bridgelabz.singleResponsibilityPrinciple.Product P5=new Product("Shoe",5500);

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
