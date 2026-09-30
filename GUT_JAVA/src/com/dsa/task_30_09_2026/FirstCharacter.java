package com.dsa.task_30_09_2026;

import java.util.HashMap;
import java.util.Scanner;

/*
 * *Day - 14*
*Java*
1. Given a string, find the first character that appears only once.
Example:
Input:
str = "VcubeJava"
Output:
V

2. Given a string, find the first repeating character.
Example:
Input:
str = "programming"
Output:
r
Constraint:
Time Complexity: O(n)
*PLSQL*
1. Create procedure to detect duplicate employee records

2. Create trigger preventing DELETE operations on weekends
*JavaScript*
1. Write a JavaScript program to swap two numbers.
Input: a = 5, b = 10
 Output: a = 10, b = 5
 */
public class FirstCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int n = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int i = 0; i < n - 1; i++) {

			char a = s.charAt(i);
			if (map.get(a) == 1) {
				System.out.println(a);
				break;
			}
		}
	}
}
