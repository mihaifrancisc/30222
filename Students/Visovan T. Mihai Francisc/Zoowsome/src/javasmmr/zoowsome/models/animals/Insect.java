package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {

	
	boolean canItFly;
	boolean isDangerous;
	
	public Insect(double maintenanceCost, double damagePerc) {
		super(maintenanceCost, damagePerc);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isCanItFly() {
		return canItFly;
	}
	public void setCanItFly(boolean canItFly) {
		this.canItFly = canItFly;
	}
	
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "canFly", String.valueOf(isCanItFly())); 
		createNode(eventWriter, "isDangerous", String.valueOf(isDangerous()));
		}
	
	public void decodeFromXml(Element element) {  
		setCanItFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));  
		setDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		} 
}
