package com.company.lollyShopSystem;

import java.util.Scanner;

public class Supplier extends Person{

    public Double companyName;
    public String supplierStatus;


    public Supplier() {
    }

    public Supplier(String firstName, String surName, String phoneNumber, int discount, Double companyName, String supplierStatus) {
        super(firstName, surName, phoneNumber, discount);
        this.companyName = companyName;
        this.supplierStatus = supplierStatus;
    }

    public Double getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Double companyName) {
        this.companyName = companyName;
    }

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "companyName=" + companyName +
                ", supplierStatus='" + supplierStatus + '\'' +
                '}';
    }
    Scanner scanner= new Scanner(System.in);

    public void getInformation(){
        System.out.println("Enter first name of Employee: ");
        this.firstName= scanner.next();
        System.out.println("Enter last name");
        this.surName= scanner.next();
        System.out.println("Enter phone number");
        this.phoneNumber= scanner.next();
        System.out.println("Enter supplier Status");
        this.supplierStatus = scanner.nextLine();
    }

    public void setDiscount(){
        if (this.supplierStatus == "Active")
            this.discount = 15;
        else if(this.supplierStatus == "Past Supplier")
            this.discount = 5;
        else if(this.supplierStatus == "future supplier")
            this.discount = 10;
//        return discount;
    }

    public void display() {

        System.out.println("*************Supplier Information***************");
        System.out.println(firstName + surName);
        System.out.println("Contact Number: " + phoneNumber);
        System.out.println("is an " + supplierStatus + " supplier and will get "+ discount + " discount" );
    }
}
