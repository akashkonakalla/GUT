package com.dsa.task_07_10_2026;

import java.util.Scanner;

/*
 * *Day - 19*
*Java*
1. Generate all subsequences of a string.
Example:
Input:
ABC
Output:
"",A,B,C,AB,AC,BC,ABC

2. Given a string, print all duplicate characters.
Example:
Input:
str = "programming"
Output:
r
g
m
Constraint:
Print each duplicate once
*PLSQL*
1. Create function to return nth highest salary without analytic functions

2. Create procedure handling SAVEPOINT rollbacks 
Logic
Partial rollback using SAVEPOINT.
*JavaScript*
1. Write a JavaScript program to count consonants in a string.
Input: hello
 Output: 3
 */
public class AllSubStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = i; j < n; j++) {
				System.out.println(s.substring(i, n));
			}
		}
	}
}
