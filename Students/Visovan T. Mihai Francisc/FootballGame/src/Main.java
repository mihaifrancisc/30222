import java.util.Random;


public class Main {

	public static Random random = new Random();
	
	public static void main(String[] args){
		
		for (int i = 0; i < 100; i++) {
			simulateMatch();
		}
			
	
	}
	
	public static void simulateMatch() {
		FootballMatch football = new FootballMatch("CFR","STEAUA");
		for(int i = 0; i < football.FULL_TIME; i++){
			if(random.nextInt(football.FULL_TIME) == i){
				if(random.nextBoolean())
					football.awayTeamScore();
				else
					football.homeTeamScore();
				
			}
				
		}
		football.Print();
	}
}
