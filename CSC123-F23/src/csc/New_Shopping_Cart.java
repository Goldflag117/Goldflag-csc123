package csc;

public class New_Shopping_Cart {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Create some items
        Item book = new Item("Book Title", "Publisher", 19.99, 5.00, 1.5, 0.1);
        Item apple = new Item("Apple", "Grocery Store", 0.99, 0.50, 0.1, 0.05);
        Item soap = new Item("Soap", "Supermart", 2.49, 1.00, 0.3, 0.08);

        // Add items to the cart
        cart.addItem(book);
        cart.addItem(apple);
        cart.addItem(soap);

        // Display information about the cart
        System.out.println("Number of Items in Cart: " + cart.getNumberOfItems());
        System.out.println("Total Cost (including tax): $" + cart.calculateTotalCost());

        // Print details of all items in the cart
        System.out.println("Items in Cart:");
        cart.printAllItems();
    }
}
