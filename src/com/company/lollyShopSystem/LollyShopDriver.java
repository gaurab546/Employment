package com.company.lollyShopSystem;

import java.util.Scanner;

public class LollyShopDriver {

    public static void main(String[] args) {

        Employer employer = new Employer();
        Employer employer1 = new Employer("Maire", "Smith", "359523341", 20, 18.0, 5);

        Customer customer = new Customer();
        Customer customer1 = new Customer("Jack", "Lee", "724143341", 0, "sam@gmail.com", 1010);

        Supplier supplier = new Supplier();
        Supplier supplier1 = new Supplier("Angie", "Williams", "682389341", 15, 1111.11, "Active");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name of Employee: ");
        employer.setFirstName(scanner.nextLine());
        System.out.println("Enter last name");
        employer.setSurName(scanner.nextLine());
        System.out.println("Enter phone number");
        employer.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter hour worked");
        employer.setHourlyWorked((double) scanner.nextInt());

//        employer.getInformation();
        employer.display();
        employer1.display();
//        customer.display();
        customer1.display();
//        supplier.display();
        supplier1.display();



    }
}
