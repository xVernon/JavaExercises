package com.company;

public class Main {

    public static void main(String[] args) {

        //Bank bankAccount = new Bank();
        //bankAccount.setAccountNumber("1234567890");
        //bankAccount.setBalance(1234);
        //bankAccount.setCustomerName("Mateusz Kuba");
        // bankAccount.setEmail("mkuba9261@gmail.com");
        //bankAccount.setPhoneNumber("662585037");

        //System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getBalance() + " " + bankAccount.getCustomerName() + " " + bankAccount.getEmail() + " " + bankAccount.getPhoneNumber());
        //bankAccount.addMoneyToBalance(300);
        //bankAccount.withdrawMoney(534);


        VipCustomer vipCustomer = new VipCustomer();

        System.out.println(vipCustomer.getCreditLimit() + " " + vipCustomer.getEmail() + " " + vipCustomer.getName());

        VipCustomer vip = new VipCustomer("Matthew", 999, "mkuba9261@gmail.com");

        System.out.println(vip.getName() + " " + vip.getCreditLimit() + " " + vip.getEmail());

        VipCustomer vip2 = new VipCustomer("Lukas", "lukas.jankowski@gmail.com");

        System.out.println(vip2.getName() + " " + vip2.getCreditLimit() + " " + vip2.getEmail());
    }
}
