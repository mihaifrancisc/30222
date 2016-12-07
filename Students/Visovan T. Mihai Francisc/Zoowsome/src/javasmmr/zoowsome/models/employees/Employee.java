package javasmmr.zoowsome.models.employees;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.*;
import java.util.Random;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Employee implements XML_Parsable{

	

	long rangeMin = 1000000000000l;
	long rangeMax = 9999999999999l;
	int numberOfTakenCareOf = 0;
	Random r = new Random();
	long id = rangeMin + (rangeMax - rangeMin) * r.nextLong();
	
	String name;
	BigDecimal salary;
	boolean isDead = false;
	public Employee(){
	
	}
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
	
	
	public int getNumberOfTakenCareOf() {
		return numberOfTakenCareOf;
	}

	public void setNumberOfTakenCareOf(int numberOfTakenCareOf) {
		this.numberOfTakenCareOf = numberOfTakenCareOf;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public boolean getisDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
		createNode(eventWriter, "isDead", String.valueOf(this.getisDead()));
		createNode(eventWriter, "name", String.valueOf(this.getName()));
		createNode(eventWriter, "id", String.valueOf(this.getId()));
		createNode(eventWriter, "salary", String.valueOf(this.getSalary()));
		createNode(eventWriter, "numberOfTakenCareOf", String.valueOf(this.getNumberOfTakenCareOf()));
	  }
	
	public void decodeFromXml(Element element) {  
		 
		setNumberOfTakenCareOf(Integer.valueOf(element.getElementsByTagName("numberOfTakenCareOf").item(0).getTextContent()));
		setDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
		//setSalary(BigDecimal.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));
		setName(String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()));
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));

		} 

	
}
