package lesson3;

import java.util.Scanner;

public class Test {
    public static void main(String[] agrs) {
        {
            String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

            for (int i = 0; i < my_array.length - 1; i++) {
                for (int j = i + 1; j < my_array.length; j++) {
                    if (my_array[i].equals(my_array[j])) {
                        System.out.println("Duplicate Element is : " + my_array[j]);
                    }
                }
            }
        }
    }
}

