package lesson_03;

import java.util.Scanner;

public class TaskNumber7MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        scanner.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + number+" = " + i*number );
        }
    }
}
