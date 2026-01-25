import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Complex c1 = new Complex();
        System.out.println("First Complex Number");
        System.out.print("Enter real value: ");
        float r1 = scanner.nextFloat();
        System.out.print("Enter imaginary value: ");
        float i1 = scanner.nextFloat();
        c1.set(r1, i1);

        Complex c2 = new Complex();
        System.out.println("\nEnter Second Complex Number");
        System.out.print("Enter real value: ");
        float r2 = scanner.nextFloat();
        System.out.print("Enter imaginary value: ");
        float i2 = scanner.nextFloat();
        c2.set(r2, i2);

        Complex c3 = c1.sum(c2);

        System.out.println("\n Result");
        c3.display();
    }

    public static class Complex {
        private float real;
        private float imaginary;

        // to initialize object values
        public void set(float r, float i) {
            real = r;
            imaginary = i;
        }

        // to display the complex number
        public void display() {
            public void display() {
                System.out.println(real + " + " + imaginary + "i");
            }
        }

        // to add two complex numbers and return the result as a Complex object.
        public Complex sum(Complex c) {
            Complex temp = new Complex();

            temp.real = this.real + c.real;
            temp.imaginary = this.imaginary + c.imaginary;

            return temp;
        }
    }
}