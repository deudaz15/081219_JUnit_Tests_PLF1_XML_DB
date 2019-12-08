package xml1_teil1;

import java.io.File;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;

public class XMLSchule_Teil1 {
    public static final String XML_FILE_ELEMENT_NAME_KLASSE = "Klasse";

    public static Klasse changeKlassenSchuelerAnzahl(String ort, int neueSchueler)
            throws IOException, JDOMException
    {
        File f = new File(xml_config.XMLConfig.XMLPATH);
        Document doc = XMLReader.parseFile(f);
        Element root = doc.getRootElement();
        
        Element klasse = root.getChild(XML_FILE_ELEMENT_NAME_KLASSE);
        
        for(Element e : klasse.getChildren()){
            if(e.getValue().equals(ort)){
                e.setAttribute(Klasse.XML_FILE_ELEMENT_ATTRIBUTE_ORT_SCHUELER, "" + neueSchueler);
            }
        }
        
        XMLWriter.write(doc, f);
        
        return new Klasse(klasse);
    }

    public static void main(String[] args)
            throws IOException, JDOMException
    {
        System.out.println(changeKlassenSchuelerAnzahl("4AHIF", 123));
        System.out.println(changeKlassenSchuelerAnzahl("4AHIF", 24));
    }
}
