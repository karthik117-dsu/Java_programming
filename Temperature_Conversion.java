import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTemperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                running = false;
                continue;
            }

            System.out.print("Enter the temperature: ");
            double temp = scanner.nextDouble();
            double convertedTemp = 0;

            switch (choice) {
                case 1:
                    convertedTemp = (temp * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                    break;
                case 2:
                    convertedTemp = (temp - 32) * 5 / 9;
                    System.out.println("Temperature in Celsius: " + convertedTemp);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
