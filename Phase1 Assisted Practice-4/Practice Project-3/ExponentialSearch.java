package searching;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int arr[] = {6,12,18,24,32};
		
		System.out.println("Enter the Element to be Searched : ");
		
		int value=obj.nextInt();
		
		int outcome=exponentialSearch(arr,arr.length,value);
		
		if(outcome<0) {
			System.out.println("Element is not present in array");
		}
		else {
			System.out.println("Element found at index: "+outcome+", Key is: "+arr[outcome]);
		}
	}

	private static int exponentialSearch(int[] arr, int length, int value) {
		// TODO Auto-generated method stub
		
		//check if the element is available at  first index
		if(arr[0]==value) {
			return 0;
		}
		
		int i=1; //find out the range by repeated doubling
		
		while(i<length && arr[i]<=value) {
			i= i*2;
		}
		
		
		return Arrays.binarySearch(arr,i/2,Math.min(i, length),value);
	}

}
