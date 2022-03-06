package lession4;

import java.util.Scanner;

public class Conditions_And_Loops {
        public static void main(String[] args){
            //12. Write a Java program to find the number of days in each month of a given year.
            Scanner scan = new Scanner(System.in);
        System.out.print("Insert year:");
        int year = scan.nextInt();

        System.out.println("Số ngày của tháng 1,3,5,7,8,10,12 là: 31 ngày");
        System.out.println("Số ngày của tháng 4,6,9,11: 30 ngày");
        if(year%4==0)
        System.out.println("Số ngày của tháng 2 là: 29 ngày");
        else
            System.out.println("Số ngày của tháng 2 là: 28 ngày");

        //13. Write a Java program that keeps a number between 1 and 7 from the user and displays the name of the weekday.
        System.out.print("Insert number:");
        int number = scan.nextInt();
        System.out.println("Ngày tương ứng với số "+number+" là: " +get_Date(number));

            //Write a program in Java to display the pattern like right angle triangle with a number like:
            System.out.println("Please insert number of triangle: ");
            int row = scan.nextInt();
            for (int i = 1; i<=row; i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }

            //15. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like:
            int k=1;
            for (int i = 1; i<=row; i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k++);
                }
                System.out.println("");
            }

            //16.Write a program in Java to reverse a number.
            System.out.println("Pls insert a number: ");
            int numbera = scan.nextInt();
            System.out.println("Số đảo ngược của số "+number+" là: " +reverse_Number(numbera) );

            //17. Write a Java program to display Pascal's triangle
        }

        public static String get_Date(int number){
            String day="";
            switch(number){
                case 1: day = "Monday"; break;
                case 2: day = "Tuesday";break;
                case 3: day = "Wednesday";break;
                case 4: day = "Thursday";break;
                case 5: day = "Friday";break;
                case 6: day = "Saturday";break;
                case 7: day = "Sunday";break;
                default: day = "Invalid day";
            }
            return(day);
        }
//    public static int count_Number(int number){
//        int count=0;
//        while(number!=0){
//            number = number/10;
//            count++;
//        }
//        return(count);

        //    }
        public static int reverse_Number(int number) {
            int a, reverse_number = 0;
            while (number > 0) {
                a = number % 10;
                reverse_number = reverse_number * 10 + a;
                number = number / 10;
            }
            return (reverse_number);
        }
    }

