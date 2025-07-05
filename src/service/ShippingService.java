package service;

import cart.CartItem;
import product.Product;
import product.Shippable;

import java.util.List;

public class ShippingService {

    public static void ship(List<CartItem> list){

        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        for (CartItem item : list){
            Product product = item.getProduct();
            if (product instanceof Shippable){
                Shippable s = (Shippable) product;
                double weight = s.getWeight();
                int quantity  = item.getQuantity();
                System.out.printf( "%dx %-15s %10.2f%n",item.getQuantity() , product.getName() ,s.getWeight());
                totalWeight += weight * quantity;
            }
        }
        // from g to kg
        System.out.println("Total package weight " + totalWeight / 1000 + " kg\n");

    }


}
