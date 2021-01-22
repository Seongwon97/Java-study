package myPackage;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex14_1b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count=0;
		Integer numI;
		Scanner kb=new Scanner(System.in);
		
		ArrayList<Integer>score=new ArrayList<Integer>();
		System.out.println("Enter scores until negative: ");
		while(true) {
			numI=kb.nextInt();
			if(numI<0)
				break;
			count++;
			score.add(numI);
		}
		int size=score.size();
		Double average;
		Double sum=0.;
		for(Integer i=0; i<size; i++) {
			sum+=score.get(i);
		}
		average=(double) (sum/size);
		
		System.out.println("sum: "+sum);
		System.out.println("average: "+average);
		
		System.out.println("score above average: ");
		for(int i=0; i<size; i++) {
			if(score.get(i)>average){
				System.out.println(score.get(i)+" ");		
			}
		}
	
		kb.close();

	}

}