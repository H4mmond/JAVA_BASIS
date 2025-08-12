package academit.java;

import java.util.Scanner;

public class Practice1and2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String a = scanner.nextLine();
        if (a.equals("")) {
            System.out.println("Привет, неизвестный!");
        } else {
            System.out.println("Привет, " + a + "!");
        }
    }
}
