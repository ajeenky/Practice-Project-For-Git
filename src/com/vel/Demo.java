package com.vel;

public class Demo {
	//print the sum of digits inside a string
	public static void main(String[] args) {
		
		String str = "aj1nkya is 1rom 5angli";
		char [] ch = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > '0' && ch[i] < '9') {
				sum = sum + (ch[i] - '0');
			}
		}
		System.out.println(sum);
	}

}
