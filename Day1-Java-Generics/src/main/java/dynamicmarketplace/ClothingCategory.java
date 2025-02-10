package dynamicmarketplace;

public class ClothingCategory {
    private String type;

    public ClothingCategory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ClothingCategory{type='" + type + "'}";
    }
}
