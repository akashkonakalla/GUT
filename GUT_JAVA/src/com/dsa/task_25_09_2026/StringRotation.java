package com.dsa.task_25_09_2026;

import java.util.Scanner;

/*
 * Day - 12
*Java*
1. Check whether two strings are rotations of each other
Input:
str1 = "ABCD"
str2 = "CDAB"
Output: true
*MySQL*
2. Find the second-highest salary without using MAX() twice
*PLSQL*
3. Create procedure to generate department-wise payroll reports
*JavaScript*
5. Write a JavaScript program to capitalize the first letter of every word.
Input: java script interview questions
Output: Java Script Interview Questions
 */
public class StringRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1 = sc.nextLine();
		System.out.println("Enter the string 1");
		String s2 = sc.nextLine();

		if (s1.length() != s2.length()) {
			System.out.println(false);
		} 
		
		String newStr=s1 + s1;

         System.out.println(newStr.contains(s2));

	}
}
