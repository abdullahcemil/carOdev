package entities;

public class Product {
    private String id;
    private String model;
    private double unitPrice;

    public Product() {
    }

    public Product(String id, String model, double unitPrice) {
        this.id = id;
        this.model = model;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
