package dynamicmarketplace;

public class GadgetCategory {
    private String brand;

    public GadgetCategory(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "GadgetCategory{brand='" + brand + "'}";
    }
}
