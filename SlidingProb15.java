package com.sliding;

public class SlidingProb15 {
	public static void LorR(int[] arr,int k,int l,int r) {
		int i=0,j=0;
		int sum=0;
		int count =0;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(l <= sum && sum <=r) {
					count++;
			}
				sum-=arr[j];
				i++;
				j++;
			}
		}
	
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,5,4};
		int k=2;
		int l=7;
		int r=18;
		
		LorR(arr,k,l,r);

	}

}
