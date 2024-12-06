import static org.junit.Assert.*;
import java.io.File;
import java.io.PrintWriter;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestSTUDENT {

    @Test
    public void testReadFile() throws Exception {
        // Create a test file
        File file = new File("testReadFile.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("1.0 2.0 3.0");
        writer.println("4.0 5.0");
        writer.println("6.0 7.0 8.0");
        writer.close();

        // Read the file using the utility method
        double[][] data = TwoDimRaggedArrayUtility.readFile(file);

        // Check the data
        assertEquals(1.0, data[0][0], 0.001);
        assertEquals(2.0, data[0][1], 0.001);
        assertEquals(3.0, data[0][2], 0.001);
        assertEquals(4.0, data[1][0], 0.001);
        assertEquals(5.0, data[1][1], 0.001);
        assertEquals(6.0, data[2][0], 0.001);
        assertEquals(8.0, data[2][2], 0.001);
    }

    @Test
    public void testWriteToFile() throws Exception {
        // Create test data
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };

        // Write to a file
        File file = new File("testWriteToFile.txt");
        TwoDimRaggedArrayUtility.writeToFile(data, file);

        // Read back the file to check
        double[][] result = TwoDimRaggedArrayUtility.readFile(file);

        // Check the data
        assertEquals(1.0, result[0][0], 0.001);
        assertEquals(5.0, result[1][1], 0.001);
        assertEquals(8.0, result[2][2], 0.001);
    }

    @Test
    public void testGetTotal() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(36.0, TwoDimRaggedArrayUtility.getTotal(data), 0.001);
    }

    @Test
    public void testGetAverage() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(4.5, TwoDimRaggedArrayUtility.getAverage(data), 0.001);
    }

    @Test
    public void testGetRowTotal() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(data, 0), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(data, 1), 0.001);
        assertEquals(21.0, TwoDimRaggedArrayUtility.getRowTotal(data, 2), 0.001);
    }

    @Test
    public void testGetColumnTotal() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(data, 0), 0.001);
        assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(data, 1), 0.001);
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(data, 2), 0.001);
    }

    @Test
    public void testGetHighestInRow() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 0), 0.001);
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 1), 0.001);
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 2), 0.001);
    }

    @Test
    public void testGetLowestInRow() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 0), 0.001);
        assertEquals(4.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 1), 0.001);
        assertEquals(6.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 2), 0.001);
    }

    @Test
    public void testGetHighestInArray() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInArray(data), 0.001);
    }

    @Test
    public void testGetLowestInArray() {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(data), 0.001);
    }
}
