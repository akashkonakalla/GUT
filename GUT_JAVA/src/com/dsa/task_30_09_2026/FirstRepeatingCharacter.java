package com.dsa.task_30_09_2026;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s =new String(sc.nextLine());
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
//			System.out.println("get or Default "+ map.getOrDefault(s.charAt(i), null));
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))>=2) {
				System.out.println(s.charAt(i));
				break;
			}
		}
		
//		System.out.println("get or default last : "+map.getOrDefault('a', null));
		
	}
}
