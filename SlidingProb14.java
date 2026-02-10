package com.sliding;
//finding the second sum in subarray
public class SlidingProb14 {
	
	public static void minOdd(int[] arr,int k) {
		int i=0,j=0;
		int sum=0;
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(sum>max) {
					secondmax = max;
					max = sum;
				}else if(sum >secondmax && sum!=max){
					secondmax = sum;
				}
				sum-=arr[j];
				i++;
				j++;
			}
		}
		System.out.println(max);
	}

	

	public static void main(String[] args) {
		int[] arr = {1,2,4,7};
		int k=2;
		minOdd(arr,k);


	}

}
