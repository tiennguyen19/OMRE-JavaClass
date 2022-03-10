package lesson5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class String_And_Regular_Expression {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert name: ");;
        String inputName = scan.nextLine();
        System.out.println("Các ký tự nên được hiển thị theo chuẩn tiếng Việt như dưới:");
        String[] outputName = inputName.replaceAll("\\s+", " ").split("\\s+");
        for(int i =0; i<outputName.length; i++){
            outputName[i] = outputName[i].substring(0,1).toUpperCase(Locale.ROOT)+outputName[i].substring(1).toLowerCase(Locale.ROOT);
        }
        System.out.println(String.join( " ",outputName));
    }
}
