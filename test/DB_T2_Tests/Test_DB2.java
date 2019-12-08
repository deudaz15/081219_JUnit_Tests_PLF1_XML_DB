/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_T2_Tests;

import db_teil1.Insurance;
import db_teil2.Address;
import db_teil2.DBAccess_Teil2;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class Test_DB2
{
    
    public Test_DB2()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testDB_Teil2(){
//        try
//        {
//            List<Address> result;
//            List<Address> expected;
//            result = DBAccess_Teil2.getAddresses(1);
//            
//            expected = new ArrayList();
//            
//            Insurance insurance = null;
//            for(int id = 1; id <= result.size(); id++){
//                //get from results where id = i
//                for(int j = 0; j < result.size(); j++){
//                    System.out.println(result.get(j));
//                    if(result.get(j).getPiduser().equals(id)){
//                        insurance = result.get(j);
//                        break;
//                    }
//                }
//                
//                assertEquals(expected.get(id), insurance.getInsName());
//            }
//            
//            //assertEquals("[[2, car], [5, fire], [1, life], [3, pet], [6, risk], [4, vehicle]]", DBAccess_Teil1.getInsurance());
//        } catch (SQLException ex)
//        {
//            System.err.println("Something wrong with sql or db part.");
//        } catch (ClassNotFoundException ex)
//        {
//            System.err.println("Problems with the postgresql driver?");
//        }
    }
    
}
