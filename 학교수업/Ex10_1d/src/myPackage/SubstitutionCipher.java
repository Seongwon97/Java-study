package myPackage;

public class SubstitutionCipher implements MessageEncoder {
	private int shift;
	SubstitutionCipher(int newShift){
		shift=newShift;
	}
	
	
	public String encode(String plainText) {
		String temp=plainText;
		char[] store=new char[temp.length()];
		for(int i=0;i<temp.length();i++) {
			store[i]=(char) (temp.charAt(i)+shift);
		}
		return String.valueOf(store);
	}

}
