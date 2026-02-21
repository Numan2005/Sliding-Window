package com.sliding;

public class SlidingCount2 {
	public static void oddSub(int[] arr,int k) {
		int i=0,j=0;
		int oddcount=0;
		while(i<arr.length) {
			if(arr[i]%2==1) {
				oddcount++;
			}
			if(i-j+1==k) {
				System.out.println(oddcount);
				if(arr[j]%2==1) {
					oddcount--;
				}
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
	int[] arr = {2,3,1,5,7,4};
	int k=3;
    oddSub(arr,k);
	}

}
