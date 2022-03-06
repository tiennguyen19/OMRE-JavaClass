package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class B3_Array_SpecialValue {
    public static void main(String[] args) {
        //Bài 6
        int[] number = {2, 4, 6, 8, 3, 124, 456, 9, 345, 5, 256};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Insert n: ");
//        int m = scan.nextInt();
        System.out.println("Số thuộc mảng thì giá trị trả về TRUE không thì kết quả trả về là False: " + compare(number, 124));

        //Bài 7
        String[] aa = {"TE", "m", "mua", "minh", "M", "t", "Minh", "m", "minh"};
        for (int i = 0; i < aa.length - 1; i++) {
            for (int j = i + 1; j < aa.length; j++) {
                if (aa[i].equals(aa[j])) {
                    System.out.println("Duplicate value is : " + aa[j]);
                }
            }
        }
        //Bài 10
        System.out.println("Array is: "+Arrays.toString(number));
        for (int a = 0; a < number.length / 2; a++) {
            int temp = number[a];
            number[a] = number[number.length - a - 1];
            number[number.length - a - 1]=temp;
        }
        System.out.println("Reserve of Array is: "+Arrays.toString(number));

        // Bài 11
        System.out.println("Số lớn thứ 2 là số:" +sortASC(number));
    }

    //Bài 10
    public static boolean compare(int[] number, int item) {
        for (int n : number) {
            if (item == n)
                return true;
        }
        return false;
    }

    //Bai 11
    private static int sortASC(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if(number[i] > number[j]){
                    int temp = number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        return(number[number.length-2]);
    }
}


