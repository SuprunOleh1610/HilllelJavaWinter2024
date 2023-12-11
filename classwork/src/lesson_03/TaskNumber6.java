package lesson_03;

public class TaskNumber6 {
    public static void main(String[] args) {
        int[] sequence = new int[10];
        int number = 0;

        for (int i = 0; i < 10; i++) {
            sequence[i] = number;
            number -= 5;
        }

        for (int i : sequence){
            System.out.print(i + " ");
        }
    }
}
