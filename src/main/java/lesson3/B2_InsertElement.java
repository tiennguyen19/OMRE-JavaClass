package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class B2_InsertElement {
    public static void main (String[] args){
        int i=0;
        int[] number = new int[i];
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số lượng của mảng:");
        i = scan.nextInt();

        if(i>0){
            int j=0;
            if(j<i & j>=0){

                System.out.print("insert element of array in position of element : " );
                j = scan.nextInt();
                System.out.println("Display array:" + Arrays.stream(number).findAny() );
            }
            else {
                System.out.println("Invalid number, please insert number >=0 and <= " +i);
            }
        }
        else {
            System.out.println("Invalid number, please insert number >=0");
        }

    }
}
