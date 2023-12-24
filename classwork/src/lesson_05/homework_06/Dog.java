package lesson_05.homework_06;

public class Dog extends Animal {
    private static int totalDogs = 0;
    private final String name;//Тут є дублювання коду. Але не всі Animal мають ім'я. Мабуть треба створити class Pet з полем String name;

    public Dog(String name) {
        super();
        this.name = name;
        totalDogs++;
    }

    public static int getTotalDogs() {
        return totalDogs;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("You entered a negative sentence ");
            return;
        }
        if (distance <= 500) {
            System.out.println("Собака " + name + " пробігла " + distance + " м");
        } else {
            System.out.println("Собака " + name + " не може пробігти таку велику відстань");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("You entered a negative sentence ");
            return;
        }
        if (distance <= 10) {
            System.out.println("Собака " + name + " пропливла " + distance + " м");
        } else {
            System.out.println("Собака " + name + " не може проплисти таку велику відстань");
        }
    }
}
