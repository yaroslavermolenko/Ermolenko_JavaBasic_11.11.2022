package homeWork6;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 10);

        for (int i = 1; i < 4; i++) {
            System.out.println("Try to guess number from 0 to 10 from 3 tries. Your " + i + " try, enter your number ");
            int yourNumber = scanner.nextInt();
            if (guessNumber == yourNumber) {
                System.out.println("Congratulations you guessed the number");
                break;
            } else if (i == 3) {
                System.out.println("Wrong, you've used all your tries. You didn't guess " + guessNumber);
            } else {
                System.out.println("Wrong");
            }
        }
    }
}