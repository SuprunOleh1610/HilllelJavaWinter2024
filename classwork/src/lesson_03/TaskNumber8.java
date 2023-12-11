package lesson_03;

public class TaskNumber8 {
    public static void main(String[] args) {
        int[] unPairedNumbers = new int[10];

        for (int i = 1, numbers = 0; numbers < 10; i++) {
            if (i % 2 != 0) {
                unPairedNumbers[numbers] = i;
                numbers++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(unPairedNumbers[i]);
            if (i == unPairedNumbers.length - 1) break;
            System.out.print(", ");
        }
    }
}
