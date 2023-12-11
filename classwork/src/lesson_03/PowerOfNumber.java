package lesson_03;

public class PowerOfNumber {
    public static void main(String[] args) {
        int numberX = 5;
        int powerN = 3;
        int result = 1;

        for (int i = 0; i < powerN; i++) {
            result *= numberX;
        }

        System.out.println("X^N = " + result);
    }
}

