import java.util.Random;
import java.util.UUID;

public class Shop {
	
	public static void main(String[] args){
		
		String toysName[] = {"Bear", "Super-Man", "Fairy" ,"Robot", "Car", "Princess", "Book",};
		String names[] = {"Andrew", "Jonas", "Maria" ,"Alexandra", "Alex", "Michael", "Steward"};
		int ages[] = {15, 17, 18, 18, 12, 9, 6, 5, 8, 25, 30, 45, 50, 35};
		int budgets[] = {300, 250, 150, 100, 50, 10};
		int prices[] = {250, 150, 400, 100, 50, 25};
		int purchasedToys1 = 0;
		int purchasedToys2 = 0;

			
		int numberOfChildren = 5;
		int numberOfAdults = 4;
		int numberOfToys = 6;
		
		Random random = new Random();
		
		Adult[] adult = new Adult[numberOfAdults];
		Child[] child = new Child[numberOfChildren];
		Toys[] toys = new Toys[numberOfToys];
		
		for(int i = 0; i < numberOfToys; i++){
			int nr = random.nextInt(numberOfToys);
			if(toysName[nr] == "Bear " ||  toysName[nr] == "Super-Man" || toysName[nr] == "Fairy" || toysName[nr] == "Princess" ){
				toys[i] = new Toys(toysName[nr], prices[nr],Constants.DOLL);}
			else
				if(toysName[nr] == "Robot" || toysName[nr] == "Car"){
					toys[i] = new Toys(toysName[nr], prices[nr], Constants.CAR);
				}
			else{
				toys[i] = new Toys(toysName[nr], prices[nr],Constants.EDCUATIONAL);
			}
					
		}
		
		for(int i = 0; i < numberOfAdults; i++){
			int nr1 = random.nextInt(numberOfAdults);
			if(ages[nr1] >= 19)
			adult[i] = new Adult(names[nr1],ages[nr1],budgets[nr1]);
		
		}
		
		for(int i = 0; i < numberOfChildren; i++){
			int nr2 = random.nextInt(numberOfChildren);
			if(ages[nr2] < 19){
				child[i] = new Child(names[nr2], ages[nr2], budgets[nr2]);
			}
		}
		
	int shopping = 4;
		
	for(int i = 0; i < shopping; i++){
		int nr3 = random.nextInt(shopping);
		
		if(child[nr3].budget > toys[nr3].getPrice() && child[nr3].age > 14){
			child[nr3].getPurchasedToys(purchasedToys1);
			child[nr3].budget = child[nr3].budget - toys[nr3].price;
		}
		
		if(adult[nr3].budget > toys[nr3].getPrice()){
			adult[nr3].getPurchasedToys(purchasedToys2);
			adult[nr3].budget = adult[nr3].budget - toys[nr3].price;
		}
		
	
	}
	for(int i = 0; i < shopping; i++){
		System.out.println("The children" + child[i].getName() + "has bought" + child[i].purchasedToys);
		System.out.println("The adult" + adult[i].getName() + "has bought" + adult[i].purchasedToys);
		
	}
}
}


