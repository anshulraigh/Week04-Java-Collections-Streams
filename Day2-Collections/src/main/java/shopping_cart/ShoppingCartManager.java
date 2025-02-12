package shopping_cart;

public class ShoppingCartManager {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 800.0);
        cart.addProduct("Phone", 500.0);
        cart.addProduct("Tablet", 300.0);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Tablet", 1);

        cart.displayCart();
        System.out.println("\nTotal Price: $" + cart.calculateTotal());
    }
}
