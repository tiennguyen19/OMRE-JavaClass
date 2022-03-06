package lesson3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Find the maximum and minimum of an 1 dimensional array");
        int b;
//Nhập số phần tử của mảng
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số lượng của mảng:");
        b = scan.nextInt();

//Cấp phát bộ nhớ cho mảng
        if (b>0){
            int[] number = new int[b];
            for (int e = 0; e < b; e++) {
                System.out.print("Input số thứ " + e + " của mảng: ");
                number[e] = scan.nextInt();
            }
//max number
            int x = 0;
            for (int i = 0; i < b; i++) {
                while (x < number[i]) {
                    x = number[i];
                }
            }
            System.out.println("Số lớn nhất là: " + x);
//Min number
            for (int a = 0; a < b; a++) {
                while (x > number[a]) {
                    x = number[a];
                }
            }
            System.out.println("Số nhỏ nhất là: " + x);
        }
        else {
            System.out.println("Invalid number, please insert integer number");
        }

        System.out.println("Find the maximum and minimum of an 2 dimensional arrays");
        int[][] numbers = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {6, 7, 8}};
        int y = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++)
                while (y < numbers[i][j]) {
                    y = numbers[i][j];
                }
        }
        System.out.println("Số lớn nhất là: " + y);
    }
}