package java_to_do_list;

public class Task {

private static int idCounter = 1;
    private int id;
    private String description;
    private LocalDate deadline; // **Changed to LocalDate for better date
                                // handling**
    private boolean isCompleted;

    public Task(String description, String deadline) {
        this.id = idCounter++;
        this.description = description;
        setDeadline(deadline); // **Updated to call the new setDeadline method**
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Updated method to include logging
    public void markAsCompleted() {
        this.isCompleted = true;
        System.out.println("Task ID " + id + " marked as completed."); // Log completion
    }
@Override
public String toString() {
return "Task ID: " + id +
", Description: " + description +
", Completed: " + (isCompleted ? "Yes" : "No") +
", Priority: " + priority; // Include priority in toString
}
}