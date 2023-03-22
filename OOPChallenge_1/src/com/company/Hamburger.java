package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double basePrice;
    private String rollType;

    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;

    private final double sumOfAdditionals = additional1Price+additional2Price+additional3Price+additional4Price;
    private final String addedAdditionals = additional1Name + " " + additional2Name + " " + additional3Name + " " + additional4Name;

    public Hamburger(String name, String meat, double basePrice, String rollType) {
        this.name = name;
        this.meat = meat;
        this.basePrice = basePrice;
        this.rollType = rollType;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addHamburgerAdditional1(String name, double price){
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public void addHamburgerAdditional2(String name, double price){
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public void addHamburgerAdditional3(String name, double price){
        this.additional3Name = name;
        this.additional3Price = price;
    }

    public void addHamburgerAdditional4(String name, double price){
        this.additional4Name = name;
        this.additional4Price = price;
    }

    public double getSumOfAdditionals() {
        return sumOfAdditionals;
    }

    public String getAddedAdditionals() {
        return addedAdditionals;
    }

    public double finallPrice(){
        return sumOfAdditionals + this.basePrice;
    }
}
