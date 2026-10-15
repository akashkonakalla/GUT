package com.dsa.task_15_10_2026;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * *Day - 25*
*Java*
1. Write a Java program to find all common elements in three sorted arrays using Set.
Input: [1, 5, 10], [1, 4, 10], [1, 6, 10]
Output: [1, 10]

2. Write a Java program to find the kth largest element in an array using a (PriorityQueue).
Input: [3, 2, 1, 5, 6, 4], k = 2
Output: 5
*MySQL*
1. Determine the job role with the highest average salary.
*PLSQL*
1. Compare the performance of using a Cursor and a single UPDATE statement in MySQL to increase the salary of employees by 10% whose salary is below the company’s average salary. Which approach is faster and why?
*JavaScript*
1. Write a JavaScript program to compress a string.
Input: aaabbcc
 Output: a3b2c2
 */

public class CommonElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the each array");
		int n = sc.nextInt();
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[3];
		for (int j = 0; j < 3; j++) {
			System.out.println("Enter the number : ");
			a[j] = sc.nextInt();

		}
		for (int j = 0; j < 3; j++) {
			System.out.println("Enter the number : ");
			b[j] = sc.nextInt();

		}
		for (int j = 0; j < 3; j++) {
			System.out.println("Enter the number : ");
			c[j] = sc.nextInt();

		}

		Set<Integer> set = new HashSet<>();
//		HashSet<Integer> set1 = new HashSet<>();
//		
//		Set<Integer> as=new HashSet<>();
//		Collections.addAll(set, a);

		for (int i = 0; i < n; i++) {

			int num = a[i];
			if (isPresent(num, b) && isPresent(num, c)) {
				set.add(a[i]);
			}

		}

		System.out.println("All the common elements in the 3 arrays are : " + set);

	}

	static boolean isPresent(int n, int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return true;
			}
		}
		return false;
	}
}
