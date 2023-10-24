package csc;
import java.util.ArrayList;

class Item {
    // Fields to all items
    private String name;
    private String vendor;
    private double price;
    private double cost;
    private double weight;
    private double taxRate;

    // Constructor for Item
    public Item(String name, String vendor, double price, double cost, double weight, double taxRate) {
        this.name = name;
        this.vendor = vendor;
        this.price = price;
        this.cost = cost;
        this.weight = weight;
        this.taxRate = taxRate;
    }

    // Method to calculate total cost including tax
    public double calculateTotalCost() {
        return cost * (1 + taxRate);
    }

    // Method to print item details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Vendor: " + vendor);
        System.out.println("Price: $" + price);
        System.out.println("Cost: $" + cost);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
    }
}

class ShoppingCart {
    private ArrayList<Item> items;

    // Constructor for ShoppingCart
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to get the number of items in the cart
    public int getNumberOfItems() {
        return items.size();
    }

    // Method to calculate total cost of items in the cart
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.calculateTotalCost();
        }
        return totalCost;
    }

    // Method to print details of all items in the cart
    public void printAllItems() {
        for (Item item : items) {
            item.printDetails();
            System.out.println("Total Cost (including tax): $" + item.calculateTotalCost());
            System.out.println("----------------------");
        }
    }
}

