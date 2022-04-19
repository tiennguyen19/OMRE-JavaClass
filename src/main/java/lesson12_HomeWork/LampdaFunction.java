package lesson12_HomeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LampdaFunction {
        interface Convert {
            int chuoi(String a);
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Nhập chuỗi: ");
            String b = input.nextLine();
            // Đếm số ký tự của chuỗi
            Convert count = a -> {
                return countCharacter(a);
            };
            System.out.println(count.chuoi(b));
            Convert count2 = a -> {
                return countWord(a);
            };
            System.out.println(count2.chuoi(b));

            Convert count3 = a -> {
                return demChuAa(a);
            };
            System.out.println(count3.chuoi(b));
        }

        // Đếm số lượng ký tự
        private static int countCharacter(String a) {
            int count = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != ' ' && a.charAt(i) != '\t' && a.charAt(i) != '\n') {
                    count++;
                }
            }
            return count;
        }

        // Đếm số lượng từ
        private static int countWord(String b){
          int count = 0;
          boolean notCount = true;
          for (int i = 0; i < b.length() ; i++) {
              if (b.charAt(i) != ' ' && b.charAt(i) != '\t' && b.charAt(i) != '\n') {
                  if(notCount){
                      count++;
                      notCount = false;
                  }
              }
              else notCount = true;
              }
          return count;
        }

        // Đếm số lượng chữ cái "a" "A"
        private static int demChuAa(String c){
            int count=0;
            for (int i = 0; i < c.length() ; i++) {
                if(c.charAt(i) == 'a' | c.charAt(i) == 'A'){
                    count++;
                }
            }
            return count;
        }

//        private static int demSoKiTu(String d){
//            Set<String> set = new HashSet<>();
//
//        }
}
