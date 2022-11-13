package homeWork9;

public class Burger {

    private final String bun;
    private final int numberOfMeat;
    private final String cheese;
    private final String herbs;
    private final String mayonnaise;

    public Burger(String bun, int numberOfMeat, String cheese, String herbs, String mayonnaise) {
        this.bun = bun;
        this.numberOfMeat = numberOfMeat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayonnaise = mayonnaise;
        System.out.println(this);
    }

    public Burger(String bun, String cheese, String herbs, String mayonnaise) {
        this(bun, 1, cheese, herbs, mayonnaise);
    }

    public Burger(String bun, int numberOfMeat, String cheese, String herbs) {
        this(bun, 1, cheese, herbs, null);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", numberOfMeat=" + numberOfMeat +
                ", cheese='" + cheese + '\'' +
                ", herbs='" + herbs + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }

}