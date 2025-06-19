import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        if (products.containsKey(product.productId)) {
            System.out.println("Product already exists. Use update instead.");
        } else {
            products.put(product.productId, product);
            System.out.println("Product added: " + product);
        }
    }

    // Update product
    public void updateProduct(Product product) {
        if (products.containsKey(product.productId)) {
            products.put(product.productId, product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found. Use add instead.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        if (products.remove(productId) == null) {
            System.out.println("Product not found.");
        }
        System.out.println("Product deleted with ID: " + productId);
    }

    // Print all products
    public void printInventory() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
