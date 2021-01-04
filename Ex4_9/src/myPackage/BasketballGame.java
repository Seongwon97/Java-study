package myPackage;

public class BasketballGame {
	private int aTeamScore=0, bTeamScore=0;
	private int goalScore;
	private String teamA, teamB;
	
	public void addScore(String ab) {
		if(ab.equals("a")) {
			aTeamScore = aTeamScore + goalScore;
		}
		else if(ab.equals("b")) {
			bTeamScore = bTeamScore + goalScore;
		}
		else {
			System.out.println("Please Enter the correct values ");
			System.exit(0);
		}
	}
	
	public void nowScore() {
		System.out.print(teamA + " "+ aTeamScore + ", "+ teamB+ " "+bTeamScore+ ";  ");
		if(aTeamScore > bTeamScore)
			System.out.println(teamA+" are winning.");
		else if(aTeamScore == bTeamScore)
			System.out.println("Draw, the score is the same");
		else if(aTeamScore < bTeamScore)
			System.out.println(teamB+" are winning.");
	}

	public int getGoalScore() {
		return goalScore;
	}
	public void setGoalScore(int newgoalScore) {
		if((newgoalScore>0) && (newgoalScore<=3))
			goalScore = newgoalScore;
		else {
			System.out.println("Enter the right score");
			System.exit(0);
		}
	}
	public String getTeamA() {
		return teamA;
	}
	public void setTeamA(String newteamA) {
		teamA = newteamA;
	}
	public String getTeamB() {
		return teamB;
	}
	public void setTeamB(String newteamB) {
		teamB = newteamB;
	}
	
}
