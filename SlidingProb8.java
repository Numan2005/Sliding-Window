package com.sliding;
//count if the sum of size k is equal to x
public class SlidingProb8 {
	public static void equalToX(int[]arr,int k,int x) {
		int i=0,j=0;
		int sum=0,count=0;
		while(i<arr.length) {
			sum+=arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				if(sum==x) {
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
		int[]arr = {2,3,2,4,2,1};
		int k=3;
		int x =7;
		equalToX(arr,k,x);

	}

}
