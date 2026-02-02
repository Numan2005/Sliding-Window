package com.sliding;

public class SlidingProb4 {
	public static void AveOfSubArr(int[] arr,int k) {
		int i=0,j=0;
		int sum=0;
		double ave=0f;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				ave = (double)sum/k;
				System.out.println(ave);
				sum-=arr[j];
				i++;
				j++;
				
			}
		}
		System.out.println();
	}
     
	
	public static void main(String[] args) {
		int[] arr = {1,4,3,2,6,1};
		int k=3;
		AveOfSubArr(arr,k);
	}
}
