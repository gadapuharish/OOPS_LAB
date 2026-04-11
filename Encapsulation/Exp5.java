class Product {
    private int id;
    private String name;
    private double price;
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }
    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price");
    }
    public double getPrice() {
        return price;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
public class Exp5 {
    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 50000);
        p.display();
        p.setPrice(-100);
        p.setPrice(60000);
        System.out.println("Updated Price: " + p.getPrice());
    }
}