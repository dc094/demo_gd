package view;

import serviceimplementation.ContactImplementation;
import serviceimplementation.IContact;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo Project");

        IContact contactCreation = new ContactImplementation();
        System.out.println("Contact Creation Method Calling....");
        contactCreation.createContact();
    }
}
