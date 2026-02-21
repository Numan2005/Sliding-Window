package com.sliding;

public class SlidingCount3 {
	public static void oddSub(int[] arr,int k) {
		int i=0,j=0;
		int oddcount=0;
		while(i<arr.length) {
			if(arr[i]<0) {
				oddcount++;
			}
			if(i-j+1==k) {
				System.out.println(oddcount);
				if(arr[j]<0) {
					oddcount--;
				}
				j++;
			}
			i++;
		}
//		System.out.println(oddcount);
	}


	public static void main(String[] args) {
		int[] arr = {-2,3,-1,5,-7,4};
		int k=3;
	    oddSub(arr,k);

	}

}
