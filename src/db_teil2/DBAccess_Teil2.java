package db_teil2;

import db_config.DBProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBAccess_Teil2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(getAddresses(1));
    }
    public static List getAddresses(int userId) throws ClassNotFoundException, SQLException{
        Class.forName(DBProperties.DRIVER);
        Connection con = DriverManager.getConnection(DBProperties.URL,DBProperties.USERNAME,DBProperties.PASSWORD);
        List addresses=new ArrayList();
        PreparedStatement pstmt=con.prepareCall(AddressSQL.PSTMT_FIND_ADDRESS_BY_USERID+" ORDER BY a.city");
        pstmt.setString(1, ""+userId);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            List l=new ArrayList();
            l.add(rs.getString(1));
            l.add(rs.getString(2));
            l.add(rs.getString(3));
            addresses.add(l);
        }
        return addresses;
    }
}
