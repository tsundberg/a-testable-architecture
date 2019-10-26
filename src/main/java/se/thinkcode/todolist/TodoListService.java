package se.thinkcode.todolist;

import java.util.List;

public class TodoListService {
    private Database database;

    public TodoListService(Database database) {
        this.database = database;
    }

    public void addTask(Owner owner, Task task) {
        database.addTask(owner, task);
    }

    public List<Task> getTasks(Owner owner) {
        return database.getTasks(owner);
    }
}
