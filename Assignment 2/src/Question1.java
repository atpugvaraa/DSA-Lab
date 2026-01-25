import java.util.Scanner;

public class Question1 {
    // Temperature Conversion
    public static void main(String[] args) {
        Temperature temp = new Temperature();

        temp.getCelsius();
        temp.toFarhenheit();
        temp.displayFahrenheit();
    }

    public static class Temperature {
        float celsius;
        float fahrenheit;

        void getCelsius() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the temperature in celsius: ");
            celsius = scanner.nextFloat();
        }

        float toFarhenheit() {
            fahrenheit = (9.0f/5.0f * celsius) + 32.0f;
            return fahrenheit;
        }

        void displayFahrenheit() {
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
    }
}