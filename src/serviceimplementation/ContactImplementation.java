package serviceimplementation;

import model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactImplementation implements IContact {
    ArrayList<Contact> list = new ArrayList<Contact>();

    public void createContact () {
        Contact contact = new Contact();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = sc.next();
        System.out.println("Enter LastName: ");
        String lastName = sc.next();

        list.add(contact);
        System.out.println("Contact Created.....");
        System.out.println("FirstName: " + firstName + "\t\t"
                + "LastName: " + lastName);

    }

}
