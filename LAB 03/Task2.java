import java.util.Scanner;
class Product {
    private String name;
    private double price;
    private int quantity;
    static int totalProducts = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setQty(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public int getQty() {
        return this.quantity;
    }

    public void registerProduct() {
        totalProducts++;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Pen");
        p1.setPrice(1.50);
        p1.setQty(10);
        p1.registerProduct();

        Product p2 = new Product();
        p2.setName("Notebook");
        p2.setPrice(3.00);
        p2.setQty(5);
        p2.registerProduct();

        System.out.println("Product 1: " + p1.getName() + " Price: " + p1.getPrice() + " Quantity: " + p1.getQty());
        System.out.println("Product 2: " + p2.getName() + " Price: " + p2.getPrice() + " Quantity: " + p2.getQty());
        System.out.println("Total Products : " + Product.totalProducts);
    }
}

