package com.sliding;

import java.util.ArrayList;

public class SlidingProb7 {
	public static void SubOfk(int[] arr,int k) {
		int i=0,j=0;
		ArrayList<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			
			if(i-j+1<k) {
				i++;
			}else {
				for(int a=j;a<=i;a++) {
					list.add(arr[a]);
				}
				System.out.println(list);
				i++;
				j++;
				list.clear();
			}
		}
	}

	public static void main(String[] args) {
		int[]  arr = {7,3,4,7,8,9,7,2,1};
		int k = 3;
		SubOfk(arr,k);

	}

}
