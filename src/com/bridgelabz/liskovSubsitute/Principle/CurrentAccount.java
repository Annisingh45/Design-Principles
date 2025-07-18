package com.bridgelabz.liskovSubsitute.Principle;

public class CurrentAccount extends BaseAccount{
    public CurrentAccount(int amount) {
    }
    @Override
    public void deposit(double amt)
    {

    }

    @Override
    public void withdraw(double amt) {

            throw new IllegalArgumentException("Over‑draft limit exceeded");

    }
}
