package lesson_03;

public class TaskNumber9MinElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6, -3};

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Smallest array element: " + min);
    }
}
