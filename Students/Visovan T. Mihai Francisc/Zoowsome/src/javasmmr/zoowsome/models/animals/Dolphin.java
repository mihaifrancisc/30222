package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Dolphin extends Aquatic{
	

	public Dolphin(){
		super(3.0,0.1);
		super.nrOfLegs = 2;
		super.avgSwimDepth = 500;
		super.name = "Crow";
	
		
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.DOLPHIN);
		
	}


}
