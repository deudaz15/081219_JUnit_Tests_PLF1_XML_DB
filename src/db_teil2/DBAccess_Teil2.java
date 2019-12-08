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
        System.out.println(getAddresses(2));
    }
    public static List<Address> getAddresses(int userId) throws ClassNotFoundException, SQLException{
        Class.forName(DBProperties.DRIVER);
        Connection con = DriverManager.getConnection(DBProperties.URL,DBProperties.USERNAME,DBProperties.PASSWORD);
        List addresses=new ArrayList();
        PreparedStatement pstmt=con.prepareCall(AddressSQL.PSTMT_FIND_ADDRESS_BY_USERID+" ORDER BY a.city");
        pstmt.setInt(1, userId);
        ResultSet rs=pstmt.executeQuery();
        List a;
        while(rs.next()){
            a = new ArrayList();
            a.add(new Address(rs.getInt(1), rs.getInt(3), rs.getString(2), rs.getString(5), rs.getString(4), rs.getString(6)));
            addresses.add(a);
        }
        return addresses;
    }
    
    /*
        Class.forName(DBProperties.DRIVER);
        Connection con = DriverManager.getConnection(DBProperties.URL,DBProperties.USERNAME,DBProperties.PASSWORD);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT a.city, c.lastname, u.username FROM CUSTOMER c INNER JOIN ADDRESS a ON c.idaddress=a.idaddress INNER JOIN USERS u ON c.iduser=u.iduser;");
        rs.next();
        this.city=rs.getString("city");
        this.lastname=rs.getString("lastname");
        this.username=rs.getString("username");
        con.close();
     */
}
