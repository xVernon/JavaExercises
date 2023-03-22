package com.company;

public class Vehicle {

    private String typOfVehicle;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String typOfVehicle, String size) {
        this.typOfVehicle = typOfVehicle;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Current direction = " + direction);
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction: " + currentDirection);
    }

    public String getTypOfVehicle() {
        return typOfVehicle;
    }

    public void setTypOfVehicle(String typOfVehicle) {
        this.typOfVehicle = typOfVehicle;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
