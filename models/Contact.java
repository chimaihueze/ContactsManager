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
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = ageCalculator(birthDate);
    }

    // calculate age using birthDate
    public int ageCalculator(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();

        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

}
