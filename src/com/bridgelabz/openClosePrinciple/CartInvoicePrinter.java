package com.bridgelabz.openClosePrinciple;

import com.bridgelabz.singleResponsibilityPrinciple.Product;
import com.bridgelabz.singleResponsibilityPrinciple.ShoppingCart;

import java.util.List;

public class CartInvoicePrinter {
    com.bridgelabz.singleResponsibilityPrinciple.ShoppingCart shoppingCart=new ShoppingCart();
    public void invoicePrinter(List<com.bridgelabz.singleResponsibilityPrinciple.Product> productList)
    {
        System.out.println("Product Invoice!!!");
        System.out.println("TotalNumber Of Product:"+productList.size());
        for (Product p:productList)
        {
            System.out.println(p.getProductName()+" "+p.getProductPrice());
        }
        int total=shoppingCart.calculateTotalPrice(productList);
        System.out.println("total price:"+total);
    }
}
