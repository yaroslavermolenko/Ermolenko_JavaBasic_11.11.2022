package homeWork10;

public class ContactInfo {

    private final String email;
    private final String telephoneNumber;

    public ContactInfo(String email, String telephoneNumber) {
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}