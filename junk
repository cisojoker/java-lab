import java.sql.*;

public class jdbc {
     static  String JDBC_URL = "jdbc:mysql://localhost:3306/DB";
     static  String DB_USER = "root";
     static  String DB_PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
         
            Statement statement = connection.createStatement();
            String createQuery = "INSERT INTO students (name, usn, roll,marks) VALUES ('John','31',78,44)";
            statement.executeUpdate(createQuery);
            System.out.println("Record created successfully.");

            String readQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(readQuery);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String usn = resultSet.getString("usn");
                int roll = resultSet.getInt("roll");
                int marks = resultSet.getInt("marks");
                System.out.println("Name: " + name + ", usn: " + usn + ", roll: " + roll+",marks: "+marks);
            }
            
            String updateQuery = "UPDATE students SET roll = 78 WHERE name = 'John'";
            statement.executeUpdate(updateQuery);
            System.out.println("Record updated successfully.");


            String deleteQuery = "DELETE FROM students WHERE name = 'John'";
            statement.executeUpdate(deleteQuery);
            System.out.println("Record deleted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
