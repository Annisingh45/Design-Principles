package com.bridgelabz.singleResponsibilityPrinciple;

import java.util.List;

public class CartInvoicePrinter {
    ShoppingCart shoppingCart=new ShoppingCart();
    public void invoicePrinter(List<Product> productList)
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
