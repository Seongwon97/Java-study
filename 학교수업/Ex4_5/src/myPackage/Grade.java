package myPackage;
import java.util.Scanner;

public class Grade {
	
	Scanner keyboard = new Scanner(System.in);
	private int aCount=0;
	private int bCount=0;
	private int cCount=0;
	private int dCount=0;
	private int fCount=0;
	private int count;
	
	public int getaCount() {
		return aCount;
	}
	public void setaCount(int newAcount) {
		if(newAcount>=0) {
			aCount = newAcount;
		}
		else{
			System.out.println("Error. You entered negetive number. ");
			System.exit(0);
		}
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int newBcount) {
		if(newBcount>=0) {
			bCount = newBcount;
		}
		else{
			System.out.println("Error. You entered negetive number. ");
			System.exit(0);
		}
	}
	public int getcCount() {
		return cCount;
	}
	public void setcCount(int newCcount) {
		if(newCcount>=0) {
			cCount = newCcount;
		}
		else{
			System.out.println("Error. You entered negetive number. ");
			System.exit(0);
		}
	}
	public int getdCount() {
		return dCount;
	}
	public void setdCount(int newDcount) {
		if(newDcount>=0) {
			dCount = newDcount;
		}
		else{
			System.out.println("Error. You entered negetive number. ");
			System.exit(0);
		}
	}
	public int getfCount() {
		return fCount;
	}
	public void setfCount(int newFcount) {
		if(newFcount>=0) {
			fCount = newFcount;
		}
		else {
			System.out.println("Error. You entered negetive number. ");
			System.exit(0);
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
		System.out.println("The total number of student is "+ count);
	}

	
	public void graph() {
		aCount=(int)((float)aCount/count*100);
		bCount=(int)((float)bCount/count*100);
		cCount=(int)((float)cCount/count*100);
		dCount=(int)((float)dCount/count*100);
		fCount=(int)((float)fCount/count*100);
		System.out.println(aCount);
		System.out.println(bCount);
		System.out.println(cCount);
		System.out.println(dCount);
		System.out.println(fCount);
		
		
		System.out.println("0   10   20   30   40   50   60   70   80   90   100");
		System.out.println("|   |    |    |    |    |    |    |    |    |    |");
		System.out.println("**************************************************");
		System.out.print("*");
		for(int i=1;i<=(aCount/2);i++) {
			System.out.print("*");
		}
		
		System.out.println("  A");
		System.out.print("*");
		for(int i=1;i<=(bCount/2);i++) {
			System.out.print("*");
		}
		System.out.println("  B");
		System.out.print("*");
		for(int i=1;i<=(cCount/2);i++) {
			System.out.print("*");
		}
		System.out.println("  C");
		System.out.print("*");
		for(int i=1;i<=(dCount/2);i++) {
			System.out.print("*");
		}
		System.out.println("  D");
		System.out.print("*");
		for(int i=1;i<=(fCount/2);i++) {
			System.out.print("*");
		}
		System.out.println("  F");
	}
}
