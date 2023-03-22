package com.company;

public class Main {

    static class Car{
        private int cylinders;
        private String name;
        private int wheels;
        private boolean engine;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
            this.engine = true;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

        public void startEngine(){
            System.out.println("Engine started");
        }

        public void accelerate(){
            System.out.println("Max speed");
        }

        public void brake(){
            System.out.println("Car stopped");
        }
    }

    static class Porsche extends Car{

        public Porsche(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine(){
            System.out.println("Porsche starting");
        }

        public void accelerate(){
            System.out.println("100km/h in 5seconds");
        }

        public void brake(){
            System.out.println("Porsche stopped");
        }
    }

    class Lamborghini extends Car{

        public Lamborghini(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine(){
            System.out.println("Lamborghini starting");
        }

        public void accelerate(){
            System.out.println("100km/h in 4seconds");
        }

        public void brake(){
            System.out.println("Lamborghini stopped");
        }
    }

    static class Ferrari extends Car{


        public Ferrari(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public void startEngine(){
            System.out.println("Ferrari starting");
        }

        public void accelerate(){
            System.out.println("100km/h in 7seconds");
        }

        public void brake(){
            System.out.println("Ferrari stopped");
        }
    }

    public static void main(String[] args) {

        Car car = new Car(4,"Maluch");
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println(car.getName());
        System.out.println(car.getCylinders());

        Porsche porsche = new Porsche(6,"Porsche");
        porsche.startEngine();
        porsche.accelerate();
        porsche.brake();
        System.out.println(porsche.getName());
        System.out.println(porsche.getCylinders());
    }
}
