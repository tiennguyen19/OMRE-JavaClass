package lesson2;

import java.util.Scanner;

import static java.awt.Color.white;

public class B1_CalculateNumber {
    public static void main (String[] args){
        int n, sum=0, count=0;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Input number: ");
        n = scan.nextInt();
        if (n>999){
            System.out.println("Please insert number in [100-999] ");
        }
        else if (n<100){
            System.out.println("Please insert number in [100-999] ");
        }
        else {
            while(n>0) {
                int a = n % 10;
                n = n / 10;
                sum += a;
                count++;
            }
            System.out.println("Sum = " +sum);
            System.out.println("count = " +count);
        }

    }
}
