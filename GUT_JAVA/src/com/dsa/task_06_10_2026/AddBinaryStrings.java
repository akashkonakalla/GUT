package com.dsa.task_06_10_2026;

import java.util.Scanner;

/*
 * *Day - 18*

*Java*
1. Add two binary strings.
Example:
Input:
a = "11"
b = "1"
Output:
100

2. Given a string, determine whether it contains only numeric digits.
Example:
Input:
str = "12345"
Output:
true
Constraint:
Do not use parsing methods

*MySQL*
1. Identify duplicate job roles within departments.
2. Find employees whose salary rank is less than 5. 
*JavaScript*
1. Write a JavaScript program to check whether a number is an Armstrong number.
Input: 153
 Output: Armstrong Number
 */
public class AddBinaryStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary String 1");
		String a = sc.next();
		System.out.println("Enter binary String 2");
		String b = sc.next();
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		int n1 = a.length();
		int n2 = b.length();
		String str = "";
		int p1 = n1 - 1;
		int p2 = n2 - 1;
		int carry = 0;
		int maxlen = Math.max(n1, n2);
		while (p1 >= 0 || p2 >= 0 || carry == 1) {
			char bit1 = '0';
			char bit2 = '0';

			if (p1 >= 0) {
				bit1 = a.charAt(p1);
				p1--;
			}
			if (p2 >= 0) {
				bit2 = b.charAt(p2);
				p2--;
			}
			if (bit1 == '0' && bit2 == '0') {
				if (carry == 1) {
					str = "1" + str;
					carry = 0;
				} else {
					str = "0" + str;
				}
			} else if (bit1 == '0' && bit2 == '1') {
				if (carry == 1) {
					str = "0" + str;
					carry = 1;
				} else {
					str = "1" + str;
				}
			} else if (bit1 == '1' && bit2 == '0') {
				if (carry == 1) {
					str = "0" + str;
					carry = 1;
				} else {
					str = "1" + str;
				}
			} else if (bit1 == '1' && bit2 == '1') {
				if (carry == 1) {
					str = "1" + str;
					carry = 1;
				} else {
					str = "0" + str;
					carry = 1;
				}
			}

		}

		return str;
	}
}
