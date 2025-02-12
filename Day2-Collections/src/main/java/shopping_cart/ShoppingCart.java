package shopping_cart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cartItems = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedByPrice = new TreeMap<>();

    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    public void addToCart(String productName, int quantity) {
        if (!productPrices.containsKey(productName)) {
            System.out.println("Product not found: " + productName);
            return;
        }
        cartItems.put(productName, cartItems.getOrDefault(productName, 0) + quantity);
        sortedByPrice.put(productPrices.get(productName), productName);
    }

    public void displayCart() {
        System.out.println("\nCart Items (Insertion Order): " + cartItems);
        System.out.println("Products Sorted by Price: " + sortedByPrice);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }
}
