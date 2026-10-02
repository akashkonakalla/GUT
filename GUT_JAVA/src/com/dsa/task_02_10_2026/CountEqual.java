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
public class CountEqual {
	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int prev = 0;
		int curr = 1;
		int ans = 0;

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				curr++;
			} else {
				ans += Math.min(prev, curr);
				prev = curr;
				curr = 1;
			}
		}

		ans += Math.min(prev, curr);

		System.out.println("The count is : " + ans);
	}
}
