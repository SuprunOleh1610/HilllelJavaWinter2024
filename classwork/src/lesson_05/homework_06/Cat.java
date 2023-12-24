package lesson_05.homework_06;

public class Cat extends Animal {
    private static int totalCats = 0;

    private final String name;//Тут є дублювання коду. Але не всі Animal мають ім'я. Мабуть треба створити class Pet з полем String name;

    public Cat(String name) {
        super();
        this.name = name;
        totalCats++;
    }

    public static int getTotalCats() {
        return totalCats;
    }

    @Override
    public void run(int distance) {

        if (distance < 0) {
            System.out.println("You entered a negative sentence ");
            return;
        }

        if (distance <= 200) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не може пробігти таку велику відстань");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кіт не вміє плавати");
    }
}
