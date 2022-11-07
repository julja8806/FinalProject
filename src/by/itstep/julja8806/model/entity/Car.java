package by.itstep.julja8806.model.entity;

public class Car extends PlayRoom.Toy {
    private double cost;
    private double weight;
    private String brand;

    public Car() {
    }

    public Car(double cost, double weight, String brand) {
        this.cost = cost;
        this.weight = weight;
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return brand + ": Brand = " + brand;
    }
}
