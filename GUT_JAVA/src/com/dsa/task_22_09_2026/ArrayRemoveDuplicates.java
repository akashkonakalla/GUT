package com.dsa.task_22_09_2026;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Java - 22/09/2026
1. Given a sorted array, remove duplicates and return the new length.
Example:
Input:
arr = [1, 1, 2, 2, 3, 4, 4]
Output:
[1, 2, 3, 4]
Length = 4
Constraint:
Use Two Pointer Approach
Time Complexity: O(n)

2. Given an array containing numbers from 1 to n with one number missing, find the missing number.
Example:
Input:
arr = [1, 2, 3, 5]
Output:
4
Constraint:
Time Complexity: O(n)
 * 
 */
public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = sc.nextInt();

		System.out.println("Enter the elements in the array");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int newl = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				newl++;
			}
		}
		if (newl == n) {
			System.out.println("No duplicates");

			return;
		}

		System.out.println("New length of array is : " + (newl));
		int a[] = new int[newl];
		a[0] = arr[0];
		for (int i = 1, j = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				a[j++] = arr[i];
			}
		}

		System.out.println("Array is : " + Arrays.toString(a));

	}
}
