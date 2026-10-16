package com.dsa.task_16_10_2026;

import java.util.HashMap;
import java.util.Scanner;

/*
 * *Day - 26*

*JAVA*
1. Write a Java program using HashMap to check if one string contains an anagram of another string as a substring.
Input: s1 = "ab", s2 = "eidbaooo"

2. Write a Java program using HashMap to find the length of the longest subarray with sum less than or equal to a given integer k.
Input: [1, 2, 3, 4, 5], k = 8
Output: 3

*MySQL*
1. Find values containing exactly one occurrence of 'A'. 
*PLSQL*
1. Process EMP rows in batches of 500 using cursors
*JavaScript*
1. Write a JavaScript program to find the largest element in an array.
Input: [1, 5, 3, 9, 2]
 Output: 9
 */

public class AnagramInSub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1 = sc.nextLine();
		System.out.println("Enter the string 2");
		String s2 = sc.nextLine();

		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s1, String s2) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 > l2) {
			return false;
		}

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < l1; i++) {
			char ch = s1.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}

		// sliding window
		for (int i = 0; i < l2; i++) {
			char ch = s2.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}

		
		if (map1.equals(map2)) {
            return true;
        }
		
		for(int i= l1; i< l2;i++) {
			
			char add = s2.charAt(i);
			char rem = s2.charAt(i-l1);
			
			map2.put(add, map2.getOrDefault(add, 0)+1);
			
			map2.put(rem, map2.get(rem) - 1);
		}
		
		
		
		return false;

	}
}
