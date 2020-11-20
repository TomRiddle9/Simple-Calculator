package com.mfg.beginner;

import java.util.Scanner;

public class Binary{
	
	public static int binary_search(int arr[],int num, int low, int high) {
		while(low<=high) {
			int mid = (high-low)/2;
			if(arr[mid]< num)
				return high = mid+1;
			else if(arr[mid]> num)
				return low = mid-1;
			
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {4,5,6,7,8,9};
		int n = arr.length;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your target number :   ");
		int num = reader.nextInt();
		Binary bn = new Binary();
		int result = bn.binary_search(arr, num, 0, n-1);
		if(result== -1)
			System.out.println("Could not find the element in the list");
		else
			System.out.println("Your element is at the index no. "+ result );
		
	}
}