import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class lesson6 {
    public static void main(String[] args) {
        int count=0;
        System.out.print("Nhập vào số num: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        System.out.println("sum of 1 to " + num + " is: " + tinh_tong(num));
        System.out.println("tong cua các căn bậc 2 của 2 là: " + tinh_can(num));
        System.out.println("So phuong an de sap xep cac to giay bac thanh 200000 la: " +Tong_So_Cach(count));

        System.out.print("Nhap vao bien x: ");
        double x = scanner.nextDouble();
        System.out.println("Gia tri cua phuong trinh la: " + Tinh_Phuong_Trinh(x));
        }

    // Bài 1: tinh tong tu 1 den n
    public static double tinh_tong(double num){
        int sum = 0;
        if (num < 0) {
            System.out.println("Invalid number");
            }
        else {
            for (int i = 1; i <= num; i++) {
            sum += i;
            }
        }
        return(sum);
    }

    //Bai 2: tinh can bac 2
    public static double tinh_can(double num){
        double can = sqrt(2);
        for (int j = 1; j < num; j++) {
            can = sqrt(2+can);
        }
        return(can);
    }

    //Bai 3: Viết chương trình nhập giá trị sau khi tính giá trị của hàm số
    public static double Tinh_Phuong_Trinh(double x) {
        double f;
        if(x>=5){
            f = 2*x*x + 5*x +9;
        }
        else f = -2*x*x + 4*x -9;
        return(f);
    }

    //Bai 4: Cần có tổng 200.000đ từ3 loại giấy bạc 1000đ, 2000đ, và 5000đ
    // x + 2y +5z = 200
    public static int Tong_So_Cach(int count){
        int x, y, z, sum;
        for(x=0; x<200; x++){
            for(y=0;y<100; y++){
                for(z=0;z<40;z++){
                    sum=x*1000+y*2000+z*5000;
                    if(sum==200000) count++;
                }
            }
        }
        return(count);
    }

}

