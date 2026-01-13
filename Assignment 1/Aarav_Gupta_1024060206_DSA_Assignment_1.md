```java
import java.util.Scanner;

public class Question1 {
    static Scanner scanner = new Scanner(System.in);

    void main() {
        // uncomment the question you want
        question1_1();
//        question1_2();
//        question1_3();
//        question1_4();
//        question1_5();
//        question1_6();
//        question1_7();
//        question1_8();
//        question1_9();
//        question1_10();
    }

    void question1_1() {
        // Computes and returns the sum of all the integers between "first" and "last" inclusive.
        // Get first number
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();

        // Get second number
        System.out.println("Enter second number: ");
        int last = scanner.nextInt();

        int sum = 0;
        int i;

        // Make a loop
        // set i = first
        // i = 6
        // last = 12
        // ans = 63
        // sum = sum + i
        for (i = first; i <= last; ++i) {
            sum = sum + i;
        }

        System.out.println(sum);
        scanner.close();
    }

    void question1_2() {
        // Computes and returns the smallest positive integer n for which 1+2+3+...+n equals or exceeds the value of "goal".
        System.out.println("Enter goal number: ");
        int goal = scanner.nextInt();

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = i * (i + 1) / 2;

            if (sum >= goal) {
                System.out.println("The smallest positive integer" + " n = " + i);
            }
        }

        if (sum < goal) {
            System.out.println("The goal you provided is larger than the sum of n numbers");
        }

        scanner.close();
    }

    void question1_3() {
        // Computes and returns the greatest common divisor (g.c.d.) of the arguments passed to it.
        // Get first number
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();

        // Get second number
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        int hcf = 1;

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        hcf = first;

        System.out.println("Greatest Common Divisor: " + hcf);

        scanner.close();
    }

    void question1_4() {
        // Determines whether an integer is prime.
        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println(n + " is NOT prime.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime.");
        } else {
            System.out.println(n + " is NOT Prime.");
        }
    }

    void question1_5() {
        // Prints the English name of an integer from 1 to 9.
        System.out.println("Enter a number (1-9): ");
        int n = scanner.nextInt();

        String[] integerEnglishName = {
//                "Invalid",
                "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        if (n >= 1 && n <= 9) {
            System.out.println("The english name for " + n + " is " + integerEnglishName[n-1]);
        } else {
            System.out.println("Invalid number. Please enter 1-9.");
        }
    }

    void question1_6() {
        // Reverses the order of the objects in an array.
        int[] arr = {1, 2, 4, 6 ,7};

        System.out.println("Original: " + java.util.Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed: " + java.util.Arrays.toString(arr));
    }

    void question1_7() {
        // Finds the index of the largest number in an array.
        int[] arr = {10, 50, 20, 90, 30};

//        if (arr.length == 0) return;

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Largest Element is at Index: " + maxIndex);
    }

    void question1_8() {
        // Shift the contents of array cells one cell to the right,
        // with the last cell's contents moved to the left end.
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + java.util.Arrays.toString(arr));

        int last = arr[arr.length - 1];
        // Shift elements from right to left
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("Shifted:  " + java.util.Arrays.toString(arr));
    }

    void question1_9() {
        // Examines an array of integers and eliminates all duplication of values. The distinct
        // integers are all moved to the left part of the array.
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original: " + java.util.Arrays.toString(arr));

        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        if (j >= 0) System.arraycopy(temp, 0, arr, 0, j);

        System.out.print("Distinct elements: ");
        for(int i=0; i<j; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    void question1_10() {
        // Copies numbers from two arrays into a third array. The numbers from the second array
        // are placed to the right of the numbers copied from the first array.
        int[] arr1 = {1, 6, 7};
        int[] arr2 = {2, 3, 5};

        int[] result = new int[arr1.length + arr2.length];

        // copy to result
        System.arraycopy(arr1, 0, result, 0, arr1.length);

        // copy arr2 to result after arr1
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        System.out.println("Merged: " + java.util.Arrays.toString(result));
    }
}
```

---

```java
import java.util.Scanner;

public class Question2 {
    static Scanner scanner = new Scanner(System.in);

    void main() {
        new Question2().run();
    }

    void run() {
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sumOfAllElems(arr);
        maxElem(arr);
        linearSearchFor(arr);

         scanner.close();
    }

    void sumOfAllElems(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\n[Sum] Total sum of elements: " + sum);
    }

    void maxElem(int[] arr) {
        if (arr.length == 0) return;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("[Max] Largest element is: " + max);
    }

    void linearSearchFor(int[] arr) {
        System.out.print("\n[Search] Enter number to find: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found " + target + " at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(target + " is not in the array.");
        }
    }
}
```

---

```java
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
```

---

```java
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
```

---

```java
import java.util.Scanner;

public class Question5 {
    // Write a program for linear search using functions.

    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Q5: Linear Search using Functions ---");

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search for: ");
        int target = scanner.nextInt();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
```

---

```java
import java.util.Scanner;

public class Question6 {
    // Write a class for a rectangle.
    // Create objects for this class and call the member functions to find the area and perimeter of the rectangle.

    static class Rectangle {
        double length;
        double width;

        // Constructor to initialize the object
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Member function: Area
        public double getArea() {
            return length * width;
        }

        // Member function: Perimeter
        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = scanner.nextDouble();

        System.out.print("Enter width: ");
        double w = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(l, w);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
```