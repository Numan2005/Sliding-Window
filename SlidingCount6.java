package com.sliding;
//finding if any subaaray contains atleast 1 negative num than count subarray as 1
public class SlidingCount6 {
	public static void findNeg(int[] arr,int k) {
		int i=0,j=0;
		int negativeNum = 0;
		int result = 0;
		while(i<arr.length) {
			if(arr[i]<0) {
				negativeNum++;
			}
			if(i-j+1==k) {
				if(negativeNum>0) {
					result++;
				}
				if(arr[j]<0) {
					negativeNum--;
				}
				j++;
			}
			i++;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		int[] arr = {2,-1,3,-7,9,-2,-2};
		int k = 3;
		findNeg(arr,k);

	}
}


