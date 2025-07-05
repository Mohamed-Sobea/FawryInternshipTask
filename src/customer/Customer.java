package customer;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void reduceBalance(double value){
        if (balance > 0 && value <= balance){
            balance -= value;
        }else {
            //logical error for that stop the program and throw exception
            throw new IllegalArgumentException ("Not enough balance.");
        }
    }
}
