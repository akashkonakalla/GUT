package com.dsa.task_08_10_2026;

import java.util.Scanner;

/*
 * *Day - 20*

*Java*
1. Given an array of strings, find the longest common prefix.
Example:
Input:
["flower","flow","flight"]
Output:
fl
Constraint:
Time Complexity: O(n × m)

2. Given a string, find the length of the longest substring without repeating characters.
Example:
Input:
str = "abcabcbb"
Output:
3
Explanation:
abc
Constraint:
Use Sliding Window
Time Complexity: O(n)
*PLSQL*
1. Create function to calculate moving average salary

2. Create procedure detecting missing employee IDs
Logic
Detect gaps in EMPNO sequence.
*JavaScript*
1. Write a JavaScript program to find the longest word in a sentence.
Input: JavaScript is a powerful programming language
 Output: programming
 */
public class CommonPrefix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of string array");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Strings");
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}

		System.out.println(longestCommonPrefix(s));

	}

	public static String longestCommonPrefix(String[] strs) {
		int n = strs.length;
		String max = "";
		String min = strs[0];

		for (int i = 1; i < n; i++) {
			if (strs[i].length() < min.length()) {
				min = strs[i];
			}
		}

		for (int i = 0; i < min.length(); i++) {
			String st = min.substring(0, i + 1);
			for (int j = 0; j < n; j++) {

				String sub = strs[j].substring(0, i + 1);
				if (!sub.equals(st)) {
					return max;
				}

			}
			max = st;
		}

		return max;
	}
}
