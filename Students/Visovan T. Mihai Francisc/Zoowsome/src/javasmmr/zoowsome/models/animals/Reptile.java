package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal{
	


	boolean layEggs;
	
	public Reptile(double maintenanceCost, double damagePerc) {
		super(maintenanceCost, damagePerc);
		// TODO Auto-generated constructor stub
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "layEggs", String.valueOf(isLayEggs()));
		
	}
	public void decodeFromXml(Element element) {  
		setLayEggs(Boolean.valueOf(element.getElementsByTagName("layEggs").item(0).getTextContent()));  
		} 
}
