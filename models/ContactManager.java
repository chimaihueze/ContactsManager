package models;
import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts;

    // constructor
    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    // getter 
    public Contact getContacts(int index) {
        return new Contact(contacts.get(index));
    }

    // setter
    public void setContacts(int index, Contact contact) {
        contacts.set(index, new Contact(contact)); 
    }
    
}
