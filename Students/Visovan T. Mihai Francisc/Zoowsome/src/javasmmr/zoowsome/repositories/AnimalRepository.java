package javasmmr.zoowsome.repositories;
import javax.xml.stream.events.*;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import java.util.*;

import javasmmr.zoowsome.models.interfaces.XML_Parsable; 
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

import org.xml.sax.SAXException;
import org.w3c.dom.*;


public class AnimalRepository{

	private static final String XML_FILENAME = "Animals.xml";  
	 public AnimalRepository() {  
	 }  
	 public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {  
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
		 
	  for (XML_Parsable animal : animals) {    
			 StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);    
			 eventWriter.add(sElement);    
			 eventWriter.add(end);  
			  	
			 animal.encodeToXml(eventWriter); 
			  	
			 EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);   
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
	 
	 
	 public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {  
		  ArrayList<Animal> animals = new ArrayList<Animal>();  
		  File fXmlFile = new File(XML_FILENAME);   
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();  
		  Document doc = dBuilder.parse(fXmlFile);   
		  doc.getDocumentElement().normalize();  
		  NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);  
		  	for (int i = 0; i < nodeList.getLength(); i++) {   
		  		Node node = nodeList.item(i);    
		  		if (node.getNodeType() == Node.ELEMENT_NODE) {     
		  			Element element = (Element) node;
		  			String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		  			switch (discriminant) {     
		  			case Constants.Animals.Insects.BUTTERFLY:      
		  				Animal butterfly = new Butterfly();      
		  				butterfly.decodeFromXml(element);     
		  				animals.add(butterfly); 
		  			case Constants.Animals.Insects.ANT:      
		  				Animal ant = new Ant();      
		  				ant.decodeFromXml(element);     
		  				animals.add(ant); 
		  			case Constants.Animals.Insects.SPIDER:      
		  				Animal spider = new Spider();      
		  				spider.decodeFromXml(element);     
		  				animals.add(spider);
		  			case Constants.Animals.Aquatics.DOLPHIN:      
		  				Animal dolphin = new Dolphin();      
		  				dolphin.decodeFromXml(element);     
		  				animals.add(dolphin); 
		  			case Constants.Animals.Aquatics.WHALE:      
		  				Animal whale = new Whale();      
		  				whale.decodeFromXml(element);     
		  				animals.add(whale);
		  			case Constants.Animals.Aquatics.SHARK:      
		  				Animal shark = new Shark();      
		  				shark.decodeFromXml(element);     
		  				animals.add(shark);
		  			case Constants.Animals.Birds.CROW:      
		  				Animal crow = new Crow();      
		  				crow.decodeFromXml(element);     
		  				animals.add(crow);
		  			case Constants.Animals.Birds.EAGLE:      
		  				Animal eagle = new Eagle();      
		  				eagle.decodeFromXml(element);     
		  				animals.add(eagle);
		  			case Constants.Animals.Birds.PARROT:      
		  				Animal parrot = new Parrot();      
		  				parrot.decodeFromXml(element);     
		  				animals.add(parrot);
		  			case Constants.Animals.Mammals.COW:      
		  				Animal cow = new Cow();      
		  				cow.decodeFromXml(element);     
		  				animals.add(cow);
		  			case Constants.Animals.Mammals.MONKEY:      
		  				Animal monkey = new Monkey();      
		  				monkey.decodeFromXml(element);     
		  				animals.add(monkey);
		  			case Constants.Animals.Mammals.TIGER:      
		  				Animal tiger = new Tiger();      
		  				tiger.decodeFromXml(element);     
		  				animals.add(tiger);
		  			case Constants.Animals.Reptiles.CROCODILE:      
		  				Animal crocodile = new Crocodile();      
		  				crocodile.decodeFromXml(element);     
		  				animals.add(crocodile);
		  			case Constants.Animals.Reptiles.SNAKE:      
		  				Animal snake = new Snake();      
		  				snake.decodeFromXml(element);     
		  				animals.add(snake);
		  			case Constants.Animals.Reptiles.TORTOISE:      
		  				Animal tortoise = new Tortoise();      
		  				tortoise.decodeFromXml(element);
		  				animals.add(tortoise);
		  				default: 
		  					break;    
		  					}   
		  			}   
		  		}  
		  	return animals;
		  	}

}
