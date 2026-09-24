package com.dsa.task_22_09_2026;
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

import java.util.Scanner;

public class ArrayMissing1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("Enter the elements in the array");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr[n - 1] == n) {
			System.out.println("No Missing number");
			return;
		}

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int ans = ((n + 1) * (n + 2) / 2) - sum;

		System.out.println("Missing number is : " + ans);

	}
}
