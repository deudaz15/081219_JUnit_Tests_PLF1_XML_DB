
package xml1_teil1;

import org.jdom2.Element;

public class Klasse {
    public static final String XML_FILE_ELEMENT_NAME_KLASSE_ORT = "Ort";
    public static final String XML_FILE_ELEMENT_ATTRIBUTE_ORT_SCHUELER = "Schueler";
    public static final String XML_FILE_ELEMENT_NAME_KLASSE_UNTERRICHT = "Unterricht";
    
   private String ort;
   private int schueler;
   private String unterricht;

    public Klasse(Element e)
    {
        Element ort = e.getChild(XML_FILE_ELEMENT_NAME_KLASSE_ORT);
        this.ort = ort.getValue();
        this.schueler = Integer.parseInt(ort.getAttribute(XML_FILE_ELEMENT_ATTRIBUTE_ORT_SCHUELER).getValue());
        
        this.unterricht = e.getChild(XML_FILE_ELEMENT_NAME_KLASSE_UNTERRICHT).getValue();
        
    }

    public Klasse(String ort, int schueler, String unterricht)
    {
        this.ort = ort;
        this.schueler = schueler;
        this.unterricht = unterricht;
    }
    

   
   
    @Override
    public String toString() {
        return "Klasse{" + "ort=" + ort + ", schueler=" + schueler + ", unterricht=" + unterricht + '}';
    }
 
    //todo

    public String getOrt()
    {
        return ort;
    }

    public int getSchueler()
    {
        return schueler;
    }

    public String getUnterricht()
    {
        return unterricht;
    }

    
}
