package view;

import serviceimplementation.ContactImplementation;
import services.IContact;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo Project");
       // Interface ref = interface implementation
        IContact contactCreation = new ContactImplementation();


        System.out.println("Contact Creation Method Calling....");
        contactCreation.createContact();


        System.out.println("Contact Added Method Calling....");
        contactCreation.addContact();

        System.out.println("Contact Added Method Calling....");
        contactCreation.editContact();

    }
}
