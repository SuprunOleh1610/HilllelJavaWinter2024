package lesson_02;

public class ArithmeticAverageTwoNumbers {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double sum = number1 + number2;
        double average = sum/2d;

        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println("Sum: " + sum);
        System.out.print("Average: " + average);
    }
}
