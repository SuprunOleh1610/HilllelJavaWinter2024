package lesson_03;

public class UnPairedNumbersWhile {
    public static void main(String[] args) {
        int nuber = 100;
        int i = 0;
        while (i < nuber) {
            if (nuber % 2 != 0) {
                System.out.print(nuber + " ");
            }
            nuber--;
        }
    }
}
