package com.sliding;

public class SlidingProb5 {
	public static void greaterThanX(int[] arr,int k,int x) {
		int i=0,j=0;
		int sum =0,count=0;
		while(j<arr.length) {
			sum+=arr[j];
			if(j-i+1<k) {
				j++;
			}else {
				if(sum>x) {
					count++;
				}
				sum-=arr[i];
				i++;
				j++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] arr = {2,3,1,4,3,0};
		int k=3;
		int x=7;
		greaterThanX(arr,k,x);
	}

}
