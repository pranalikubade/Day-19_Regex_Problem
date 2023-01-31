package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
    static Pattern Name = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
    static Pattern Email =Pattern.compile("^[a-zA-Z.]+@(.+)$");
    static Pattern phone = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$");

    public static void main(String[] args) {
        System.out.println("Welcome to Regex Problem");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter FirstName");
        String firstname = scan.next();
        Matcher FirstName = Name.matcher(firstname);
        if (FirstName.matches()) {
            System.out.println("FirstName :" + firstname);
        } else {
            System.out.println("Invalid FirstName");
        }
        System.out.println("Enter LastName");
        String lastname = scan.next();
        Matcher LastName = Name.matcher(lastname);
        if (LastName.matches()) {
            System.out.println("LastName :" + lastname);
        } else {
            System.out.println("Invalid LastName");
        }
        System.out.println("Enter EmailId");
        String emailId = scan.next();
        Matcher email = Email.matcher(emailId);
        if (email.matches()) {
            System.out.println("EmailId:" + emailId);
        } else {
            System.out.println("Invalid EmailId");
        }
        System.out.println("Enter MobileNo.");
        String num = scan.next();
        Matcher mobile = phone.matcher(num);
        if (mobile.matches()) {
            System.out.println("MobileNo:" + num);
        } else {
            System.out.println("Invalid MobileNo");
        }
    }
}
