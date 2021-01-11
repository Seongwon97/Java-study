package myPackage;

public class BubbleSort {

	public static void bubbleSort(int[] anArray) {
		// TODO Auto-generated method stub
		for(int i=0; i<anArray.length-1;i++) {
			for(int index=0; index < (anArray.length-1-(i+1)); index++) {
				if(anArray[index]>anArray[index+1]) {
					interchange(index, anArray);
				}
			
			}
		}
	}
	private static void interchange(int i, int[] a){
		int temp = a[i+1];
		a[i+1] = a[i];
		a[i] = temp;
	}

}