package com.dsa.task_05_10_2026;

import java.util.Scanner;

/*
 * *Day - 17*
*Java*
1. Given a sentence, reverse every word while keeping word positions unchanged.
Example:
Input:
str = "Java Full Stack"
Output:
avaJ lluF kcatS
Constraint:
Preserve spaces

2. Given a sentence, reverse the order of words.
Example:
Input:
str = "Java Full Stack"
Output:
Stack Full Java
Constraint:
Remove extra spaces
*PLSQL*
1. Create procedure to compare current and previous salary trends

2. Create procedure for department-wise ranking generation
*JavaScript*
1. Write a JavaScript program to check whether a string is a palindrome.
Input: madam
Output: Palindrome
 */
public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s = sc.nextLine();
		String[] str = s.split(" ", -1);
		String ans = "";
		for (String i : str) {
			ans = i + ans;
			ans = " " + ans;
		}

		System.out.println("Final Sentence is : " + ans);
	}
}
