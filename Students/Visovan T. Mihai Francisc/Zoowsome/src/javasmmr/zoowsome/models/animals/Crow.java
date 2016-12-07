package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Crow extends Bird {
	

	public Crow(){
		super(2.0,0.1);
		super.nrOfLegs = 2;
		super.avgFlightAltitude = 300;
		super.migrates = true;
		super.name = "Crow";
		
		
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.CROW);
		
	}


}
