package homeWork9;

public class Burger2 {

    public String bun;
    public String numberOfMeat;
    public String meat;
    public String cheese;
    public String herbs;
    public String mayonnaise;

    public Burger2(String bun, String numberOfMeat, String meat, String cheese, String herbs, String mayonnaise) {
        this.bun = bun;
        this.numberOfMeat = numberOfMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayonnaise = mayonnaise;
        System.out.println("The doubleBurger composition: " + bun + ", " + numberOfMeat + " " + meat + ", " + cheese + ", " + herbs + ", " + mayonnaise + ".");
    }

    public Burger2(String bun, String meat, String cheese, String herbs, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayonnaise = mayonnaise;
        System.out.println("The usualBurger composition: " + bun + ", " + meat + ", " + cheese + ", " + herbs + ", " + mayonnaise + ".");
    }

    public Burger2(String bun, String meat, String cheese, String herbs) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        System.out.println("The dietBurger composition: " + bun + ", " + meat + ", " + cheese + ", " + herbs + ".");
    }

}