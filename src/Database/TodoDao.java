package Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoDao {

    private String databasePath;

    public TodoDao(String databasePath){
        this.databasePath = databasePath;
    }

    public List<Todo> list() throws SQLException {
        List<Todo> todos = new ArrayList<>();
        try(Connection connection = createConnection();
                ResultSet resultSet = connection.prepareStatement("SELECT * FROM Todo").executeQuery()) {
            while (resultSet.next()){
                todos.add(new Todo(resultSet.getInt("id"), resultSet.getString("name"),resultSet.getString("description"), resultSet.getBoolean("done")));
            }
        }
        return todos;
    }

    public void add(Todo todo) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO Todo (name, description, done) VALUES (?, ?, ?)");
            stmt.setString(1, todo.getName());
            stmt.setString(2, todo.getDescription());
            stmt.setBoolean(3, todo.getDone());
            stmt.executeUpdate();
        }
    }

    public void markAsDone(int id) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement stmt = connection.prepareStatement("UPDATE Todo SET done = true WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public void remove(int id) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM Todo WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }


    private Connection createConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(this.databasePath, "sa", "");
        try{
            connection.prepareStatement("CREATE TABLE Todo (id int auto_increment primary key, name varchar(255), description varchar(10000), done boolean)").execute();
        } catch (SQLException e) {
        }
        return connection;
    }
}
