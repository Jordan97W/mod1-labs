package lab9;

import java.util.LinkedList;
import java.util.Queue;

public class Program {

    static Queue<ShoppingBasket> baskets = new LinkedList<>();

    public static void main(String[] args) {

        ShoppingBasket basket1 = new ShoppingBasket();
        basket1.add(new ShoppingBasketItem("Apples", 2, 1.50));
        basket1.add(new ShoppingBasketItem("Bread", 1, 1.20));

        ShoppingBasket basket2 = new ShoppingBasket();
        basket2.add(new ShoppingBasketItem("Milk", 2, 1.80));

        baskets.add(basket1);
        baskets.add(basket2);

        processBaskets();
    }

    public static void processBaskets() {

        while (!baskets.isEmpty()) {

            ShoppingBasket basket = baskets.remove();

            for (ShoppingBasketItem item : basket.items) {
                System.out.println(item.getDetails());
            }

            System.out.println();
        }
    }
}