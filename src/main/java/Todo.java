public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String saveString() {
        if (this.isDone) {
            return "T , 1 , " + description;
        }
        else {
            return "T , 0 , " + description;
        }
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
