package dao;

public class Client {

    private String name;
    private float percentage;

    public Client(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public float getPercentage() {
        return percentage;
    }
}
