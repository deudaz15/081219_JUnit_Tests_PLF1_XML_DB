package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DB_T1_Tests.Test_DB1;
import DB_T2_Tests.Test_DB2;
import XML_T1_Tests.Test_XML1;
import XML_T2_Tests.Test_XML2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author owner
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
{Test_DB1.class, Test_DB2.class, Test_XML1.class, Test_XML2.class
})
public class Controller
{

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }
    
}
