package by.itstep.julja8806.model.entity;

public class Block extends PlayRoom.Toy {
    private double cost;
    private double weight;
    private String brand;

    public Block() {
    }

    public Block(double cost, double weight, String brand) {
        this.cost = cost;
        this.weight = weight;
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return brand + ": Brand = " + brand;
    }
}
