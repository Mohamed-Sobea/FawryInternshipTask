package cart;

import product.Product;

public class CartItem{

    private Product product ;    //the product itself
    private int quantity;        //quantity of this product in cart


    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return product;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotal(){
        return product.getPrice() * quantity;
    }
}
