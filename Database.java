package pit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    public static Connection getConnection() {
        try {
        // Always return a new connection
        return DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
    } catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Database Connection Failed!", ex);
        throw new RuntimeException("Database connection error: " + ex.getMessage());
    }
    }
}
