package encapsulate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bai 1 - Phan so");
        System.out.println("Cac phan so nhap vao: ");
        PhanSo ps1 = new PhanSo(24,9);
        ps1.hienthi();
        PhanSo ps2 = new PhanSo(4,22);
        ps2.hienthi();
        System.out.println("\nKết qua phép cong/tru/nhan/chia 2 phân số:");
        PhanSo tong = ps1.cong(ps2);
        tong.hienthi();
        PhanSo hieu = ps1.tru(ps2);
        hieu.hienthi();
        PhanSo tich = ps1.nhan(ps2);
        tich.hienthi();
        PhanSo thuong = ps1.chia(ps2);
        thuong.hienthi();

        System.out.println("\n\nBai 2 - Circle");
        Circle c1 = new Circle(4.7);
        System.out.println("radius = "+c1.getRadius());
        System.out.println("Chu vi hinh tron la: "+c1.getCircumference());
        System.out.println("Dien tich hình tron la: "+c1.getArea());
        System.out.println(c1.toString());

        Circle c2 = new Circle();
        System.out.println("radius = "+c2.getRadius());

        System.out.println("\nBai 3 - Employee");
        Employee employee = new Employee(01, "Nguyen", "Tien", 200);
        System.out.println("Annual Salary = "+employee.getAnnualSalary());
        System.out.println("New Salary = "+employee.raiseSalary(0.1));
        System.out.println(employee.toString());

    }
}
