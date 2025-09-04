package java_to_do_list;

public class Task {

private static int idCounter = 1;
private int id;
private String description;
private String deadline;
private boolean isCompleted;
private String priority; // New attribute for task priority
public Task(String description, String priority) {
this.id = idCounter++;
this.description = description;
this.deadline = deadline;
this.priority = priority; // Set priority
this.isCompleted = false;
}
public int getId() {
return id;
}
public String getDescription() {
return description;
}
public boolean isCompleted() {
return isCompleted;
}
public String getPriority() {
return priority; // Getter for priority
}
public void markAsCompleted() {
this.isCompleted = true;
}
@Override
public String toString() {
return "Task ID: " + id +
", Description: " + description +
", Completed: " + (isCompleted ? "Yes" : "No") +
", Priority: " + priority; // Include priority in toString
}
}