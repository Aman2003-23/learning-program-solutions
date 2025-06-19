public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Sample data
        Product p1 = new Product(101, "Wireless Mouse", 50, 799.50);
        Product p2 = new Product(102, "Mechanical Keyboard", 30, 2499.99);
        Product p3 = new Product(103, "USB-C Cable", 100, 299.00);
        Product p4 = new Product(104, "HD Monitor", 20, 10499.95);
        Product p5 = new Product(105, "Laptop Stand", 40, 1349.75);

        // check for functions
      inventory.addProduct(new Product(106, "Webcam", 15, 2999.00));
inventory.updateProduct(new Product(106, "HD Webcam", 10, 3199.00));
inventory.deleteProduct(102); // delete Mechanical Keyboard
inventory.printInventory(); // should reflect above changes
inventory.deleteProduct(999); // non-existent product



        inventory.printInventory();
    }
}
