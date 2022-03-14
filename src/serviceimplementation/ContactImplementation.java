package serviceimplementation;

import model.Contact;
import services.IContact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactImplementation implements IContact {
    ArrayList<Contact> list = new ArrayList<Contact>();
    Scanner sc = new Scanner(System.in);

    public void createContact() {
        Contact contact = new Contact();


        System.out.println("Enter FirstName: ");
        String firstName = sc.next();
        System.out.println("Enter LastName: ");
        String lastName = sc.next();

        list.add(contact);
        System.out.println("Contact Created.....");
        System.out.println("FirstName: " + firstName + "\t\t"
                + "LastName: " + lastName);

    }

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter Person Details: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = sc.next();
        System.out.println("Enter LastName: ");
        String lastName = sc.next();

        System.out.println("Contact Added.....");

        list.add(contact);

        System.out.println("New Contact details are: ");
        System.out.println("FirstName: " + firstName + "\t\t"
                + "LastName: " + lastName);
    }

    public void editContact() {
        System.out.println("Enter person name for edit contact: ");

        Iterator<Contact> iterator = list.listIterator();
        String firstName = sc.next();
        while (iterator.hasNext()) {
             Contact contact = iterator.next();

            if (firstName.equals(contact.getFirstName())) {
                System.out.println("Edit Details of Person");
                System.out.println("Options for edit fields.....");
                System.out.println("1.FirstName \t 2.LastName");

                switch (sc.nextInt()){
                    case 1:
                        System.out.println("FirstName: ");
                        String fName = sc.next();
                        contact.setFirstName(fName);
                        break;
                    case 2:
                        System.out.println("LastName: ");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    default:
                        System.out.println("Exit");
                }

            } else {
                System.out.println("Person Not Found...");
            }
        }
        System.out.println("Contact edited list.....");
//        System.out.println("FirstName: " + firstName + "\t\t"
//                + "LastName: " + l
    }
}