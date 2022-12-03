package models;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;
    
    // constructor
    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phoneNumber cannot be less than 5");
        }

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phoneNumber cannot be null/blank");
        }

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    // copy constructor
    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setters
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("can not set name to null/blank"); 
        }
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phoneNumber can not be set to null/blank");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phoneNumber cannot be set to less than 5");
        }
        this.phoneNumber = phoneNumber;
    }
    
    // calculate age using birthDate
    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();

        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    // toString
    public String toString() {
        return "Name: " + getName() + "\n" +

        "Phone number: " + getPhoneNumber() + "\n" +
        
        "Birth Date: " + getBirthDate() + "\n" +
        
        "Age: " + getAge() + " year old\n";
    }

}
