package com.bridgelabz.liskovSubsitute.Principle;

public class FixedDepositAccount extends BaseAccount{
    public FixedDepositAccount(int amount) {
    }

    @Override
    public void deposit(int amt) {
        throw new UnsupportedOperationException("Fixed‑deposit cannot be topped‑up");
    }



    @Override
    public void withdraw(int amt) {

            throw new IllegalArgumentException("Must withdraw the full amount at once");

    }

}
