package academit.java.HW;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        while (a <= 1) {
            System.out.println("Ошибка. Первое число должно быть больше единицы");
            System.out.println("Введите первое число: ");
            a = scanner.nextInt();
        }
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = 0;
        int num = 0;
        int sumeven = 0;
        int numeven = 0;
        while (a <= b) {
            if (a % 2 == 0) {
                sumeven += a;
                ++numeven;
            }
            sum += a;
            ++a;
            ++num;
        }

        double avg = (double) sum / num;
        double avgeven = (double) sumeven / numeven;
        System.out.println("Среднее арифметическое всех чисел заданного диапазона: " + avg);
        System.out.println("Среднее арифметические чётных чисел заданного диапазона: " + avgeven);
    }
}