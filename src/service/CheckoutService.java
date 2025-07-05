package service;

import cart.Cart;
import cart.CartItem;
import customer.Customer;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {

    public void checkout(Customer customer, Cart cart){

        //check cart not empty
        if (cart.isEmpty()){
            System.out.println("cart.Cart is empty.");
            return;
        }

        double subtotal = 0;
        double shippingCost = 0;
        List<CartItem> shippableItems = new ArrayList<>();

        for (CartItem item : cart.getItems()) {

            //product is item itself like cheese or tv and price and expire or not
            //item is cart item with the quantity like tv*2
            Product product = item.getProduct();

            // Check if product is expired
            if (product.isExpired()) {
                System.out.println("product.Product " + product.getName() + " is expired.");
                return;
            }

            // Check Quantity
            if (item.getQuantity() > product.getQuantity()) {
                System.out.println("Not enough quantity for product: " + product.getName());
                return;
            }

            product.reduceQuantity(item.getQuantity());
            subtotal += product.getPrice() * item.getQuantity();

            if (product.isShippable()) {
                // add product with shippable type
                shippableItems.add(item);
            }

        }
            // example of shipping fee
            // every shippable item cost 20
            shippingCost = shippableItems.size() * 20;
            double totalCost = subtotal + shippingCost;

            // check if customer balance enough
            if (totalCost > customer.getBalance()){
                System.out.println("Please check you balance to complete the order");
                return;
            }

            // If the operation done then reduce balance from customer
            customer.reduceBalance(totalCost);

            if (!shippableItems.isEmpty()){
                ShippingService.ship(shippableItems);
            }

            //Print recept

            System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            System.out.printf("%-4dx %-15s %.2f%n",
                    item.getQuantity(),
                    product.getName(),
                    item.getQuantity() * product.getPrice());
        }
            System.out.println("-------------------------------");
            System.out.printf("Subtotal         %10.2f%n", subtotal);
            System.out.printf("Shipping         %10.2f%n", shippingCost);
            System.out.printf("Amount           %10.2f%n", totalCost);
        }
}
