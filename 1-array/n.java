public class n {
    public static void main(String args[]) {
        int r = 4; // Number of rows

        for (int i = 1; i <= r; i++) {
           
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" "); // Print space
            }

            // Inner loop for printing the numbers in each row
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (i == r) {
                    System.out.print(4); // Print 4 on the last row (7 times)
                } else if (k == 1 || k == (2 * i - 1)) {
                    System.out.print(i); // Print the row number on the edges
                } else {
                    System.out.print(" "); // Print space in between
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
