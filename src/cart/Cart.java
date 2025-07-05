package cart;

import product.Product;

import java.util.List;
import java.util.ArrayList;

public class Cart {

    // Here I use list because it has a dynamic size which we need because we don't know how much item will store
    private List<CartItem> items;

    public Cart() {
        //  Initialize the shopping cart as an empty list
        //  without this we would get a NullPointerException when trying to add items
        this.items = new ArrayList<>();
    }


    public void add(Product product, int quantity){
        if (quantity > product.getQuantity()){
            System.out.println("Quantity exceeds available in our store!");
            return;
        }

        items.add(new CartItem(product, quantity));
    }

    public List<CartItem> getItems(){
        return items;
    }

    public boolean isEmpty(){
        if (items.size() == 0)
            return true;
        else
            return false;
    }




}
