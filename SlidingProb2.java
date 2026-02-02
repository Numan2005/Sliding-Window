package com.sliding;

public class SlidingProb2 {
	public static void NumOfSum(int[] arr,int k) {
		int i=0,j=0;
		int sum =0;
//		int min = Integer.MAX_VALUE;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				System.out.println(sum);
				sum-=arr[j];
				i++;
				j++;
			}
		}
//		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		int k = 4;
		NumOfSum(arr,k);

	}

}
