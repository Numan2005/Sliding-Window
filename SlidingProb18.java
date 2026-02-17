package com.sliding;

import java.util.ArrayList;
import java.util.List;

//finding the square of sum of maximum widow 
public class SlidingProb18 {
public static void squareSum(int[] arr,int k) {
	int i=0,j=0;
	int sum=0;
	int max = Integer.MIN_VALUE;
	int square=0;
	List<Integer> list = new ArrayList<>();
	int startIndex =0;
	while(i<arr.length) {
		square=arr[i] * arr[i];
		sum+=square;
		if(i-j+1<k) {
			i++;
		}else {
			if(sum>max) {
				max=sum;
				startIndex = j;
			}
			sum-=arr[j]*arr[j];
			i++;
			j++;
			
		}
	}
	for(int sq=startIndex;sq<startIndex+k;sq++) {
		list.add(arr[sq]);
	}
	System.out.println(max);
	System.out.println(list);
}
	public static void main(String[] args) {
		int[] arr = {2																																																																																,7,1,4,5};
		int k=3;
		squareSum(arr,k);

	}

}
