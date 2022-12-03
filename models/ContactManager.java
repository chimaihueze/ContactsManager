package models;
import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts;

    // constructor
    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    // getter 
    public Contact getContact(int index) {
        return new Contact(contacts.get(index));
    }

    // setter
    public void setContact(int index, Contact contact) {
        contacts.set(index, new Contact(contact)); 
    }

    // addContact
    public void addContact(Contact contact) {
        contacts.add(new Contact(contact));
    }

    // removeContact
    public void removeContact(String contactName) {
        if (contacts.isEmpty()) {
            throw new IllegalStateException("Sorry! cannot remove from am empty list");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName().equals(contactName)) {
                    contacts.remove(i);
                }
            }
        }
    }
    // toString
    public String toString() {
        String temp = "";
        for (int i = 0; i < contacts.size(); i++) {
            temp += contacts.get(i).toString();
            temp += "\n\n";
        } return temp;
    }
}
