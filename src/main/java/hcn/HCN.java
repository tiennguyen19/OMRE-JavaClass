package hcn;

import java.util.Scanner;

public class HCN{
    double dai;
    double rong;
    double chuVi;
    double dienTich;

    public void nhap(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        dai = scan.nextDouble();
        System.out.println("Nhap chieu rong: ");
        rong = scan.nextDouble();
    }

    public void hienThi(){
        System.out.println("Chieu dai: "+dai+"\nChieu rong: "+rong);
    }

    double getChuVi(){
        chuVi=(dai+rong)*2;
        return(chuVi);
    }

    double getDienTich(){
        dienTich=dai*rong;
        return(dienTich);
    }

    public String toString(){
        return ("Chieu dai: "+dai+"\nChieu rong: "+rong+"\nChu vi: "+chuVi+"\nDien tich: "+dienTich);
    }
}
