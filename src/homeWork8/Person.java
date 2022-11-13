package homeWork8;

public class Person {

    public String name;
    public String surname;
    public String town;
    public String telephone;

    public String personInfo() {
        return "You can call citizen " + name + " " + surname + " " + "from town " + town + " " + "by telephone number " + telephone;
    }

}