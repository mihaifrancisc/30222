package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Butterfly extends Insect {


	public Butterfly(){
		super(1.0, 0.0);
		super.nrOfLegs = 4;
		super.isDangerous = false;
		super.canItFly = true;
		super.name = "Butterfly";
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.BUTTERFLY);
		
	}
}
