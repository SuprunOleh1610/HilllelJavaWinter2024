package lesson_10.homework_13.coffee.order;

public class Run {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Oliver");
        coffeeOrderBoard.add("Jack");
        coffeeOrderBoard.add("Harry");
        coffeeOrderBoard.add("Jacob");

        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver(54);

        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
    }
}
