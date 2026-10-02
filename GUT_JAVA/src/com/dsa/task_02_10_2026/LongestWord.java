package com.dsa.task_02_10_2026;

import java.util.Scanner;

/*
 * *Day - 16*
*Java*
1. Given a sentence, find the longest word.
Example:
Input:
str = "In Vcube, Java is simple"
Output:
Developer
Constraint:
Ignore punctuation & Symbols

2. Count substrings having equal consecutive 0s and 1s. All 0s are grouped together and all 1s are grouped together 
Example:
Input:
00110011
Output:
6
*PLSQL*
1. Create a procedure to generate monthly employee analytics.

2. Create autonomous transaction trigger for logging
(MySQL doesn't support Oracle autonomous transactions directly.)
Workaround:
Use separate logging table.
Logging still rolls back with transaction in MySQL.

*JavaScript*
1. Write a JavaScript program to reverse a string.
Input: hello
 Output: olleh
 */
public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");

		String ans = "";

		for (String s1 : arr) {
			s1 = s1.replaceAll("[^a-zA-Z0-9]", "");

			if (s1.length() > ans.length()) {
				ans = s1;
			}
		}

		System.out.println("The longest string is : " + ans);
	}
}
