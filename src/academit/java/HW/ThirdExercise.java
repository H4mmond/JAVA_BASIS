package academit.java.HW;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        int numodd = num;
        int nummax = num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        int sumodd = 0;
        while (numodd > 0) {
            int fcheck = numodd % 10;
            if (!(fcheck % 2 == 0)) {
                sumodd += fcheck;
            }
            numodd /= 10;
        }

        int modmax = 0;
        while (nummax > 0) {
            int scheck = nummax % 10;
            if (modmax < scheck) {
                modmax = scheck;
            }
            nummax /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);
        System.out.println("Сумма нечётных цифр числа: " + sumodd);
        System.out.println("Максимальная цифра числа: " + modmax);
    }
}
