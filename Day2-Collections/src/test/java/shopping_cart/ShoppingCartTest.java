package shopping_cart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testAddProduct() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Headphones", 100.0);
        cart.addToCart("Headphones", 2);
        assertEquals(200.0, cart.calculateTotal());
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Mouse", 50.0);
        cart.addToCart("Mouse", 1);
        assertEquals(50.0, cart.calculateTotal());
    }
}
