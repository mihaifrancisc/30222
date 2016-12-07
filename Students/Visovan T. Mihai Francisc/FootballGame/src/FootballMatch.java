
public class FootballMatch implements FootballMatch_i {

	private String homeTeamName;
	private String awayTeamName;
	private int homeTeamScore;
	private int awayTeamScore;
	
	public FootballMatch(String homeTeamName,String awayTeamName){
		this.homeTeamName = homeTeamName;
		this.awayTeamName = awayTeamName;
		
	}

	@Override
	public String getHomeTeamName() {
		// TODO Auto-generated method stub
		return homeTeamName;
	}

	@Override
	public void setHomeTeamName(String homeTeamName){
		// TODO Auto-generated method stub
		this.homeTeamName = homeTeamName;
	}

	@Override
	public String getAwayTeamName() {
		// TODO Auto-generated method stub
		return awayTeamName;
	}

	@Override
	public void  setAwayTeamName(String homeTeamName) {
		// TODO Auto-generated method stub
		this.awayTeamName = awayTeamName;
	}

	@Override
	public void homeTeamScore() {
		// TODO Auto-generated method stub
		this.homeTeamScore++;
	}

	@Override
	public void awayTeamScore() {
		// TODO Auto-generated method stub
		this.awayTeamScore++;
	}
	
	public void Print(){
		System.out.println("Scorul este " + homeTeamScore +":" + awayTeamScore);
	}
}
