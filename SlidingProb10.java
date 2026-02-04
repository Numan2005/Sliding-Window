package com.sliding;
//maximum sum if it is even
public class SlidingProb10 {

	public static void main(String[] args) {
		int[] arr = {5,2,3,7,4,2,7};
		int k=3;
		
		int i=0,j=0;
		int sum=0;
		int max = Integer.MIN_VALUE;
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(sum%2==0 && sum>max) {
					max=sum;
				}
				sum-=arr[j];
				i++;
				j++;
			}
		}
			System.out.println(max);
	}

}
