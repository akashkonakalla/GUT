package com.dsa.task_23_09_2026;
/*
 * 
2. Given an array of integers, move all negative numbers to the beginning of the array.
Example:
Input:
arr = [1, -2, 3, -4, 5, -6]
Output:
[-2, -4, -6, 1, 3, 5]
Constraint:
Time Complexity: O(n)
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegative {
	static void swap(int a[],int i, int index) {
		int temp=a[i];
		a[i]=a[index];
		a[index]=temp;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		System.out.println("Enter the elements in array");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int index=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0 && index<n) {
				swap(a,i,index);
				index++;
			}
			
		}
		System.out.println("Array after moving negative values to beginning is : "+Arrays.toString(a));
	}
}
