package product;

public class Biscuits extends Product implements Shippable {

    //here im applying Encapsulation concept
    private double weight;

    Biscuits(String name, int price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpired() {
        return true;
    }

    @Override
    public boolean isShippable() {
        return true;
    }
}
