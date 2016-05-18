package com.stevejamison;

import java.lang.*;
/**
 * Created by stevejaminson on 5/3/16.
 */
public class Transaction {

    private String transDate;
    private AccountType transAccType;
    private TransactionType transType;
    private double amount;
    private int sourceAccount;
    private int destinationAccount;


    public Transaction(String date, TransactionType transactionType, AccountType accType,
                       int sourceAcc, int destinationAcc, double amount) {

        this.transDate = date;
        this.transType = transactionType;
        this.transAccType = accType;
        this.amount = amount;
        this.sourceAccount = sourceAcc;
        this.destinationAccount = destinationAcc;
    }

    public int getSourceAccount() {
        return sourceAccount;
    }

    public int getDestinationAccount() {
        return destinationAccount;
    }

    public String getTransDate() {
        return transDate;
    }

    public AccountType getTransAccType() {
        return transAccType;
    }

    public TransactionType getTransType() {
        return transType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction Date: " + this.getTransDate() + "\n" +
                "Account Type: " + this.getTransAccType() + "\n" +
                "Transaction Type: " + this.getTransType() + "\n" +
                "Source Account: " + this.getSourceAccount() + "\n" +
                "Destination Account: " + this.getDestinationAccount() + "\n" +
                "Transaction Amount: " + this.getAmount() + "\n";
    }


    public void buildString() {
        StringBuilder str = new StringBuilder();
        str.append("Transaction Date: " + this.getTransDate() + "\n" +
                "Account Type: " + this.getTransAccType() + "\n" +
                "Transaction Type: " + this.getTransType() + "\n" +
                "Source Account: " + this.getSourceAccount() + "\n" +
                "Destination Account: " + this.getDestinationAccount() + "\n" +
                "Transaction Amount: " + this.getAmount() + "\n");
        System.out.println(str);

    }
}
