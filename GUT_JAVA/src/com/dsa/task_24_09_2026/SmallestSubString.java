package com.dsa.task_24_09_2026;

import java.util.Scanner;

/*
2. Find the smallest substring containing all distinct characters of the string.
Example:
Input:
str = "aabcbcdbca"
Output:
dbca
Constraint:
Sliding Window
 */
public class SmallestSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=new String(sc.nextLine());
		System.out.println("Address of the string s: "+s.hashCode());

		String s1=sc.nextLine();
		System.out.println("Address of the string s1: "+s1.hashCode());
		System.out.println(sc);
	}
}
