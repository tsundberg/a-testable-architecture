package se.thinkcode.todolist;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class DatabaseTests {
    Database database;

    @Test
    public void should_add_a_task() {
        Owner owner = new Owner("Malin");
        Task task = new Task("Buy Minutuu");
        database.addTask(owner, task);

        List<Task> actual = database.getTasks(owner);

        assertThat(actual).containsExactly(task);
    }
}
