package lesson_04;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp homeWorkApp = new HomeWorkApp();

        homeWorkApp.printThreeWords();
        homeWorkApp.checkSumSign();
        homeWorkApp.printColor();
        homeWorkApp.compareNumbers();
        homeWorkApp.checkingRange_TaskNumber6(9, 12);
        homeWorkApp.checkNegativeOrPositive_TaskNumber7(1);
        homeWorkApp.checkTrueOrFalse_TaskNumber8(1);
        homeWorkApp.printStringNumberTimes_TaskNumber9("String", 5);
        homeWorkApp.isLeapYear_TaskNumber10();

        homeWorkApp.isLeapYearWithCalendar();
    }

    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println();
        System.out.println("Banana");
        System.out.println();
        System.out.println("Apple");
        border();
    }

    public void checkSumSign() {
        int a = 3;
        int b = 5;

        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
        border();
    }

    public void printColor() {
        int value = 3;
        String message;

        if (value <= 0) {
            message = "Червоний";
        } else if (value > 100) {
            message = "Зелений";
        } else {
            message = "Жовтий";
        }
        System.out.println(message);
        border();
    }

    public void compareNumbers() {
        int a = 6;
        int b = 6;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        border();
    }

    public boolean checkingRange_TaskNumber6(int a, int b) {
        int sum = a + b;
        boolean result;

        result = sum > 10 && sum <= 20;

        System.out.println(result);
        border();
        return result;
    }

    public void checkNegativeOrPositive_TaskNumber7(int a) {
        String message;
        if (a >= 0) {
            message = "Positive";
        } else {
            message = "Negative";
        }
        System.out.println(message);
        border();
    }

    public boolean checkTrueOrFalse_TaskNumber8(int a) {
        boolean result;
        String message;
        if (a < 0) {
            result = true;
            message = "true";
        } else {
            result = false;
            message = "false";
        }
        System.out.println(message);
        border();
        return result;
    }

    public void printStringNumberTimes_TaskNumber9(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public boolean isLeapYear_TaskNumber10() {
        System.out.println("Введіть рік:");
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        boolean leapYear;
        String message;


        if (year % 400 == 0) {
            leapYear = true;
            message = "Рік - високосний";
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
            message = "Рік - високосний";
        } else {
            leapYear = false;
            message = "Рік - не високосний";
        }

        System.out.println(message);
        return leapYear;
    }

    public boolean isLeapYearWithCalendar() {
        boolean leapYear;

        System.out.println("Введіть рік:");
        leapYear = ((GregorianCalendar) Calendar.getInstance()).isLeapYear(new Scanner(System.in).nextInt());
        System.out.println("Рік високосний? - " + leapYear);
        return leapYear;
    }


    private void border() {
        System.out.println("_________");
    }
}
