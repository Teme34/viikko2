package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car() {
        brand = "Skoda";
        model = "Octavia";
        speed = 0;

    }

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    
    }

    public void accelerate(int acceleration) {
        speed = speed + acceleration;
        this.speed = speed;
    }

    public void decelerate(int deceleration) {
        speed = speed - deceleration;
        this.speed = speed;
    }

     public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    // 
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

       
}



