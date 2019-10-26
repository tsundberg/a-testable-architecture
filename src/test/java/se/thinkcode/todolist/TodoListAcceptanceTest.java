package se.thinkcode.todolist;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoListAcceptanceTest {

    @Test
    public void should_remember_to_buy_cat_food() {
        Database database = new InMemoryDatabase();
        TodoListService todoListService = new TodoListService(database);
        Owner owner = new Owner("Thomas");
        Task task = new Task("Buy food for the cat");

        todoListService.addTask(owner, task);

        List<Task> actual = todoListService.getTasks(owner);

        assertThat(actual).containsExactly(task);
    }
}
