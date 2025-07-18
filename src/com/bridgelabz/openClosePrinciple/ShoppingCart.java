package com.bridgelabz.openClosePrinciple;

import com.bridgelabz.singleResponsibilityPrinciple.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Integer> l=new ArrayList<>();

    public int calculateTotalPrice(List<com.bridgelabz.singleResponsibilityPrinciple.Product> product)
    {
        int totalPrice=0;

        for(Product p:product)
        {
            totalPrice=totalPrice+ p.getProductPrice();
        }
        return totalPrice;

    }
}
