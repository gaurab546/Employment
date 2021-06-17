package com.company.lollyShopSystem;

public class Person {

    public String firstName;
    public String surName;
    public String phoneNumber;
    public int discount;

    public Person() {
    }

    public Person(String firstName, String surName, String phoneNumber, int discount) {
        this.firstName = firstName;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.discount = discount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
//        return discount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", discount=" + discount +
                '}';
    }

    public void display() {

//        System.out.println("*************Employee Information***************");
        System.out.println(firstName + " "+surName);
        System.out.println("Contact Number: " + phoneNumber);
//        System.out.printf("has worked %s  hours and will get %s discount%n", hourlyWorked, getDiscount());
    }


}


