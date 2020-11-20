package com.mfg.beginner;

import java.util.Scanner;

/// In case of linear search it does not matter if the array is sorted or not.///
public class Linear{
	
	public static void linear_search(int arr[], int num, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]== num)
				System.out.println("Your number is at the index no. : "+ i);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,6,4,7,8,9};
		int n = arr.length;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number you want to search -  ");
		int target = reader.nextInt();
		linear_search(arr,target,n);
	}
}