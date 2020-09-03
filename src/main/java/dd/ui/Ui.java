package dd.ui;

import java.util.Scanner;

import dd.tasks.Task;

/**
 * A Ui deals with interaction with the user and prints out
 * appropriate statements.
 */
public class Ui {

    private final Scanner sc = new Scanner(System.in);

    /**
     * Prints output to indicate data created at given file name.
     *
     * @param fName File name that data is created in.
     */
    public void dataCreate(String fName) {
        System.out.println("New data created: " + fName);
    }

    /**
     * Prints output to indicate data already exists.
     */
    public void dataExists() {
        System.out.println("Data already exists.");
    }

    /**
     * Prints exit output.
     */
    public void exit() {
        System.out.println("You're leaving? Bye :( Come back soon!");
    }

    /**
     * Prints greeting output.
     */
    public void greeting() {
        String logo = " ____   ____\n"
                + "|  _ \\ |  _ \\\n"
                + "| | | || | | |\n"
                + "| |_| || |_| |\n"
                + "|____/ |____/\n";
        System.out.println("Hi! I'm\n" + logo + "Your personal task manager! How can I help you? :)");
    }

    /**
     * Prints output to indicate task given is deleted.
     *
     * @param t Task that is deleted.
     */
    public void printDeletedTask(Task t) {
        System.out.println("Alright! I've deleted the task:\n  " + t);
    }

    /**
     * Prints output to indicate task given is marked as done.
     *
     * @param t Task that is marked as done.
     */
    public void printDoneTask(Task t) {
        System.out.println("Wow!! Good job!!\n  " + t);
    }

    /**
     * Prints output for listing of task according to task index and Task given.
     *
     * @param taskIndex Index of task.
     * @param t Task to be printed.
     */
    public void printTask(int taskIndex, Task t) {
        System.out.println(taskIndex + ". " + t);
    }

    /**
     * Prints output to indicate number of tasks in list.
     *
     * @param taskSize Number of tasks in list.
     */
    public void printTasksSize(int taskSize) {
        System.out.println("You now have " + taskSize + " task(s) in your list!");
    }

    /**
     * Takes the user input.
     *
     * @return Input entered by user.
     */
    public String readInput() {
        return sc.nextLine();
    }

    /**
     * Prints error message given.
     *
     * @param msg Error message to be printed.
     */
    public void showError(String msg) {
        System.out.println(msg);
    }

    /**
     * Prints output to indicate loading error.
     */
    public void showLoadingError() {
        System.out.println("An error occurred, unable to load prior data. New list created.");
    }

    /**
     * Prints output to indicate to-do given is added.
     *
     * @param t To-do that is added.
     */
    public void startAddTodo(Task t) {
        System.out.println("Ok, To-do added:\n  " + t);
    }

    /**
     * Prints output to indicate deadline given is added.
     *
     * @param t Deadline that is added.
     */
    public void startAddDeadline(Task t) {
        System.out.println("Ok, Deadline added:\n  " + t);
    }

    /**
     * Prints output to indicate event given is added.
     *
     * @param t Event that is added.
     */
    public void startAddEvent(Task t) {
        System.out.println("Ok, Event added:\n  " + t);
    }

    /**
     * Prints output to indicate date that is being checked.
     *
     * @param date Date that is being checked.
     */
    public void startCheckDate(String date) {
        System.out.println("Here is your list of task(s) on " + date + ":");
    }

    /**
     * Prints output to indicate description that is being checked.
     *
     * @param desc Description that is being checked.
     */
    public void startCheckDesc(String desc) {
        System.out.println("Here is the list of task(s) related to " + desc + ":");
    }

    /**
     * Prints output to indicate start of listing of tasks.
     */
    public void startList() {
        System.out.println("Here is your current list of task(s)!");
    }

    /**
     * Prints output to indicate data is updated.
     */
    public void updateData() {
        System.out.println("Updated your data!");
    }
}
