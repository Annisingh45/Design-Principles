package com.bridgelabz.openClosePrinciple;

public class SaveDataToSql implements ProductRepository{
    @Override
    public void saveData() {
        System.out.println("Saving data into sql database!!");
    }
}
