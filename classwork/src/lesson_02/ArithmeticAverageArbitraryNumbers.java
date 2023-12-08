package lesson_02;

public class ArithmeticAverageArbitraryNumbers {
    public static void main(String[] args) {
        double sum = 0d;

        System.out.print("Numbers: ");
        for (String string : args) {
            System.out.print(string + " ");
            sum += Double.parseDouble(string);
        }

        System.out.println();
        System.out.println("Sum: " + sum);

        double average = sum / args.length;
        System.out.println("Average: " + average);
    }
}
