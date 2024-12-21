import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = sc.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    System.out.println("\nTasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
