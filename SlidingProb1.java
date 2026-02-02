package com.sliding;

public class SlidingProb1 {

	public static void main(String[] args) {
		int[] arr = {-1,-3,-5,-3,-3,-2};
		int k = 3,sum=0;
		
		int i =0,j=0;
		
		int max = Integer.MIN_VALUE;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				max = Math.max(sum, max);
				sum-=arr[j];
				i++;
				j++;
			}
		}
		System.out.println(max);

	}

}
