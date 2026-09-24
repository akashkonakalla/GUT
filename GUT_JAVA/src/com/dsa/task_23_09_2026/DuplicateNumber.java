package com.dsa.task_23_09_2026;

import java.util.Scanner;

/*
 * Day - 10

*Java*
1. Given an array containing n+1 integers where each integer is between 1 and n, find the duplicate number.
Example:
Input:
arr = [1, 3, 4, 2, 2]
Output:
2
Constraint:
Do not modify the array
Time Complexity: O(n)

2. Given an array of integers, move all negative numbers to the beginning of the array.
Example:
Input:
arr = [1, -2, 3, -4, 5, -6]
Output:
[-2, -4, -6, 1, 3, 5]
Constraint:
Time Complexity: O(n)

*MySQL*
1. Show the department with the highest payroll.

*PLSQL*
1. Create trigger preventing salary decrease greater than 20%

*JavaScript*
1. Write a JavaScript program to find the sum of digits of a number.
Input: 123
 Output: 6
 */
public class DuplicateNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		System.out.println("Enter the elements in array");
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		int ans = sum - ((n - 1) * (n) / 2);
		System.out.println("The duplicate element is : " + ans);
	}
}
