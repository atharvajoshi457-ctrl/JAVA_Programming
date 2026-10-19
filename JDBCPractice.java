import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to your database (FIXED DB NAME)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/PPA54",
                "root",
                ""
            );

            System.out.println("Connected successfully!");

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Check if data exists
            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println(
                    rs.getInt("Rno") + " " +
                    rs.getString("Name") + " " +
                    rs.getString("City")
                );
            }

            if (!hasData) {
                System.out.println("No data found in table.");
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}