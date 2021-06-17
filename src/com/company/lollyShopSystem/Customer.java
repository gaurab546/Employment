package com.company.lollyShopSystem;

import java.util.Scanner;

public class Customer extends Person{

    public String emailAddresss;
    public int customerNumber;

    public Customer() {
    }

    public Customer(String firstName, String surName, String phoneNumber, int discount, String emailAddresss, int customerNumber) {
        super(firstName, surName, phoneNumber, discount);
        this.emailAddresss = emailAddresss;
        this.customerNumber = customerNumber;
    }

    public String getEmailAddresss() {
        return emailAddresss;
    }

    public void setEmailAddresss(String emailAddresss) {
        this.emailAddresss = emailAddresss;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "emailAddresss='" + emailAddresss + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }


    public void setDiscount(int discount){
       discount = 0;

    }
    Scanner scanner = new Scanner(System.in);


    public void getInformation(){
        System.out.println("Enter first name of Employee: ");
        this.firstName= scanner.next();
        System.out.println("Enter last name");
        this.surName= scanner.next();
        System.out.println("Enter phone number");
        this.phoneNumber= scanner.next();
        System.out.println("Enter email Address");
        this.emailAddresss= scanner.nextLine();
    }

    public  void display(){
        System.out.println("*************Customer Information***************");
        System.out.println(this.firstName + this.surName);
        System.out.println("Contact Number: " + this.phoneNumber);
        System.out.println("is a customer and will get "+ this.discount + " discount" );
    }
}
