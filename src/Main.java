import cart.Cart;
import customer.Customer;
import product.Cheese;
import product.Product;
import product.ScratchCard;
import product.Tv;
import service.CheckoutService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        Customer c = new Customer("Ali", 1000);

        Product cheese = new Cheese("product.Cheese", 100, 10, 500);
        Product tv     = new Tv("TV", 600, 5, 12000);
        Product card   = new ScratchCard("product.ScratchCard", 50, 20);

        cart.add(cheese, 2);
        cart.add(tv, 1);
        cart.add(card, 1);

        new CheckoutService().checkout(c, cart);


    }
    }