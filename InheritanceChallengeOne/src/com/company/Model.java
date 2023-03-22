package com.company;

public class Model extends Car{

    private String modelName;
    private int doors;
    private double engine;

    public Model(String typOfVehicle, int tires, double weight, String typOfCar, int numberOfDoors, double cost, String modelName, int doors, double engine) {
        super(typOfVehicle, tires, weight, typOfCar, numberOfDoors, cost);
        this.modelName = modelName;
        this.doors = doors;
        this.engine = engine;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
