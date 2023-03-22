package com.company;

import java.sql.SQLOutput;

public class Bank {

    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void addMoneyToBalance(int addedMoney){
        System.out.println("Balance before: " + this.balance);
        if(addedMoney > 0) this.balance += addedMoney;
        System.out.println("Balance after: " + this.balance);
    }

    public void withdrawMoney(int withdrawedMoney){
        System.out.println("Balance before withdraw: " + this.balance);
        if(this.balance == 0) System.out.println("Your balance is equal 0");
        else if((this.balance - withdrawedMoney) < 0) System.out.println("Not enough money on your account");
        else
        {
            this.balance -= withdrawedMoney;
            System.out.println("Your balance afterr withdraw " + this.balance) ;
        }
    }



}
