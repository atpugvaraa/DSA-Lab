import java.util.Scanner;

public class Part1_3 {
    // 3. Hybrid Inheritance

    public static void main(String[] args) {
        WorkingStudent workingStudent = new WorkingStudent();
        workingStudent.addDetails();
        workingStudent.displayDetails();
    }

    static class Person {
        protected String name;
    }

    interface Student {
        void setRollNo(int rollNo);
        int getRollNo();
    }

    interface Employee {
        void setEmpID(int id);
        int getEmpID();
    }

    // The Hybrid Class
    // Extends Person (for Name) and Implements Interfaces (for RollNo & ID)
    static class WorkingStudent extends Person implements Student, Employee {
        Scanner scanner = new Scanner(System.in);

        int rollNo;
        int empID;

        public void setRollNo(int rollNo) { this.rollNo = rollNo; }
        public int getRollNo() { return rollNo; }

        public void setEmpID(int id) { this.empID = id; }
        public int getEmpID() { return empID; }

        void addDetails() {
            System.out.println("Enter Student Details");
            System.out.print("Enter Name: ");
            this.name = scanner.nextLine();

            System.out.print("Enter Roll No: ");
            setRollNo(scanner.nextInt());

            System.out.print("Enter Employee ID: ");
            setEmpID(scanner.nextInt());
        }

        void displayDetails() {
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + getRollNo());
            System.out.println("Emp ID: " + getEmpID());
        }
    }
}