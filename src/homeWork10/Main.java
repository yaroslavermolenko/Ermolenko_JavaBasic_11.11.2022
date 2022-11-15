package homeWork10;

public class Main {


    public static void main(String[] args) {
        User vlad = new User("Vlad", "Klymenko",
                new Date(20, 9, 1968),
                new ContactInfo("vladklymenko@gmail.com", "380675612345"),
                new FitInfo(78, "120/60", 5600));

        System.out.println(vlad);


        User elena = new User("Elena", "Karpenko",
                new Date(30, 11, 1973),
                new ContactInfo("elenakarpenko@gmail.com", "380508903263"),
                new FitInfo(55, "130/70", 5800));

        System.out.println(elena);

        elena.setSurname("Timchenko");
        elena.getFitInfo().setPressure("120/60");
        elena.getFitInfo().setPedometerPerDay(6500);

        System.out.println(elena);


        User olya = new User("Olya", "Kostenko",
                new Date(16, 1, 1995),
                new ContactInfo("olyakostenko@gmail.com", "380634569011"),
                new FitInfo(49, "110/50", 8000));

        System.out.println(olya);

        olya.setSurname("Pavlova");
        olya.getFitInfo().setWeight(53.5);
        olya.getFitInfo().setPressure("140/80");
        olya.getFitInfo().setPedometerPerDay(3500);

        System.out.println(olya);

    }
}