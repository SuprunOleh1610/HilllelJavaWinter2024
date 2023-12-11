package lesson_03;

public class FactorialWhile {
    public static void main(String[] args) {
        int number = 4;
        int i = 1;
        int factorial =1;
        while (i <= number){
            factorial = factorial * i;
            i++;
        }

        System.out.println(number + "! = " + factorial);
    }
}
