package academit.java;

public class AverageWithFunction {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("Average = " + getAverage(a, b));
        System.out.println("Average 44 and 50 = " + getAverage(44, 50));
        System.out.println("Average 77 and 12 = " + getAverage(77, 12));
        System.out.println("Average 88 and 223 = " + getAverage(88, 223));
    }

    public static double getAverage(int num1, int num2) {
        return (double) (num1 + num2) / 2;
    }
}
