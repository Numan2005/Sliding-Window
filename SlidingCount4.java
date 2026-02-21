package com.sliding;

public class SlidingCount4 {
	public static void count0(int[] arr ,int k) {
		int i=0,j=0;
		int c0 = 0;
		while(i<arr.length) {
			if(arr[i]==0) {
				c0++;
			}
			if(i-j+1==k) {
				System.out.println(c0);
				if(arr[j]==0) {
					c0--;
				}
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,2,0,6,0,9};
		int k=3;
		count0(arr,k);

	}

}
