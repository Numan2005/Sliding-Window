package com.sliding;

public class SlindingProb12 {
	public static void minOdd(int[] arr,int k) {
		int i=0,j=0;
		int sum=0;
		int minOdd = Integer.MAX_VALUE;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(sum%2!=0 && sum<minOdd) {
					minOdd = sum;
				}
				sum-=arr[j];
				i++;
				j++;
			}
		}
		System.out.println(minOdd);
	}


	public static void main(String[] args) {
		int[] arr = {2,1,3,1,6};
		int k=2;
		minOdd(arr,k);
	}

}
