package task1;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1 if you wish to convert to Celsius, or 2 if you wish to convert to Fahrenheit");

        int command = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case 1:
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = Double.parseDouble(scanner.nextLine());
                System.out.println("Temperature in Celsius is: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Enter temperature in Celsius: ");
                double celsius = Double.parseDouble(scanner.nextLine());
                System.out.println("Temperature in Celsius is: " + celsiusToFahrenheit(celsius));
            break;
            default:
                System.out.println("Please enter 1 or 2");
                break;
        }
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    private static double celsiusToFahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
