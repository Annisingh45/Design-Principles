package com.bridgelabz.singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Integer> l=new ArrayList<>();

    public int calculateTotalPrice(List<Product> product)
    {
        int totalPrice=0;

        for(Product p:product)
        {
            totalPrice=totalPrice+ p.getProductPrice();
        }
        return totalPrice;

    }
}
