/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML_T2_Tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import xml2_teil2.XMLSchule_Teil2;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class Test_XML2
{
    
    private XMLSchule_Teil2 t2;
    
    public Test_XML2()
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
        t2 = new XMLSchule_Teil2();
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
    public void testXML_T2(){
        try
        {
            Document expected = new SAXBuilder().build(new File("test/XML_T2_Tests/test.xml"));
            Document result = t2.changeKlassenSchuelerAnzahl("4AHIF", 240);
            
            Element r1 = expected.getRootElement();
            Element r2 = result.getRootElement();
            
            assertEquals(r1.getName(), r2.getName());
            assertEquals(r1.getValue(), r2.getValue());
            assertEquals(r1.getAttributes(), r2.getAttributes());
           
            
            List<Element> expectedEs = r1.getChildren();
            List<Element> resultEs = r2.getChildren();
            
            assertEquals(expectedEs, resultEs);
            
            
        } catch (JDOMException ex)
        {
            System.err.println("Error with xml");
        } catch (IOException ex)
        {
            System.err.println("File not found?");
        }
    }
    
    
}
