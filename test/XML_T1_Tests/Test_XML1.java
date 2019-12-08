/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML_T1_Tests;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.JDOMException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xml1_teil1.Klasse;
import xml1_teil1.XMLSchule_Teil1;

/**
 *
 * @author owner
 */
public class Test_XML1
{
    
    public Test_XML1()
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
    public void testXML_T1(){
        try
        {
            assertEquals(24, XMLSchule_Teil1.changeKlassenSchuelerAnzahl("4AHIF", 24).getSchueler());
        } catch (IOException ex)
        {
            System.err.println("File not found?");
        } catch (JDOMException ex)
        {
            System.err.println("Problem with XML");
        }
    }
}
