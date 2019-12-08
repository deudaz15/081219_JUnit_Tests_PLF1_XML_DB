package db_teil2;

import db_config.DBProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBManager {

    private DBManager() {
    }
    public Connection loadAndConnect() throws ClassNotFoundException, SQLException{
        Class.forName(DBProperties.DRIVER);
        Connection con = DriverManager.getConnection(DBProperties.URL,DBProperties.USERNAME,DBProperties.PASSWORD);
        return con;
    }

}
