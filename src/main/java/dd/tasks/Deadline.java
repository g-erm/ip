package dd.tasks;

/**
 * A deadline task with a specific due date or date and time.
 */
public class Deadline extends Task {

    protected String by;

    /**
     * Class Constructor.
     *
     * @param description Description of deadline.
     * @param by Due date or date and time of deadline.
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    /**
     * Returns due date of deadline.
     *
     * @return Due date of deadline.
     */
    public String getDate() {
        int dateLength = 11;

        return by.substring(0, dateLength);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String saveString() {
        if (this.isDone) {
            return "D , 1 , " + description + " , " + by;
        } else {
            return "D , 0 , " + description + " , " + by;
        }
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}
