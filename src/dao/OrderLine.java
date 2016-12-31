package dao;

public class OrderLine {

    private static int id;

    private int lineId;
    private Product product;
    private int units;

    public OrderLine(Product product, int units) {
        this.product = product;
        this.units = units;
        this.lineId = id;
        id++;
    }

    public int getLineId() {
        return lineId;
    }

    public Product getProduct() {
        return product;
    }

    public int getUnits() {
        return units;
    }

    public double getPrice() {
        return product.getPrice() * units;
    }
}
