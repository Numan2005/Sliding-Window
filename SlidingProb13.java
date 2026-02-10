package com.sliding;

public class SlidingProb13 {
	public static void minOdd(int[] arr,int k) {
		int i=0,j=0;
		int sum=0;
		int maxOdd = Integer.MIN_VALUE;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(Math.abs(sum)> maxOdd) {
					maxOdd = Math.abs(sum);
				}
				sum-=arr[j];
				i++;
				j++;
			}
		}
		System.out.println(maxOdd);
	}

	public static void main(String[] args) {
		int[] arr = {2,-10,3,7};
		int k=2;
		minOdd(arr,k);

	}

}
