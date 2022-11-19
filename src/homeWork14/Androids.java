package homeWork14;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("This is Android call");
    }

    @Override
    public void sms() {
        System.out.println("This is Android sms");
    }

    @Override
    public void internet() {
        System.out.println("This is Android internet");
    }

    @Override
    public void greetings() {
        System.out.println("This is Android greetings");
    }
}
