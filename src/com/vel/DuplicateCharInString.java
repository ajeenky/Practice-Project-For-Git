package com.vel;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
	// Count the number duplicate characters in a string using map
	public static void main(String[] args) {
		String str = "hello all my name is java i am from velocity";
		char [] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if(map.containsKey(ch[i])) {
				count = map.get(ch[i]);
				map.put(ch[i], count +1);
			}else if (count == 1 && ch[i] != ' ') {
				map.put(ch[i], 1);
			}
	}
		System.out.println(map);
	}
}