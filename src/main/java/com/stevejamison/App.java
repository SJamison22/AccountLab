package com.stevejamison;

/**
 * Created by stevejaminson on 5/3/16.
 */
public class App {



    public static void main(String[] args) {
        BankAccount testAcc = new BankAccount(AccountType.CHECKING,101, 50.50, "SteveJamison", 2.45, AccountStatus.OPEN, OverdraftProtection.ENABLED);
        Transaction testTrans = new Transaction("May 3", TransactionType.DEPOSIT, AccountType.CHECKING, 12345, 54321, 50.00);
        Transaction testTrans1 = new Transaction("May 4", TransactionType.DEPOSIT, AccountType.CHECKING, 56789, 98765, 45.95);



        System.out.println(testAcc.getAccountName());
        testAcc.list.add(testTrans);
        testAcc.list.add(testTrans1);
        testAcc.makeNewAccount();

    }
}
