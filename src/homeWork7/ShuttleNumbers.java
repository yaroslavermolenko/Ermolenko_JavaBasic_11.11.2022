package homeWork7;

public class ShuttleNumbers {
    static String number = " ";

    public static void main(String[] args) {

        int sumOfShuttles = 0;

        for (int i = 1; sumOfShuttles < 100; i++) {

            number = String.valueOf(i);
            if ((number.contains("4") || number.contains("9"))) continue;
            sumOfShuttles++;
            System.out.println("Shuttle Number " + number);

        }
        System.out.println("Sum of shuttles = " + sumOfShuttles);
    }
}