package lesson_05.homework_06;

public class Animal {

    private static int totalAnimals = 0;

    public Animal() {
        totalAnimals++;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public void run(int distance) {
        System.out.println("Тварина пробігла " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println("Тварина пропливла " + distance + " м");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бобік");

        System.out.println(Dog.getTotalDogs());

        dog.run(500);
        dog.run(501);
        dog.run(-1);
        dog.swim(10);
        dog.swim(11);
        dog.swim(-1);


        System.out.println("------------");

        Cat cat = new Cat("Димок");
        System.out.println(Cat.getTotalCats());

        cat.run(200);
        cat.run(201);
        cat.run(-1);
        cat.swim(1);

        System.out.println(Animal.getTotalAnimals());
    }
}

