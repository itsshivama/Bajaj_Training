package com.bajaj.test;

import com.bajaj.service.CreateReferral;
import com.bajaj.dao.DummyData;
import com.bajaj.service.MenuPage;

import java.util.Scanner;

public class Tester {

    Scanner in = new Scanner(System.in);
    public void choose(int option){
        CreateReferral cr = new CreateReferral();
        DummyData d = new DummyData();
        do {
            switch (option) {
                case 1 -> {
                    d.dummy();
                    d.setData();
                }
                case 2 -> d.view();
                case 3 -> {
                    d.delete();
                    d.view();
                }
                default -> System.out.println("Wrong Choice");
            }
            System.out.println("If you want to quit press 4");
            option = in.nextInt();
        }
        while(option!=4);
    }


    public static void main(String[] args){
        Tester t = new Tester();
        MenuPage lp = new MenuPage();
        int option = lp.menu();
        t.choose(option);
    }
}
