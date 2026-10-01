package com.dsa.task_01_10_2026;

import java.util.Arrays;
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

public class Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str1 = sc.nextLine();
		System.out.println("Enter the string 2");
		String str2 = sc.nextLine();

		int[] freq1 = new int[26];
		int[] freq2 = new int[26];

//		for(int i=0;i<26;i++) {
//			
//		}

		for (char ch : str1.toCharArray()) {
			freq1[ch - 'a']++;
		}
		
		for(char ch : str2.toCharArray()) {
			freq2[ch - 'a']++;
		}
		
		if(str1.length()!=str2.length()) {
			System.out.println("Not anagram");
			return;
		}
		else
		for(int i=0;i<str1.length();i++) {
			if(freq1[i]!=freq2[i])
			{
				System.out.println("Not anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}
}
