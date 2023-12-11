package lesson_03;

public class TaskNumber11 {
    public static void main(String[] args) {
        int[] array = {4, -5, 0, 6, 8};

        int min = array[0];
        int indexMin = 0;

        int max = array[0];
        int indexMax = 0;


        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }

            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }

        System.out.println("Array before change:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //change
        int temp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        System.out.println("Array after change:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("max: " + max + "; min:" + min + ";");
    }
}
