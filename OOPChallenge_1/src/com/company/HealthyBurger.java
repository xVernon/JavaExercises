package com.company;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meat, double basePrice) {
        super("HealthyBurger", meat, basePrice, "Brown rye bread");
    }

    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    @Override
    public void addHamburgerAdditional1(String name, double price){
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public void addHamburgerAdditional2(String name, double price){
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public double getSumOfAdditionals() {
        return additional1Price+additional2Price;
    }

    public String getAddedAdditionals() {
        return additional1Name + " " + additional2Name;
    }

    public double finallPrice(){
        return getBasePrice()+getSumOfAdditionals();
    }
}
