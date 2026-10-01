package com.dsa.task_01_10_2026;

import java.util.Scanner;

/*
 * *Day - 15*
*Java*
1. Given two strings, determine whether they are anagrams.
Example:
Input:
str1 = "listen"
str2 = "silent"
Output:
true
Constraint:
Ignore character order

2. Given a string and a character, count its occurrences.
Example:
Input:
str = "banana"
ch = 'a'
Output:
3
Constraint:
Time Complexity: O(n)
*PLSQL*
1. Create procedure to auto-correct invalid salary grades

2. Create trigger to prevent duplicate employee names
*JavaScript*
1. Write a JavaScript program to perform basic arithmetic operations.
Input: 10 + 5
 Output: 15
 */
public class CountCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the character to count");
		char c = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("The number of character " + c + " occured is : " + count);
	}
}
