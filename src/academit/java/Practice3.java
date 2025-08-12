package academit.java;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String a = scanner.nextLine();
        while (a.equals("")) {
            System.out.println("Введите ваше имя: ");
            a = scanner.nextLine();
        }
        System.out.println("Привет, " + a + "!");
    }
}
