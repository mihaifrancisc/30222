package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Snake extends Reptile {


	public Snake(){
		super(8.0,0.8);
		super.nrOfLegs = 0;
		super.layEggs = true;
		super.name = "Snake";
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.SNAKE);
		
	}
	
}
