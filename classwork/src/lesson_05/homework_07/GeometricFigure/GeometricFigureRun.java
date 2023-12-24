package lesson_05.homework_07.GeometricFigure;

public class GeometricFigureRun {

    public static void main(String[] args) {

        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Circle(6.0);
        figures[1] = new Triangle(3.0, 8.0);
        figures[2] = new Square(2.0);

        double totalArea = calculateTotalArea(figures);
        System.out.println("Площа всіх фігур: " + totalArea);
    }

    public static double calculateTotalArea(GeometricFigure[] figures) {
        double totalArea = 0.0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.calculateArea();
        }
        return totalArea;
    }
}