package com.company;

public class DeluxBurger extends Hamburger{
    public DeluxBurger(String name, String meat, double basePrice, String rollType) {
        super("Delux Burger", meat, 9, rollType);
    }

    private final String additional1Name = "Chips";

    private final String additional2Name = "Drink";

    private final String addedAdditionals = additional1Name + " " + additional2Name;

    @Override
    public String getAddedAdditionals() {
        return addedAdditionals;
    }
}
