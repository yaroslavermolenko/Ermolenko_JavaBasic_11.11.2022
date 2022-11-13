package homeWork8;

public class Main {

    public static void main(String[] args) {

        Person olegPetrov = new Person();
        olegPetrov.name = "Oleg";
        olegPetrov.surname = "Petrov";
        olegPetrov.town = "Dnipro";
        olegPetrov.telephone = "0506578900";
        System.out.println(olegPetrov.personInfo());

        Person annaKlimenko = new Person();
        annaKlimenko.name = "Anna";
        annaKlimenko.surname = "Klimenko";
        annaKlimenko.town = "Kiev";
        annaKlimenko.telephone = "0634569011";
        System.out.println(annaKlimenko.personInfo());

        Person maksimAvramenko = new Person();
        maksimAvramenko.name = "Maksim";
        maksimAvramenko.surname = "Avramenko";
        maksimAvramenko.town = "Lviv";
        maksimAvramenko.telephone = "0732348765";
        System.out.println(maksimAvramenko.personInfo());
    }
}