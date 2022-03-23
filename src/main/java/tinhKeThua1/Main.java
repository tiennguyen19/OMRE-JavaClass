package tinhKeThua1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle cl = new Circle();
        System.out.println(cl.toString());
        Circle cl1 = new Circle(13, "white");
        System.out.println(cl1.toString());

        Cylinder cy = new Cylinder(14);
        System.out.println(cy.toString()+" Volume = "+cy.getVolume()+"]");

        System.out.println("\n");
        Person p1 = new Person("Tien","Ngoc Thuy");
        System.out.println(p1.toString());

        Student s1 = new Student("Tam", "Tư Dinh","Toan",1991,2000005);
        System.out.println(s1.toString1());

        Staff st = new Staff("Huong","Doi Can", "Vinschool", 50000000);
        System.out.println(st.toString2());

        System.out.println("\n");
//        taiLieu tl = new taiLieu(001,"Nha xuat ban A", 01);
//        System.out.println(tl.toString());

        Sach s = new Sach(001,"Nha xuat ban A", 01,"Tac gia X",2001,45000);
        System.out.println(s.toString1());
        tapChi tc = new tapChi(002,"Nha xuat ban A", 01,01);
        System.out.println(tc.toString());
        bao b = new bao(003,"Nha xuat ban B", 05,12/4/2009);
        System.out.println(b.toString3());


    }

}
