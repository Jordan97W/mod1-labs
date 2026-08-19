package lab9;

import java.util.ArrayList;

public class ShoppingBasket {

    ArrayList<ShoppingBasketItem> items = new ArrayList<>();

    public void add(ShoppingBasketItem item) {
        items.add(item);
    }
}