public class HolidayBonus {

    // Calculate holiday bonuses for each store
    public static double[] calculateHolidayBonus(double[][] sales, double highBonus, double lowBonus, double otherBonus) {
        double[] bonuses = new double[sales.length];
        int columns = getMaxColumns(sales);

        for (int col = 0; col < columns; col++) {
            double highest = TwoDimRaggedArrayUtility.getHighestInColumn(sales, col);
            double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(sales, col);

            for (int row = 0; row < sales.length; row++) {
                if (col < sales[row].length) { // Ensure column exists for the current row
                    double value = sales[row][col];
                    if (value == highest) {
                        bonuses[row] += highBonus; // Bonus for highest in column
                    } else if (value == lowest) {
                        bonuses[row] += lowBonus; // Bonus for lowest in column
                    } else if (value > 0) {
                        bonuses[row] += otherBonus; // Bonus for other positive values
                    }
                }
            }
        }

        return bonuses;
    }

    // Calculate the total of all holiday bonuses
    public static double calculateTotalHolidayBonus(double[][] sales, double highBonus, double lowBonus, double otherBonus) {
        double[] bonuses = calculateHolidayBonus(sales, highBonus, lowBonus, otherBonus);
        double total = 0;
        for (double bonus : bonuses) {
            total += bonus;
        }
        return total;
    }

    // Helper method to get the maximum number of columns in the sales array
    private static int getMaxColumns(double[][] sales) {
        int max = 0;
        for (double[] row : sales) {
            if (row.length > max) {
                max = row.length;
            }
        }
        return max;
    }
}
