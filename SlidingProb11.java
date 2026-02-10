package com.sliding;
//count subarray which sum is divisible by x
public class SlidingProb11 {
	public static void sumDiviX(int[] arr,int k,int x) {
		int i=0,j=0;
		int sum=0;
       int count =0;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(sum%x==0 ) {
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
		int[] arr = {2,1,3,1,6};
		int k=3;
		int x =4;
		sumDiviX(arr,k,x);

	}

}
