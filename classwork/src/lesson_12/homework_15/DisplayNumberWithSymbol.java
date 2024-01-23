package lesson_12.homework_15;

import java.util.Scanner;

public class DisplayNumberWithSymbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        if (isValidInput(input)) {
            int number = Integer.parseInt(input);
            displayNumberWithSymbol(number);
        } else {
            System.out.println("Error: Not only numbers were entered.");
        }
    }

    private static void displayNumberWithSymbol(int number) {
        String numberStr = Integer.toString(number);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numberStr.length(); j++) {
                char digitChar = numberStr.charAt(j);
                int digit = Character.getNumericValue(digitChar);
                displayDigitRow(digit, i);
            }
            System.out.println();
        }
    }

    private static void displayDigitRow(int digit, int row) {
        switch (digit) {
            case 0:
                System.out.print(row == 0 || row == 4 ? "@@@@@ " : "@   @");
                break;
            case 1:
                System.out.print("  @  ");
                break;
            case 2:
                System.out.print(row == 0 || row == 2 || row == 4 ? "@@@@@" : (row == 1 ? "    @" : "@    "));
                break;
            case 3:
                System.out.print(row == 0 || row == 2 || row == 4 ? "@@@@@" : "    @");
                break;
            case 4:
                System.out.print(row == 0 || row == 1 ? "@   @" : (row == 2 ? "@@@@@" : "    @"));
                break;
            case 5:
                System.out.print(row == 0 || row == 2 || row == 4 ? "@@@@@" : (row == 1 ? "@    " : "    @"));
                break;
            case 6:
                System.out.print(row == 0 || row == 2 || row == 4 ? "@@@@@" : (row == 1 ? "@    " : "@   @"));
                break;
            case 7:
                System.out.print(row == 0 ? "@@@@@" : (row == 1 ? "    @" : (row == 2 ? "   @ " : (row == 3 ? "  @  " : (row == 4 ? " @   " : "@    ")))));
                break;
            case 8:
                System.out.print(row == 0 || row == 2 || row == 4 ? "@@@@@" : "@   @");
                break;
            case 9:
                System.out.print(row == 0 || row == 2 || row == 4 ? "@@@@@" : (row == 1 ? "@   @" : "    @"));
                break;
            default:
                System.out.print("Unknown number");
        }
        System.out.print("  ");
    }

    private static boolean isValidInput(String input) {
        return input.matches("\\d+");
    }
}