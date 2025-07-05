package product;

/* implement shippable internface becuse the cheese is shippable**/
public class Cheese extends Product implements Shippable {

    //here im applying Encapsulation concept
    private double weight;

    public Cheese(String name, int price, int quantity, double weight) {
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
        return false;
    }

    @Override
    public boolean isShippable() {
        return true;
    }

}
