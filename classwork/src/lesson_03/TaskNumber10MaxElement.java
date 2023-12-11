package lesson_03;

public class TaskNumber10MaxElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6, -3};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Largest array element: " + max);
    }
}
