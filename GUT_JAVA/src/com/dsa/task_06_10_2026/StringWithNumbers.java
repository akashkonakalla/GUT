package com.dsa.task_06_10_2026;

import java.util.Scanner;

/*
 * *Day - 18*

*Java*
1. Add two binary strings.
Example:
Input:
a = "11"
b = "1"
Output:
100

2. Given a string, determine whether it contains only numeric digits.
Example:
Input:
str = "12345"
Output:
true
Constraint:
Do not use parsing methods

*MySQL*
1. Identify duplicate job roles within departments.
2. Find employees whose salary rank is less than 5. 
*JavaScript*
1. Write a JavaScript program to check whether a number is an Armstrong number.
Input: 153
 Output: Armstrong Number
 */
public class StringWithNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number string");
		String str = sc.nextLine();
		boolean flag = true;

		for (int i = 0; i < str.length(); i++) {
			char pos = str.charAt(i);
			if (!(pos >= '0' && pos <= '9')) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
