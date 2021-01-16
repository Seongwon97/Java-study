package myPackage;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome of 'radar': ");
		 System.out.println(checkPalindrome("radar"));
		 System.out.println("Palindrome of 'Straw? No, too stupid a fad, I put soot on warts.': ");
	     System.out.println(checkPalindrome("Straw? No, too stupid a fad, I put soot on warts."));
		
	}
    public static boolean checkPalindrome(String s) {
    	String str1 = "";
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i ++) {
            str1=str1+str[i];
        }
        return checkinside(str1);
    }

    private static boolean checkinside(String s) {
    	int slength=s.length();
        if (slength < 2)
        	return true;
        else if (Character.toLowerCase(s.charAt(0))!= Character.toLowerCase(s.charAt(slength-1)))
        	return false;
        else 
        	return checkinside(s.substring(1,slength-1));
    }
}
