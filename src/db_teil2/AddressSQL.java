/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_teil2;

/**
 *
 * @author sasch
 */
public class AddressSQL {
    public static final String PSTMT_FIND_ADDRESS_BY_USERID="SELECT a.idaddress, a.street, a.\"number\", a.zipcode, a.city, a.country FROM CUSTOMER c INNER JOIN ADDRESS a ON c.idaddress=a.idaddress INNER JOIN USERS u ON c.iduser=u.iduser WHERE u.iduser = ?";
}
