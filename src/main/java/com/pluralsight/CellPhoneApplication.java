package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();
        phone2.setSerialNumber(53563);
        phone2.setModel("Smasnug");
        phone2.setCarrier("Verizon");
        phone2.setPhoneNumber("412-123-4567");
        phone2.setOwner("Chris Smasnug");

        CellPhone iPhone = new CellPhone(12312, "iPhone", "Verizon", "412-218-9902", "Johnny Appleseed");
        display(iPhone);


        System.out.println("*** Enter your phone's information below ***");
        System.out.print("Enter the Serial Number: ");
        int serialNumber = keyboard.nextInt();
        keyboard.nextLine();
        phone1.setSerialNumber(serialNumber);

        System.out.print("Enter the phone model: ");
        String model = keyboard.nextLine();
        phone1.setModel(model);

        System.out.print("Enter the carrier: ");
        String carrier = keyboard.nextLine();
        phone1.setCarrier(carrier);

        System.out.print("Enter the phone number: ");
        String phoneNumber = keyboard.nextLine();
        phone1.setPhoneNumber(phoneNumber);

        System.out.print("Enter the owner name: ");
        String owner = keyboard.nextLine().trim();
        phone1.setOwner(owner);

//        display(phone1);
//        System.out.println("\n***");
//        display(phone2);

        System.out.println("\n\n");

        phone1.dial(phone2.getPhoneNumber());
        System.out.println("\n***");
        phone2.dial(phone1.getPhoneNumber());

    }

    public static void display(CellPhone phone) {
        System.out.println("\n*** Cell Phone Information ***");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner Name: " + phone.getOwner());

    } // end of display
}
