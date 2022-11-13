package homeWork9;

public class BurgerMain {

    public static void main(String[] args) {

        Burger usualBurger = new Burger("bun", "cheese", "herbs", "mayonnaise");
        Burger dietBurger = new Burger("bun", 1, "cheese", "herbs");
        Burger doubleBurger = new Burger("bun", 2, "cheese", "herbs", "mayonnaise");

    }

}