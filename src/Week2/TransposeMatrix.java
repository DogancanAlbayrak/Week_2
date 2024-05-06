package Week2;

public class TransposeMatrix {
    public static class Main {
        public static void main(String[] args) {
            int[][] matrix = {
                    {2, 3, 4},
                    {5, 6, 4}
            };

            // Getting the dimensions of the matrix.
            int numRows = matrix.length;
            int numCols = matrix[0].length;

            // Creating the transpose matrix.
            int[][] transposeMatrix = new int[numCols][numRows];

            // Calculating the transpose of the matrix.
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    transposeMatrix[j][i] = matrix[i][j];
                }
            }

            // Printing the original matrix.
            System.out.println("Matrix:");
            printMatrix(matrix);

            // Printing the transpose of the matrix.
            System.out.println("Transpose:");
            printMatrix(transposeMatrix);
        }

        // Function to print the matrix to the screen
        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}