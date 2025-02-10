package dynamicmarketplace;

public class DynamicMarketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Discount applied! New price: " + product.getPrice());
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("The Alchemist", 500, new BookCategory("Fiction"));
        Product<ClothingCategory> clothing = new Product<>("T-Shirt", 800, new ClothingCategory("Casual"));
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 15000, new GadgetCategory("TechBrand"));

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);

        applyDiscount(book, 10);
        applyDiscount(clothing, 15);
        applyDiscount(gadget, 20);

        System.out.println("After Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);
    }
}
