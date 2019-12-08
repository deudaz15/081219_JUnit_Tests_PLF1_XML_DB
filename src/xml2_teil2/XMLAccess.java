/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml2_teil2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author owner
 */
public class XMLAccess
{
    private XMLAccess(){
        
    }
    
    public Document loadAsDocument()
        throws IOException, JDOMException
    {
        return new SAXBuilder().build(xml_config.XMLConfig.XMLPATH_NEU);
    }
    
    public void writeDocumentToFile(Document doc)
        throws IOException, JDOMException
    {
        XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
        
        //create new file
        File n = new File("src/schule_nue.xml");
        if(!n.exists()){
            n.createNewFile();
        }
        out.output(doc, new FileWriter(n));
    }
    
    public static class InstanceHolder{
        private XMLAccess instance = null;
        
        public XMLAccess getInstance(){
            if(instance == null){
                instance = new XMLAccess();
            }
            return instance;
        }
    }

}
