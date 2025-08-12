package academit.java.HW;

public class SecondExercise {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; --i) {
            if (getMultipleOfFour(i)) {
                System.out.println(i + "");
            }
        }
    }

    public static boolean getMultipleOfFour(int i) {
        return i % 4 == 0;
    }
}