package com.bajaj.service;

import java.util.Scanner;

public class MenuPage {

    public int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose what you want to do: ");
        System.out.println("1. Create Referral");
        System.out.println("2. View Referral");
        System.out.println("3. Delete Referral");
        System.out.println("4. Exit");
        return in.nextInt();
    }

}
