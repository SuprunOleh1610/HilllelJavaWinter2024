package lesson_11.homework_14;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new ArraySizeException("Invalid array size. Expected 4x4.");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at position [" + i + "][" + j + "].", e);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(validArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };

        try {
            int result = doCalc(invalidSizeArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "ten", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(invalidDataArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
