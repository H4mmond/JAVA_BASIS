package academit.java.HW;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int originnum = scanner.nextInt();
        int num = Math.abs(originnum);
        int sum = 0;
        int sumodd = 0;
        int modmax = 0;

        while (num > 0) {
            int check = num % 10;
            if (!(check % 2 == 0)) {
                sumodd += check;
            }
            if (modmax < check) {
                modmax = check;
            }
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);
        System.out.println("Сумма нечётных цифр числа: " + sumodd);
        System.out.println("Максимальная цифра числа: " + modmax);
    }
}
