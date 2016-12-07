package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.*;
import org.w3c.dom.Element;

public abstract class Animal implements Killer, XML_Parsable{

	
	
	double rangeMin = 0.7;
	double rangeMax = 1;
	Random r = new Random();
	double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	public double getPredisposition(){
		return 0;
	}

	public int nrOfLegs;
	protected String name;
	public double maintenanceCost;
	public double damagePerc;
	public boolean takenCareOf = false;
	
	public Animal(double maintenanceCost, double damagePerc){
		this.maintenanceCost = maintenanceCost;
		this.damagePerc = damagePerc;
	}
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	public void setMaintenanceCost(double maintenanceCost){
		this.maintenanceCost= maintenanceCost;
	}

	public double getDamagePerc() {
		return damagePerc;
	}
	public void setDamagePerc(double damagePerc){
		this.damagePerc = damagePerc;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "damagePerc", String.valueOf(this.damagePerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));  }
	
	public void decodeFromXml(Element element) {  
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));  
		setName(element.getElementsByTagName("name").item(0).getTextContent());  
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDamagePerc(Double.valueOf(element.getElementsByTagName("damagePerc").item(0).getTextContent()));   
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent())); 
		}  
	
}

