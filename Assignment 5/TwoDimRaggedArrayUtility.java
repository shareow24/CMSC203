import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

    // Reads a 2D ragged array of doubles from a file
    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double[][] data = new double[10][]; // Assume a max of 10 rows for simplicity
        int row = 0;

        while (scanner.hasNextLine()) {
            String[] values = scanner.nextLine().split(" ");
            double[] rowValues = new double[values.length];
            for (int i = 0; i < values.length; i++) {
                rowValues[i] = Double.parseDouble(values[i]);
            }
            data[row] = rowValues;
            row++;
        }

        scanner.close();
        double[][] trimmedData = new double[row][];
        System.arraycopy(data, 0, trimmedData, 0, row);
        return trimmedData;
    }

    // Writes a 2D ragged array of doubles to a file
    public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        for (double[] row : data) {
            for (double value : row) {
                writer.print(value + " ");
            }
            writer.println(); // Move to the next line for the next row
        }
        writer.close();
    }

    // Returns the total of all elements in the array
    public static double getTotal(double[][] data) {
        double total = 0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    // Returns the average of all elements in the array
    public static double getAverage(double[][] data) {
        int count = 0;
        double total = getTotal(data);
        for (double[] row : data) {
            count += row.length;
        }
        return total / count;
    }

    // Returns the total of a specific row
    public static double getRowTotal(double[][] data, int row) {
        double total = 0;
        for (double value : data[row]) {
            total += value;
        }
        return total;
    }

    // Returns the total of a specific column
    public static double getColumnTotal(double[][] data, int col) {
        double total = 0;
        for (double[] row : data) {
            if (col < row.length) { // Check if the column exists in the current row
                total += row[col];
            }
        }
        return total;
    }

    // Returns the largest value in a specific row
    public static double getHighestInRow(double[][] data, int row) {
        double max = data[row][0];
        for (double value : data[row]) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Returns the smallest value in a specific row
    public static double getLowestInRow(double[][] data, int row) {
        double min = data[row][0];
        for (double value : data[row]) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Returns the largest value in a specific column
    public static double getHighestInColumn(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] > max) {
                max = row[col];
            }
        }
        return max;
    }

    // Returns the smallest value in a specific column
    public static double getLowestInColumn(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] < min) {
                min = row[col];
            }
        }
        return min;
    }

    // Returns the largest value in the entire array
    public static double getHighestInArray(double[][] data) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    // Returns the smallest value in the entire array
    public static double getLowestInArray(double[][] data) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }
}
