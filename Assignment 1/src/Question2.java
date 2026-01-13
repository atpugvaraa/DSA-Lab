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