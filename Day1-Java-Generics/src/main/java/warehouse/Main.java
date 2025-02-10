package warehouse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 75000, 24));
        electronicsStorage.addItem(new Electronics("Smartphone", 45000, 12));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 50, "2025-02-20"));
        groceriesStorage.addItem(new Groceries("Bread", 40, "2025-02-15"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2000, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 5000, "Metal"));

        System.out.println("Electronics Items:");
        electronicsStorage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Items:");
        groceriesStorage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Items:");
        furnitureStorage.displayItems(furnitureStorage.getItems());
    }
}
