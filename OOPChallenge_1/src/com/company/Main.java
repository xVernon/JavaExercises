package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic Hamburger","normal", 5, "Bread Roll Type");
        HealthyBurger hBurger = new HealthyBurger("Sausage",4);

        System.out.println(hamburger.getName());
        System.out.println(hamburger.getBasePrice());

        System.out.println(hBurger.getName());
        System.out.println(hBurger.getBasePrice());

        hBurger.addHamburgerAdditional1("Salad", 0.20);
        hBurger.addHamburgerAdditional2("Tomato", 0.30);

        System.out.println(hBurger.getAddedAdditionals());
        System.out.println(hBurger.getSumOfAdditionals());
        System.out.println(hBurger.finallPrice());


    }
}
