package product;

public abstract class Product {
    String name;
    double price ;
    int quantity;

    // Counstructor
    Product(String name, double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void reduceQuantity(int amount){
        quantity -= amount;
    }

    /** Abstracted methods becus each sub class has a spacific condition*/
    public abstract boolean isExpired();
    public abstract boolean isShippable();

}
