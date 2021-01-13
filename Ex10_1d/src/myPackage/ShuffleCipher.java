package myPackage;

public class ShuffleCipher implements MessageEncoder{
	private int n;
	ShuffleCipher(int newN){
		n=newN;
	}
	
	public String encode(String plainText) {
		String temp,temp1,temp2,temp3 = null;
		String sub;
		temp=plainText;
		int devide;
		devide=(temp.length()+1)/2;
		temp1=temp.substring(0, devide);
		temp2=temp.substring(devide);

		if(temp1.length()!=temp2.length()) {
			sub=temp1.substring(0, 1);
			temp3=sub;
			temp3=temp3.concat(temp2.substring(0, 1));
			int i;
			for(i=1;i<temp1.length()-1;i++) {
				temp3=temp3.concat(temp1.substring(i, i+1));
				temp3=temp3.concat(temp2.substring(i, i+1));
			}
			temp3=temp3.concat(temp1.substring(i, i+1));
		}
		else {
			sub=temp1.substring(0, 1);
			temp3=sub;
			temp3=temp3.concat(temp2.substring(0, 1));
			int i;
			for(i=1;i<temp1.length();i++) {
				temp3=temp3.concat(temp1.substring(i, i+1));
				temp3=temp3.concat(temp2.substring(i, i+1));
			}
		}
		temp=temp3;
		return temp3;
	}
}
