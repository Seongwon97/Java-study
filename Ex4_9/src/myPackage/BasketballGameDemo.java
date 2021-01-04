package myPackage;
import java.util.Scanner;

public class BasketballGameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		BasketballGame game = new BasketballGame();
		System.out.print("Enter the first team name: ");
		String team1=keyboard.nextLine();
		System.out.print("Enter the second team name: ");
		String team2=keyboard.nextLine();
		String tempS;
		int tempI;
		game.setTeamA(team1);
		game.setTeamB(team2);
		int a=1;
		while(a>0) {
			System.out.println("Enter a score:");
			tempS = keyboard.next();
			tempI = keyboard.nextInt();
			game.setGoalScore(tempI);
			game.addScore(tempS);
			game.nowScore();
		}
	}

}
