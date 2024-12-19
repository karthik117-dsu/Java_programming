import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();
        System.out.print("Enter the range of the table: ");
        int range = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
