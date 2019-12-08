package db_teil2;

import db_config.DBProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;


public class Address {

    private Integer id, number;
    private String street, city, zip, country;

    public Address(Integer id, Integer number, String street, String city, String zip, String country)
    {
        this.id = id;
        this.number = number;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    

    public Integer getId()
    {
        return id;
    }

    public Integer getNumber()
    {
        return number;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public String getZip()
    {
        return zip;
    }

    public String getCountry()
    {
        return country;
    }

    @Override
    public String toString()
    {
        return "Address{" + "id=" + id + ", number=" + number + ", street=" + street + ", city=" + city + ", zip=" + zip + ", country=" + country + '}';
    }
    
    
}
