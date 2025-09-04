package java_to_do_list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
private static TaskManager taskManager = new TaskManager();
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the To-Do List App!");
while (true) {
System.out.println("\nOptions:");
System.out.println("1. Add a new task");
System.out.println("2. View all tasks");
System.out.println("3. Mark a task as completed");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline
switch (choice) {
case 1:
addNewTask(scanner);
break;
case 2:
taskManager.viewTasks();
break;
case 3:
completeTask(scanner);
break;
case 4:
System.out.println("Exiting the app. Goodbye!");
scanner.close();
return;
default:
System.out.println("Invalid option. Please try again.");
}
}
}
private static void addNewTask(Scanner scanner) {
System.out.print("Enter task description: ");

String description = scanner.nextLine();
System.out.print("Enter task deadline (YYYY-MM-DD): ");
String deadline = scanner.nextLine();
System.out.print("Enter task priority (Low, Medium, High): ");
String priority = scanner.nextLine();
Task task = new Task(description, deadline, priority);
taskManager.addTask(task);
System.out.println("Task added successfully.");
}
private static void completeTask(Scanner scanner) {
System.out.print("Enter task ID to mark as completed: ");
int taskId = scanner.nextInt();
if (taskManager.markTaskAsCompleted(taskId)) {
System.out.println("Task marked as completed.");
} else {
System.out.println("Task not found.");
}
}
}