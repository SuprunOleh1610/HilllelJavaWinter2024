package lesson_05.homework_05;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль запущено.");
    }

    private void startElectricity() {
        System.out.println("Запуск електрики.");
    }

    private void startCommand() {
        System.out.println("Виконання команд.");
    }

    private void startFuelSystem() {
        System.out.println("Запуск пальної системи.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
