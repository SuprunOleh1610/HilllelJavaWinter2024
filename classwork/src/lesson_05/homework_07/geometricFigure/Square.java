package lesson_05.homework_07.geometricFigure;

public class Square implements GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}