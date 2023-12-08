package lesson_02;

public class DepositCalculator {
    public static void main(String[] args) {
        double body = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]); // enter percentages as a decimal
        double depositTermYears = Double.parseDouble(args[2]);

        for (int i = 1; i <= depositTermYears; i++) {
            double total = body * Math.pow((1 + percent / 12), 12);
            double percentPerYear = total - body;

            System.out.println("Year; " + i + " " + "Body: " + body + " " + "Percent per year " + percentPerYear + " " + "Total " + total);

            body = total;
        }
    }

}
