package database;

import helper.Constant;
import lombok.extern.slf4j.Slf4j;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class DBConnection {

    private static DBConnection instance;
    private Connection connection;

    private DBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(Constant.URL, Constant.USERNAME, Constant.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            log.error("Database Connection Failed : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnection getInstance() {

        if (instance == null) {

            synchronized (DBConnection.class){
                if(instance == null){
                    instance = new DBConnection();
                }
            }
        } else {
            try {
                if (instance.getConnection().isClosed()) {
                    instance = new DBConnection();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return instance;
    }
}
