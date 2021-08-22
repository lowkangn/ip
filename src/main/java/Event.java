public class Event extends Task {
    private final String dateOrTime;

    public Event(String taskName, String dateOrTime, boolean isDone) {
        super(taskName, isDone);
        this.dateOrTime = dateOrTime;
    }

    @Override
    public String toString() {
        if (super.isDone) {
            return "[E][X] " + super.taskName + " (at: " + this.dateOrTime + ")";
        } else {
            return "[E][ ] " + super.taskName + " (at: " + this.dateOrTime + ")";
        }
    }
}
