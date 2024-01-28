import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        // Replace these with your database details
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_details";
        String username = "root";
        String password = "root";

        try {
            // Establishing the database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Retrieving student details
            String query = "SELECT * FROM students";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Displaying student details
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String usn = resultSet.getString("usn");
                int semester = resultSet.getInt("semester");
                int age = resultSet.getInt("age");
                String course = resultSet.getString("course");
                String dob = resultSet.getString("dob");
                String address = resultSet.getString("address");

                System.out.println("Name: " + name + ", USN: " + usn + ", Semester: " + semester +
                        ", Age: " + age + ", Course: " + course + ", DOB: " + dob + ", Address: " + address);
            }

            // Closing resources
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
