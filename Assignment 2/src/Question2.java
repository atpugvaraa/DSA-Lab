import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // 1. Create the object
        Student s1 = new Student();

        // 2. Call methods
        System.out.println("Add Student Details");
        s1.addDetails();

        System.out.println("\n Displaying Details");
        s1.displayDetails();

        System.out.println("\n Updating CGPA");
        s1.updateCGPA(9.5f);
        s1.displayDetails();

        System.out.println("\n Updating Hostel");
        s1.updateHostel("Neeram");
        s1.displayDetails();
    }

    public static class Student {
        String name;
        int rollNumber;
        String degree;
        String hostel;
        float cgpa;

        Scanner scanner = new Scanner(System.in);

        // to input student details.
        void addDetails() {
            System.out.println("Enter student name: ");
            name = scanner.nextLine();

            System.out.println("Enter student roll number: ");
            rollNumber = scanner.nextInt();

            System.out.println("Enter student Degree: ");
            degree = scanner.nextLine();

            System.out.println("Enter student Hostel: ");
            hostel = scanner.nextLine();

            System.out.println("Enter student CGPA: ");
            cgpa = scanner.nextFloat();
        }

        // to update all student details.
        void updateDetails() {
            // rerun the add details function and override the values
            System.out.println("Updating all details...");
            addDetails();
        }

        // to update the student's CGPA.
        void updateCGPA(float newCGPA) {
            cgpa = newCGPA;
            System.out.println("CGPA updated successfully.");
        }

        // to update the hostel information.
        void updateHostel(String newHostel) {
            hostel = newHostel;
            System.out.println("Hostel updated successfully.");
        }

        // to display student details.
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Degree: " + degree);
            System.out.println("Hostel: " + hostel);
            System.out.println("CGPA: " + cgpa);
        }
    }
}