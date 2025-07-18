package com.bridgelabz.liskovSubsitute.Principle;

public class BankDemo {
    public static void main(String[] args) {
        Account saving=new SavingAccount(1000);
        Account current=new CurrentAccount(2000);
        Account fd  = new FixedDepositAccount(50000);
    }
}
