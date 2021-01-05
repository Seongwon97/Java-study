package myPackage;
import java.util.Scanner;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Movie movie1 =new Movie();
		Movie movie2 =new Movie();;
		String name, mpaa;
		int i=0, rate;
		
		
		System.out.print("Enter the movie name: ");
		name = keyboard.nextLine();
		System.out.print("Enter the movie mpaa: ");
		mpaa = keyboard.nextLine();
		movie1.setName(name);
		movie1.setMpaa(mpaa);
		System.out.println("Please enter 5 movie ratings. ");
		while (i<5) {
			rate = keyboard.nextInt();
			movie1.addRating(rate);
			i++;
		}
		System.out.println(movie1.getAverage());
		
		i=0;
		System.out.print("Enter the movie name: ");
		keyboard.nextLine();
		name = keyboard.nextLine();
		System.out.print("Enter the movie mpaa: ");
		mpaa = keyboard.nextLine();
		movie2.setName(name);
		movie2.setMpaa(mpaa);
		System.out.println("Please enter 5 movie ratings. ");
		while (i<5) {
			rate = keyboard.nextInt();
			movie2.addRating(rate);
			i++;
		}
		System.out.println(movie2.getAverage());
		
		System.out.println(movie1.equals(movie2)? ("Same") : ("Different"));
	}

}
