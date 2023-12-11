package lesson_03;

public class UnPairedNumbersDoWhile {
    public static void main(String[] args) {
        int nuber = 100;
        int i = 0;
        do {
            if (nuber % 2 != 0) {
                System.out.print(nuber + " ");
            }
            nuber--;
        }
        while (i < nuber);
    }
}
