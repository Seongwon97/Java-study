package myPackage;

import java.util.ArrayList;

public class Ex14_1a {
	public static ArrayList<String> aList=new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s={"a","b","c","d","e","f","a"};
		arrayToArrayList(s);
		removeFromArrayList(aList,"a");
		System.out.println(aList);
	}

	public static ArrayList<String> arrayToArrayList(String []s){
		for(int i=0; i<s.length;i++) {
			aList.add(s[i]);
		}
		return aList;
	}
	
	public static void removeFromArrayList(ArrayList<String> list,String s) {
		for(int i=0; i<list.size();i++) {
			if(list.contains(s))
				list.remove(s);
		}
	}

}
