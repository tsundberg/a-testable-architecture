package se.thinkcode.todolist;

public class InMemoryDatabaseTest extends DatabaseTests {
    public InMemoryDatabaseTest() {
        database = new InMemoryDatabase();
    }
}
