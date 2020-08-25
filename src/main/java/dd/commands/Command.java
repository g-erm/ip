package dd.commands;

import dd.exception.DukeException;
import dd.storage.DataStorage;
import dd.tasks.TaskList;
import dd.ui.Ui;

public abstract class Command {
    protected String command;
    protected String item;

    public Command(String command, String item) {
        this.command = command;
        this.item = item;
    }

    public abstract void execute(TaskList taskList, Ui u, DataStorage ds) throws DukeException;
    public abstract boolean isExit();
}
