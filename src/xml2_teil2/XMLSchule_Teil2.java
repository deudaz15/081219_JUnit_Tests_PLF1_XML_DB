package xml2_teil2;

import java.io.File;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import xml1_teil1.Klasse;
import static xml1_teil1.XMLSchule_Teil1.XML_FILE_ELEMENT_NAME_KLASSE;



public class XMLSchule_Teil2 {

    public Document changeKlassenSchuelerAnzahl(String ort, int neueSchueler)
            throws IOException, JDOMException
    {
        XMLAccess acc = new XMLAccess.InstanceHolder().getInstance();
        
        File f = new File(xml_config.XMLConfig.XMLPATH);
        f.createNewFile();
        Document doc = acc.loadAsDocument();
        Element root = doc.getRootElement();
        
        Element klasse = root.getChild(XML_FILE_ELEMENT_NAME_KLASSE);
        
        for(Element e : klasse.getChildren()){
            if(e.getValue().equals(ort)){
                e.setAttribute(Klasse.XML_FILE_ELEMENT_ATTRIBUTE_ORT_SCHUELER, "" + neueSchueler);
            }
        }
        
        return doc;
    }

    public static void main(String[] args)
            throws IOException, JDOMException
    {
      XMLSchule_Teil2 t2 = new XMLSchule_Teil2();
      
      XMLAccess acc = new XMLAccess.InstanceHolder().getInstance();
      acc.writeDocumentToFile(t2.changeKlassenSchuelerAnzahl("4AHIF", 21));
    }
}
