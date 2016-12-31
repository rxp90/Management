package dao;

public abstract class Product {

    private double price;
    private double cost;
    private String name;

    public Product(double price, double cost, String name) {
        this.price = price;
        this.cost = cost;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public double getBenefit() {
        return getPrice() - getCost();
    }
}
