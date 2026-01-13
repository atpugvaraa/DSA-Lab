import java.util.Scanner;

public class Question4 {
    // Write a program to Multiply Matrices of 10X10.
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows for Matrix A: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter cols for Matrix A (and rows for Matrix B): ");
        int c1r2 = scanner.nextInt();
        System.out.print("Enter cols for Matrix B: ");
        int c2 = scanner.nextInt();

        int[][] matrixA = new int[r1][c1r2];
        int[][] matrixB = new int[c1r2][c2];

        System.out.println("Enter Matrix A:");
        for(int i=0; i<r1; i++)
            for(int j=0; j<c1r2; j++)
                matrixA[i][j] = scanner.nextInt();

        System.out.println("Enter Matrix B:");
        for(int i=0; i<c1r2; i++)
            for(int j=0; j<c2; j++)
                matrixB[i][j] = scanner.nextInt();

        multiplyMatrices(matrixA, matrixB, r1, c1r2, c2);
    }

    void multiplyMatrices(int[][] a, int[][] b, int r1, int common, int c2) {
        int[][] product = new int[r1][c2];

        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                for(int k=0; k<common; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("\n[Product Matrix]");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
    }
}