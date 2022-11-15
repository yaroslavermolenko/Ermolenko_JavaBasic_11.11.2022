package homeWork10;

public class User {

    private final String name;
    private String surname;
    private Date dateOfBirth;
    private int age;
    private ContactInfo contactInfo;
    private FitInfo fitInfo;

    public User(String name, String surname, Date dateOfBirth, ContactInfo contactInfo, FitInfo fitInfo) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.age = 2022 - dateOfBirth.getYearOfBirth();
        this.contactInfo = contactInfo;
        this.fitInfo = fitInfo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public FitInfo getFitInfo() {
        return fitInfo;
    }

    public void setFitInfo() {
        this.fitInfo = fitInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", contactInfo=" + contactInfo +
                ", fitInfo=" + fitInfo +
                '}';
    }
}