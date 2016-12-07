package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Monkey extends Mammal{
	

	public Monkey(){
		
		super(6.3,0.5);
		super.nrOfLegs = 2;
		super.normalBodyTemp = 32.5F;
		super.percBodyHair = 40.2F;
		super.name = "Monkey";
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.MONKEY);
		
	}
	
}