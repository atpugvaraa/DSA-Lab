import java.util.Scanner;
public class Question3 {
    // Write a program for adding and subtracting matrices using 2D arrays.
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("Enter elements for Matrix A:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix B:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        addMatrices(matrixA, matrixB, rows, cols);
        subtractMatrices(matrixA, matrixB, rows, cols);
    }

    static void addMatrices(int[][] a, int[][] b, int rows, int cols) {
        System.out.println("\n[Sum of Matrices]");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print((a[i][j] + b[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    static void subtractMatrices(int[][] a, int[][] b, int rows, int cols) {
        System.out.println("\n[Difference of Matrices (A - B)]");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print((a[i][j] - b[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}