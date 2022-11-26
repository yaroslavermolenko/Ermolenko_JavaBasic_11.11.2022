package homeWork11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner choose = new Scanner(System.in);
        int chooseNumber;

        String[] order = new String[100];
        int orderNumber = 0;

        Drinks drinks = new Drinks(10, 5, 15, 20, 15, 20);

        do {
            System.out.println("\nChoose your drink by name and price: ");
            System.out.println("1: " + drinks.createCoffee.name() + " " + drinks.createCoffee.getPrice() + "$");
            System.out.println("2: " + drinks.createTea.name() + " " + drinks.createTea.getPrice() + "$");
            System.out.println("3: " + drinks.createLemonade.name() + " " + drinks.createLemonade.getPrice() + "$");
            System.out.println("4: " + drinks.createMojito.name() + " " + drinks.createMojito.getPrice() + "$");
            System.out.println("5: " + drinks.createMineral.name() + " " + drinks.createMineral.getPrice() + "$");
            System.out.println("6: " + drinks.createCocaCola.name() + " " + drinks.createCocaCola.getPrice() + "$");
            System.out.println("0: End the order\n");

            chooseNumber = choose.nextInt();

            switch (chooseNumber) {
                case (0):
                    break;
                case (1):
                    Drinks.totalPrice += drinks.createCoffee.getPrice();
                    order[orderNumber] = drinks.createCoffee.name();
                    orderNumber++;
                    break;
                case (2):
                    Drinks.totalPrice += drinks.createTea.getPrice();
                    order[orderNumber] = drinks.createTea.name();
                    orderNumber++;
                    break;
                case (3):
                    Drinks.totalPrice += drinks.createLemonade.getPrice();
                    order[orderNumber] = drinks.createLemonade.name();
                    orderNumber++;
                    break;
                case (4):
                    Drinks.totalPrice += drinks.createMojito.getPrice();
                    order[orderNumber] = drinks.createMojito.name();
                    orderNumber++;
                    break;
                case (5):
                    Drinks.totalPrice += drinks.createMineral.getPrice();
                    order[orderNumber] = drinks.createMineral.name();
                    orderNumber++;
                    break;
                case (6):
                    Drinks.totalPrice += drinks.createCocaCola.getPrice();
                    order[orderNumber] = drinks.createCocaCola.name();
                    orderNumber++;
                    break;
                default:
                    System.out.println("Incorrect entrance, not taken into order. Try again\n");
            }

            System.out.println("Your order: ");
            for (int i = 0; i < orderNumber; i++) {
                System.out.print(order[i]);
                if (i < orderNumber - 1) System.out.print(", ");
            }

            System.out.println("\nTotal drinks: " + orderNumber + "\nTotal price: " + Drinks.totalPrice + "$");

        } while (chooseNumber != 0);

    }

}