package myPackage;

import java.util.HashSet;

public class Ex14_2b {
	public static HashSet<String> in=new HashSet<String>();		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet 이용해서  arrayToHashSet() removeFromHashSet() 하기
		String[]s= {"a","b","c","d","e","f","a"};
		arrayToHashSet(s);
		removeFromHashSet(in,"a");	
		
		printSet(in);
	}
	
	public static HashSet<String> arrayToHashSet(String []s){
		for(int i=0; i<s.length; i++)
			in.add(s[i]);
		return in;
	}
	public static HashSet<String> removeFromHashSet(HashSet<String>in, String a){
		for(int i=0; i<in.size();i++) {
			if(in.contains(a))
				in.remove(a);
		}
		return in;
	}
	public static void printSet(HashSet<String> a) {
		System.out.println("The set contains: ");
		for(Object obj: a.toArray()) {
			String b=(String)obj;
			System.out.println(b);
		}
	}

}