package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Eagle extends Bird{
	
	public Eagle(){
		super(5.0,0.4);
		super.nrOfLegs = 2;
		super.avgFlightAltitude = 2000;
		super.migrates = true;
		super.name = "Eagle";
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.EAGLE);
		
	}
	

}
