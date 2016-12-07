package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;



public class Ant extends Insect  {


	
	public Ant(){
		
		super(0.5,0.0);
		super.nrOfLegs = 6;
		super.isDangerous = false;
		super.canItFly = false;
		super.name = "Ant";
		
	}


	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.ANT);
		}


	@Override
	public boolean kill() {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
