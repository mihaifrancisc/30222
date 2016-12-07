import java.util.UUID;



public class Person implements Comparable<Person> {

	public String guid;
	public String name;
	
	public Person(){}
	
	public Person(String name){
		this.name = name;
		this.getGUID();
	}
	
	public int compareTo(Person person){
		return this.name.compareTo(person.name);
	}
	
	public void getGUID(){
	
	UUID uuid = UUID.randomUUID();
    this.guid = uuid.toString();
	}
	
	public String getName(){
		return this.name;
	}
    
	
	public String getID(){
		return this.guid;
	}
}
