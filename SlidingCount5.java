package com.sliding;

public class SlidingCount5 {
	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}
	public static void findVowels(String str,int k) {
		int i=0,j=0;
		int count=0;
		while(i<str.length()) {
			char ch = str.charAt(i);
			if(isVowel(ch)) {
				count++;
			}
			if(i-j+1==k) {
				System.out.println(count);
				
				char leftChar = str.charAt(j);
				if(isVowel(leftChar)) {
					count--;
				}
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		String str = "Armaan";
		int k = 3;
		
		
		findVowels(str,k);

	}

}
