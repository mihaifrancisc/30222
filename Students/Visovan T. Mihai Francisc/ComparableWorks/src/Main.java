import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args){
	
		Random random = new Random();
		Person[] person = new Person[5];
		String[] persons = {"Ana", "Alex", "Anton", "Maria", "Rapunzel"};
		
		for(int i = 0; i < 4; i++)
			{
			int nr = random.nextInt(4);
			person[i] = new Person(persons[nr]);
			}
		
		Arrays.sort(person);
		int i;
		for(i = 0; i < 4; i++)
		{
			System.out.println(person[i].getID() + " " + person[i].getName());
		}
}
}

/*package newProject;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] argv){
	final int nrOfPerson = 5;
	int nr = 0;
	Person[] person = new Person[nrOfPerson];
	String[] names = {"Mike", "John", "Alex", "Petter", "Brian"};
	Random random = new Random();
	for(int i = 0; i < nrOfPerson; i++){
		nr = random.nextInt(nrOfPerson);
		person[i] = new Person(names[nr]);
	}
	
	Arrays.sort(person);
	for(int i = 0; i < nrOfPerson; i++)
		System.out.println(person[i].getID() + "     "+ person[i].getName() +  " ");
	}
}





*/