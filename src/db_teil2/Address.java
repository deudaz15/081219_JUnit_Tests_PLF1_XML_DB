package db_teil2;

import db_config.DBProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;


public class Address {

    private String city;
    private String lastname;
    private String username;

    public Address(String city, String lastname, String username) {
        this.city = city;
        this.lastname = lastname;
        this.username = username;
    }

    public Address() throws SQLException, ClassNotFoundException {
        Class.forName(DBProperties.DRIVER);
        Connection con = DriverManager.getConnection(DBProperties.URL,DBProperties.USERNAME,DBProperties.PASSWORD);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT a.city, c.lastname, u.username FROM CUSTOMER c INNER JOIN ADDRESS a ON c.idaddress=a.idaddress INNER JOIN USERS u ON c.iduser=u.iduser;");
        rs.next();
        this.city=rs.getString("city");
        this.lastname=rs.getString("lastname");
        this.username=rs.getString("username");
        con.close();
    }
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.city);
        hash = 29 * hash + Objects.hashCode(this.lastname);
        hash = 29 * hash +Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", lastname=" + lastname + ", username=" + username + '}';
    }
 
    //Todo


}
