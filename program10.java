import java.sql.*;
import java.util.Scanner;
public class jdbc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jdbcUrl = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            while (true) {
                System.out.println("1. Add student details.\n2. Display student details\n3. Delete student details\n4. Update Student Details\n");
                System.out.println("Please choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    String queryInsert = "INSERT INTO students(Name,USN,Age,YOB,Marks) VALUES ('pp','40',15,2005,45);";
                    PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
                    preparedStatement.executeUpdate();
                } 
                else if (choice == 2) {
                    String query = "SELECT * FROM students";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        String name = resultSet.getString("Name");
                        String usn = resultSet.getString("USN");
                        int age = resultSet.getInt("Age");
                        int yob = resultSet.getInt("YOB");
                        int marks = resultSet.getInt("Marks");
                        System.out.println("Name: " + name + ", USN: " +
                                usn + ", Age: " + age + ", YearofBirth: " + yob
                                + ", Marks: " + marks);
                    }
                } 
                else if (choice == 3) {
                    System.out.println("Please enter the USN of the student to be deleted: ");
                    String usndel = sc.nextLine();
                    String queryDel = "DELETE FROM students WHERE USN='" + usndel + "'";
                    PreparedStatement preparedStatement = connection.prepareStatement(queryDel);
                    preparedStatement.executeUpdate();
                } 
                else if (choice == 4) {
                    System.out.println("Please enter the USN of the student to be updated: ");
                    String usnUpd = sc.nextLine();
                    System.out.println("Please enter the new name: ");
                    String newName = sc.nextLine();
                    String updQuery = "UPDATE students SET name=?WHERE USN=?";
                    PreparedStatement pstmt = connection.prepareStatement(updQuery);
                    pstmt.setString(1, newName);
                    pstmt.setString(2, usnUpd);
                    pstmt.executeUpdate();
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
