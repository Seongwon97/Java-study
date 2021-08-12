package myPackage;

import java.util.HashMap;
import java.util.Scanner;

public class Ex14_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		HashMap<Integer, Integer> test=new HashMap<Integer, Integer>();
		int num, count=1;
		System.out.println("Enter the number ");
		System.out.println("if push -1 program is exited");
		while(true) {
			num=kb.nextInt();
			if(num==-1) {
				System.out.println("End");
				break;
			}else {
				Integer temp=new Integer(num);
				if(test.containsKey(temp)==false) {
					test.put(temp,1);
				}else {
					Integer temp1=new Integer(num);
					count++;
					test.put(temp1, count);
				}
			}
		}
		for(Integer number: test.keySet()) {
			Integer time=test.get(number);
			System.out.println("The number "+number+" occurs "+time.intValue()+" times.");
		}
	}

}
