package myPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex14_2c {
	public static LinkedList<String> str =new LinkedList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]s= {"a","b","c","d","e","f","a"};
		arrayToLinkedList(s);
		removeFromLinkedList(str,"a");
		
	}
	public static void arrayToLinkedList(String[]s){
		for(int i=0; i<s.length; i++)
			str.add(s[i]);
		System.out.println(str);
	}
	public static void removeFromLinkedList(LinkedList<String>in, String a){
		for(int i=0; i<in.size(); i++) {
			if(in.contains(a))
				in.remove(a);
		}
		System.out.println(in);
	}

}
