/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_T1_Tests;

import db_teil1.DBAccess_Teil1;
import db_teil1.Insurance;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
public class Test_DB1
{
    
    public Test_DB1()
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
    public void testDB_Teil1(){
        try
        {
            List<Insurance> result;
            Map<Integer, String> expected;
            result = DBAccess_Teil1.getInsurance();
            
            expected = new TreeMap();
            expected.put(1, "life");
            expected.put(2, "car");
            expected.put(3, "pet");
            expected.put(4, "vehicle");
            expected.put(5, "fire");
            expected.put(6, "risk");
            
            Insurance insurance = null;
            for(int id = 1; id <= result.size(); id++){
                //get from results where id = i
                for(int j = 0; j < result.size(); j++){
                    System.out.println(result.get(j));
                    if(result.get(j).getPiduser().equals(id)){
                        insurance = result.get(j);
                        break;
                    }
                }
                
                assertEquals(expected.get(id), insurance.getInsName());
            }
            
            //assertEquals("[[2, car], [5, fire], [1, life], [3, pet], [6, risk], [4, vehicle]]", DBAccess_Teil1.getInsurance());
        } catch (SQLException ex)
        {
            System.err.println("Something wrong with sql or db part.");
        } catch (ClassNotFoundException ex)
        {
            System.err.println("Problems with the postgresql driver?");
        }
    }
}
