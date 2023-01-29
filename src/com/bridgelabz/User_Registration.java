package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
    static Pattern Name = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
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
    }
}