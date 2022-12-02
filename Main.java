import models.ContactManager;
import models.Contact;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        
      try {
          Contact contact = new Contact("Chima", "+2348030000000", "05-17-1900");
          System.out.println(contact);
      } catch (ParseException e) {
          System.out.println(e.getMessage());;
      } finally {
          System.out.println("Process complete");
      }

    }

    

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
