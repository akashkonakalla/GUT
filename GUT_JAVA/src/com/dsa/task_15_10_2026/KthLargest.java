package com.dsa.task_15_10_2026;

import java.util.Scanner;

public class KthLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the number to find Kth largest");
		int k = sc.nextInt();
		if (k > n || k < 1) {
			System.out.println("No kth largest element");
			return;
		}

		int largest = a[0];
		boolean[] visit = new boolean[n];
		int large = a[0];
		int index = -1;

		for (int i = 0; i < k; i++) {
			large = Integer.MIN_VALUE;
			index = -1;
			for (int j = 0; j < n; j++) {
				if (!visit[j] && a[j] > large) {

					large = a[j];
					index = j;
				}
			}

			visit[index] = true;

		}

		System.out.println("The Kth largest is : " + large);

	}
}
