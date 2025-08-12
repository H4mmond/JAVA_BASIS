package academit.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите дробное число: ");
        double b = scanner.nextDouble();

        System.out.println(a >= 5 && b == 3); // false
        System.out.println(3 < 5 || b > 4); // true
        System.out.println(!(a == 4)); // true
//        int a = 5;
//        double b = 5.5;
//        System.out.println("Сумма a + b = " + (a + b));
//
//        String str1 = "Hello, ";
//        String str2 = "world!";
//        System.out.println(str1 + str2);
//
//        int str1Lenght = str1.length();
//        System.out.println("Длина str1 = " + str1Lenght);
//
//        System.out.println("to upper case = " + str1.toUpperCase());
//        System.out.println("contains 'll' ?  " + str1.contains("ll"));
//        System.out.println("str1 == str2 ?  " + str1.equals(str2));
//
//        String phrase = str1 + str2;
//        System.out.println(phrase);
//        System.out.println("Длина строки = " + phrase.length());
    }
}
