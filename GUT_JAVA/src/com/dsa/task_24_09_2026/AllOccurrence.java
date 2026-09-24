package com.dsa.task_24_09_2026;

import java.util.Scanner;

/*
 * Day - 11 - 24/09/2026

*Java*
1. Find all occurrences of a pattern in a text.
Example:
Input:
text = "AABAACAADAABAABA"
pattern = "AABA"
Output:
[0,9,12]

2. Find the smallest substring containing all distinct characters of the string.
Example:
Input:
str = "aabcbcdbca"
Output:
dbca
Constraint:
Sliding Window

 */
public class AllOccurrence {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter the pattern");
		String p = sc.nextLine();
		for (int i = 0; i <= (s.length() - p.length()); i++) {
			String newS = "";
			for (int j = 0; j < p.length(); j++) {
				newS = newS + s.charAt(i + j);
			}
//			System.out.println("NEW STRING : " + newS);
			if (p.equalsIgnoreCase(newS)) {
				System.out.print(i + " ");
			}
		}
	}
}
