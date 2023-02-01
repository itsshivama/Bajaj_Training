package com.bajaj.dao;

import com.bajaj.service.CreateReferral;

import java.util.ArrayList;
import java.util.Scanner;

public class DummyData {
    public ArrayList<CreateReferral> al = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    CreateReferral cr1, cr2, cr3;

    public DummyData(){}

    public void dummy(){
        cr1 = new CreateReferral(12, "Abhi", "shodam", 122341, "abhi.shom", 10144, 121212, 1000, true);
        cr2 = new CreateReferral(13, "Abhisda", "sdsahom", 143221, "absdhi.shomds", 10122, 181212, 460, false);
        cr3 = new CreateReferral(14, "Abhdsai", "shom", 122143, "absaahi.shogg", 10661, 120112, 800, true);
        add(cr1);
        add(cr2);
        add(cr3);
    }


    public void setData(){
        CreateReferral cr = new CreateReferral();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Referral ID");
        cr.setrefID(sc.nextInt());
        System.out.println("Enter First Name ");
        cr.setfName(sc.next());
        System.out.println("Enter Last Name ");
        cr.setlName(sc.next());
        System.out.println("Enter Email");
        cr.setEmail(sc.next());
        System.out.println();
        System.out.println("Enter Mobile Number = ");
        cr.setMobile(sc.nextLong());
        System.out.println("Enter Referral Points ");
        cr.setrPoints(sc.nextInt());
        System.out.println("Enter Status ");
        cr.setStatus(sc.nextBoolean());
        add(cr);
    }

    public void add(CreateReferral cr7){
        al.add(cr7);
    }

    public void view(){
        System.out.println(al);
    }

    public void delete(){
        int delId = in.nextInt();
        for(int i=0; i<al.size(); i++){
            if(delId==al.get(i).getrefID())
                al.remove(i);
        }
    }
}