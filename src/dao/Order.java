package dao;

import java.util.*;

public class Order {

    private Map<Integer, OrderLine> lines;
    private Client client;
    private double totalAmount;
    private boolean isPaid;

    public Order(Client client) {
        this.client = client;
        this.lines = new HashMap<>();
    }

    public int addLine(Product product, int units) {
        totalAmount += product.getPrice() * units;
        OrderLine line = new OrderLine(product, units);
        lines.put(line.getLineId(), line);

        return line.getLineId();
    }

    public OrderLine removeLine(int lineId) {
        return lines.remove(lineId);
    }

    public void pay() {
        isPaid = true;
    }

    public Map<Integer, OrderLine> getLines() {
        return Collections.unmodifiableMap(lines);
    }

    public Client getClient() {
        return client;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
