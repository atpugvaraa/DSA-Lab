import java.util.Scanner;

public class Part1_1 {
    // 1. Single Inheritance

    public static void main(String[] args) {
        Student student = new Student();

        student.addStudent();
        student.displayInfo();
    }

    protected static class Person {
        protected String name;
        protected int age;
    }

    static class Student extends Person {
        Scanner scanner = new Scanner(System.in);

        private int rollNo;

        void addStudent() {
            System.out.println("Enter Student name: ");
            name = scanner.nextLine();

            System.out.println("Enter Student age: ");
            age = scanner.nextInt();

            System.out.println("Enter Student rollNo: ");
            rollNo = scanner.nextInt();
        }

        void displayInfo() {
            System.out.println("\nStudent name is: " + name);
            System.out.println("Student age is: " + age);
            System.out.println("Student rollno. is: " + rollNo);
        }
    }
}