

public class Adult extends Identity {
	
	public String name;
	public int age;
	public int budget;
	public int purchasedToys;
	public int guid;
	
	public Adult(String name, int age, int budget){
		super.name = name;
		super.age = age;
		super.budget = budget;
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
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public void setPurchasedToys(int purchasedToys) {
		this.purchasedToys = purchasedToys;
	}
	
	public int getPurchasedToys(int purchasedToys) {
		purchasedToys++;
		return purchasedToys;
	}

	
}
