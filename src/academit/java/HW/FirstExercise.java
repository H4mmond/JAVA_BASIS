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

        int numeven = 0;
        int sumeven = 0;
        for (int i = a; i <= b; ++i) {
            if (i % 2 == 0) {
                sumeven += i;
                ++numeven;
            }
        }

        int num = 0;
        int sum = 0;
        while (a <= b) {
            sum += a;
            ++a;
            ++num;
        }

        double avgeven = (double) sumeven / numeven;
        double avg = (double) sum / num;
        System.out.println("Среднее арифметические чётных чисел заданного диапазона: " + avgeven);
        System.out.println("Среднее арифметическое всех чисел заданного диапазона: " + avg);
        System.out.println(sum);
    }
}