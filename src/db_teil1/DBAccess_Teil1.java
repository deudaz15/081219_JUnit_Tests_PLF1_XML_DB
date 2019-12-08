package db_teil1;

import db_config.DBProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.postgresql.Driver;

public class DBAccess_Teil1 {

   
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(getInsurance());
    }
    public static List getInsurance() throws SQLException, ClassNotFoundException{
        List insurences=new ArrayList();
        Class.forName(DBProperties.DRIVER);
        Connection con = DriverManager.getConnection(DBProperties.URL,DBProperties.USERNAME,DBProperties.PASSWORD);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM insurance ORDER BY name");
        while(rs.next()){
            List l=new ArrayList();
            l.add(rs.getObject(1));
            l.add(rs.getObject(2));
            insurences.add(l);
        }
        return insurences;
    }
}
