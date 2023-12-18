package lesson_03;

public class FactorialDoWhile {
    public static void main(String[] args) {
        int number = 4;
        int i = 1;
        int factorial = 1;

        do {
            factorial = factorial * i;
            i++;
        }
        while (i <= number);

        System.out.println(number + "! = " + factorial);
    }
}