package com.bridgelabz.openClosePrinciple;

public class SaveDataToFile implements ProductRepository{
    @Override
    public void saveData() {
        System.out.println("Storing data into file!!!");
    }
}
