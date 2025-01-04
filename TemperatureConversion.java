//Temperature Converter

/*Create a  Java program that converts temperatures between Celsius and Fahrenheit. Prompt the user to enter a temperature value and the unit of measurement, and then perform the conversion. 
Display the converted temperature.*/

import java.util.*;
public class TemperatureConversion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit (°C to °F) conversion");
        System.out.println("1. Celsius to Fahrenheit: ");
        System.out.println("2. Fahrenheit to Celsius: ");
        System.out.println("Choose an option (1/2): ");
        int choice = sc.nextInt();
        double celsius, fahrenheit;
        switch(choice)
        {
            case 1: System.out.println("Enter temperature in Celsius: ");
                    celsius = sc.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
                    break;

            case 2: System.out.println("Enter temperature in Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
                    break;
            default: System.out.println("Invalid option. Please choose 1 or 2.");
        }
        sc.close();
    }
    public static double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }
}
