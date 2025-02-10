package warehouse;

public class Electronics extends WarehouseItem {
    private int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty Period: " + warrantyPeriod + " months";
    }
}
