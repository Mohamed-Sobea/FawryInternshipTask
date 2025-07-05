package product;

// in scratchCard we dont neet to implement the interface becuse it not shippable
public class ScratchCard extends Product {

    public ScratchCard(String name, int price, int quantity) {
        super(name, price, quantity);
    }


        @Override
        public boolean isExpired() {
            return false;
        }

        @Override
        public boolean isShippable() {
            return false;
        }

}
