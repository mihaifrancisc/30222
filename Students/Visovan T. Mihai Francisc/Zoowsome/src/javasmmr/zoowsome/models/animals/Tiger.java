package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Tiger extends Mammal{
	

	public Tiger(){
		super(7.0, 0.7);
		super.nrOfLegs = 4;
		super.normalBodyTemp = 37.5F;
		super.percBodyHair = 80.2F;
		super.name = "Tiger";
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);  
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.TIGER);
		
	}
	 

}
