package com.sliding;
//find the even sub array which is >= 2
//we have find how many even num we have in our subarray than we have compare this with 2;
public class SlidingCount7 {
	public static void countEven(int[] arr,int k,int x) {
		int i=0,j=0;
		int count =0;
		int result =0;
		while(i<arr.length) {
			if(arr[i]%2==0) {
				count++;
			
			}
			if(i-j+1==k) {
				if(count>=x) {
					result++;
					
				}
				if(arr[j]%2==0) {
					count--;
				}
				j++;
			}
			i++;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int[] arr= {2,4,5,7,6,7,8,9};
		int k = 3;
		int  x =2;
		countEven(arr,k,x);
	}

}
