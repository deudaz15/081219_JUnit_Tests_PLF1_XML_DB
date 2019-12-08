/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml1_teil1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author owner
 */
public class XMLWriter
{
    public static void write(Document doc, File f)
            throws IOException
    {
        XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
        out.output(doc, new FileWriter(f));
    }
}
