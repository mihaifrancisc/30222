package javasmmr.zoowsome.repositories;
import javax.xml.stream.events.*;

import java.io.*;

import javax.xml.parsers.*;
import javax.xml.stream.*;

import java.util.*;

import javasmmr.zoowsome.models.interfaces.XML_Parsable; 
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.Constants;

import org.xml.sax.SAXException;
import org.w3c.dom.*;


public class EmployeeRepository{

	private static final String XML_FILENAME = "Employees.xml";  
	 public EmployeeRepository() {  
	 }  
	 public void save(ArrayList <Caretaker> caretakers) throws FileNotFoundException, XMLStreamException {  
		 XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();  
		 // Create XMLEventWriter  
		 XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		 // Create a EventFactory   
		 XMLEventFactory eventFactory = XMLEventFactory.newInstance();  
		 XMLEvent end = eventFactory.createDTD("\n"); 
		 // Create and write Start Tag   
		 StartDocument startDocument = eventFactory.createStartDocument(); 
		 eventWriter.add(startDocument);   
		 // Create content open tag   
		 StartElement configStartElement = eventFactory.createStartElement("", "", "content"); 
		 eventWriter.add(configStartElement);   
		 eventWriter.add(end);  
		 
	  for (XML_Parsable caretaker : caretakers) {    
			 StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.CARETAKER);    
			 eventWriter.add(sElement);    
			 eventWriter.add(end);  
			  	
			 caretaker.encodeToXml(eventWriter); 
			  	
			 EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.CARETAKER);   
			 eventWriter.add(eElement);    
			 eventWriter.add(end);   
			 }  
	  
		  eventWriter.add(eventFactory.createEndElement("", "", "content"));  
		  eventWriter.add(eventFactory.createEndDocument());  
		  eventWriter.close();  }  
	 
	 public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		 XMLEventFactory eventFactory = XMLEventFactory.newInstance(); 
		 XMLEvent end = eventFactory.createDTD("\n");  
		 XMLEvent tab = eventFactory.createDTD("\t");   
		 // Create Start node  
		 StartElement sElement = eventFactory.createStartElement("", "", name);  
		 eventWriter.add(tab);   
		 eventWriter.add(sElement);   
		 // Create Content   
		 Characters characters = eventFactory.createCharacters(value); 
	 
	  eventWriter.add(characters);   // Create End node  
	  EndElement eElement = eventFactory.createEndElement("", "", name);  
	  eventWriter.add(eElement);   
	  eventWriter.add(end);  }
	 
	 
	 public ArrayList<Caretaker> load() throws ParserConfigurationException, SAXException, IOException {  
		  ArrayList<Caretaker> caretakers = new ArrayList<Caretaker>();  
		  File fXmlFile = new File(XML_FILENAME);   
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();  
		  Document doc = dBuilder.parse(fXmlFile);   
		  doc.getDocumentElement().normalize();  
		  NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.CARETAKER);  
		  	for (int i = 0; i < nodeList.getLength(); i++) {   
		  		Node node = nodeList.item(i);    
		  		if (node.getNodeType() == Node.ELEMENT_NODE) {     
		  			Element element = (Element) node;
		  			String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		  			switch (discriminant) {     
		  			case Constants.Animals.Insects.BUTTERFLY:      
		  				Caretaker caretaker= new Caretaker();      
		  				caretaker.decodeFromXml(element);     
		  				caretakers.add(caretaker);
		  				default: 
		  					break;    
		  					}   
		  			}   
		  		}  
		  	return caretakers;
		  	}

}
