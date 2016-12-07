
public class Toys implements MultiPiecesToy_I{
	
	
	String name;
	int price;
	String type;
	
	public Toys(String name, int price, String type){
		this.name = name;
		this.price = price;
		this.type = type;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void countPieces() {
		// TODO Auto-generated method stub
		
	}
	
}
