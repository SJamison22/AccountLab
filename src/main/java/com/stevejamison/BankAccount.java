package com.stevejamison;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by stevejaminson on 5/2/16.
 */
public class BankAccount {


    private AccountType accountType;
    private int accountNumber;
    private double accountBalance;
    private String accountName;
    private double accountIntRate;
    private AccountStatus accountStatus;
    private OverdraftProtection overdraftPrev;
    private static int newAccountNum = 1000;
    public ArrayList<Object> list;
    private static int accountID;


    public ArrayList<Object> getList() {
        System.out.println(list);
        return list;
    }

    public void setList(ArrayList<Object> list) {
        this.list = list;
    }

    public BankAccount(AccountType type, int number, double bal,
                       String name, double rate, AccountStatus isOpen, OverdraftProtection overdraft){

        this.accountType = type;
        this.accountNumber = number;
        this.accountBalance = bal;
        this.accountName = name;
        this.accountIntRate = rate;
        this.accountStatus = isOpen;
        this.overdraftPrev = overdraft;
        this.list = new ArrayList<Object>();

    }

    public void makeNewAccount(){

        String typeSelection = getString("Select an account type: ");
        int numberSelection = generateAccount();
        double balanceSelection = getDouble("Enter initial balance: ");
        String nameSelection = getString("Enter name: ");
        double interestSelection = getDouble("Enter interest rate: ");
        String statusSelection = getString("Select account status: ");
        String overdraftSelection = getString("Select overdraft protection: ");
        BankAccount accountID = new BankAccount(AccountType.valueOf(typeSelection), numberSelection, balanceSelection, nameSelection,
                interestSelection, AccountStatus.valueOf(statusSelection), OverdraftProtection.valueOf(overdraftSelection));
        System.out.println(accountID);
    }

    public String getString(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

    public double getDouble(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextDouble();
    }

    public void transfer(BankAccount transferFrom, BankAccount transferTo){

    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        if(this.accountStatus != AccountStatus.CLOSED) {
            this.accountName = accountName;
        }
    }

    public double getAccountIntRate() {
        return this.accountIntRate;
    }

    public void setAccountIntRate(double accountIntRate) {
        this.accountIntRate = accountIntRate;
    }

    public AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public OverdraftProtection getOverdraftPrev() {
        return this.overdraftPrev;
    }

    public void setOverdraftPrev(OverdraftProtection overdraftPrev) {
        this.overdraftPrev = overdraftPrev;
    }

    public int getBalance(){
        return this.getBalance();
    }

    public void creditBalance(double amount){
        if(this.accountStatus == AccountStatus.OPEN) {
            this.accountBalance += amount;
        } else {
            outPut("Cannot change the balance of a " + this.accountStatus + " account.");
        }
    }

    public void debitBalance(double amount){
        if(this.accountStatus == AccountStatus.OPEN)
        this.accountBalance -= amount;
    }

    public void outPut(String msg){
        System.out.println(msg);
    }

    public void promptInput(){
        outPut("Choose an option: ");
    }

    public void transferFunds(){

    }

    public void closeAccount(){
        if(this.accountBalance == 0) {
            this.accountStatus = AccountStatus.CLOSED;
        } else {
            outPut("Account must have a zero balance before it can be closed.");
        }
    }

    public int generateAccount(){
        newAccountNum += 1;
        this.accountNumber = newAccountNum;
        return newAccountNum;
    }

    public int newAccountID(){
        accountID += 1;
        return accountID;
    }

    /**
     * Driver
     */
    public void run(){

    }
}
