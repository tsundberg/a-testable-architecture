package se.thinkcode.todolist;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TodoListServiceTest {
    @Test
    public void add_task() {
        Database database = mock(Database.class);
        TodoListService todoListService = new TodoListService(database);
        Owner owner = new Owner("Thomas");
        Task task = new Task("Buy food for the cat");

        todoListService.addTask(owner, task);

        verify(database).addTask(owner, task);
    }

    @Test
    public void get_tasks() {
        Database database = mock(Database.class);
        TodoListService todoListService = new TodoListService(database);
        Owner owner = new Owner("Thomas");

        todoListService.getTasks(owner);

        verify(database).getTasks(owner);
    }
}