import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    static class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Remove Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(id, name, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("Employee List:");
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.id == searchId) {
                            System.out.println("Employee Found: " + emp);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    found = false;
                    for (Employee emp : employees) {
                        if (emp.id == removeId) {
                            employees.remove(emp);
                            System.out.println("Employee removed successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
