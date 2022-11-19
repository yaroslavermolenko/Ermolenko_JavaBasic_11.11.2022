package homeWork14;

public class Iphones implements Smartphones, iOS{
    @Override
    public void call() {
        System.out.println("This is Iphone call");
    }

    @Override
    public void sms() {
        System.out.println("This is Iphone sms");
    }

    @Override
    public void internet() {
        System.out.println("This is Iphone internet");
    }

    @Override
    public void greetings() {
        System.out.println("This is Iphone greetings");
    }
}
