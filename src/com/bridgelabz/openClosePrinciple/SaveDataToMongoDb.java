package com.bridgelabz.openClosePrinciple;

public class SaveDataToMongoDb implements ProductRepository{
    @Override
    public void saveData() {
        System.out.println("Storing data into MongoDb!!");
    }
}
