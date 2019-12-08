/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml1_teil1;

import java.io.File;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author owner
 */
public class XMLReader
{
    public static Document parseFile(File f)
            throws IOException, JDOMException
    {
        return new SAXBuilder().build(f);
    }
}
