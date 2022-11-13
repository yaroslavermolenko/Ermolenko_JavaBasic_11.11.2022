package homeWork3;

public class Main {
    public static void main(String[] args) {
        int lengthA = 18;
        int widthB = 12;
        int heightH = 6;
        int volume = lengthA * widthB * heightH;

        System.out.println("Volume of the parallelepiped = " + volume);

        int length = 4 * (lengthA + widthB + heightH);

        System.out.println("Sum of the all sides of parallelepiped = " + length);

    }
}