package com.company.lollyShopSystem;

import java.util.Scanner;

public class Employer extends Person{

    public Double hourlyWorked;
    public int yearWorked;

    public Employer() {
    }

    public Employer(String firstName, String surName, String phoneNumber, int discount, Double hourlyWorked, int yearWorked) {
        super(firstName, surName, phoneNumber, discount);
        this.hourlyWorked = hourlyWorked;
        this.yearWorked = yearWorked;
    }

    public Double getHourlyWorked() {
        return hourlyWorked;
    }

    public void setHourlyWorked(Double hourlyWorked) {
        this.hourlyWorked = hourlyWorked;
    }

    public int getYearWorked() {
        return yearWorked;
    }

    public void setYearWorked(int yearWorked) {
        this.yearWorked = yearWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hourlyWorked=" + hourlyWorked +
                ", yearWorked=" + yearWorked +
                '}';
    }

    public void setDiscount(){
        if (this.hourlyWorked < 20)
            this.discount = 5;
        else if(this.hourlyWorked > 20 & this.hourlyWorked < 30)
            this.discount = 10;
        else
            this.discount = 15;

//        return this.discount;
    }

    public void getInformation(){
        System.out.println("Enter first name of Employee: ");
        this.firstName= scanner.next();
        System.out.println("Enter last name");
        this.surName= scanner.next();
        System.out.println("Enter phone number");
        this.phoneNumber= scanner.next();
        System.out.println("Enter hour worked");
        this.hourlyWorked = scanner.nextDouble();
    }

    Scanner scanner = new Scanner(System.in);



    public void display() {
        System.out.println("*************Employee Information***************");
        super.display();

//        System.out.println(firstName + " "+surName);
//        System.out.println("Contact Number: " + phoneNumber);
        System.out.printf("has worked %s  hours and will get %s discount%n", hourlyWorked, getDiscount());
    }


}
