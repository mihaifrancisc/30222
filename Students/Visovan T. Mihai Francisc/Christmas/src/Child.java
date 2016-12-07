import java.util.UUID;


public class Child extends Identity{
	

	public String name;
	public int age;
	public int bugdet;
	public int purchasedToys = 0;
	public String guid;
	
	public Child(String name, int age, int budget){
		super.name = name;
		super.age = age;
		super.budget = budget;
	}

	public int getBugdet() {
		return bugdet;
	}
	public void setBugdet(int bugdet) {
		this.bugdet = bugdet;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPurchasedToys(int purchasedToys) {
		this.purchasedToys = purchasedToys;
	}
	
	public int getPurchasedToys(int purchasedToys) {
		purchasedToys++;
		return purchasedToys;
	}
	
	public void getGUID(){
		
		UUID uuid = UUID.randomUUID();
	    this.guid = uuid.toString();
	}

	
	
}
