package com.sliding;

public class SlidingCount9 {
	public static boolean isPrime(int x) {
		if(x<=1) {
			return false;
		}
		for(int num = 2;num*num<=x;num++) {
			if(x%num==0) {
				return false;
			}
		}
		return true;
	}
	public static void CountPrime(int[] arr,int k) {
		int i=0,j= 0;
		int count = 0;
		int max = 0;
		int currentIndex = 0;
		while(i<arr.length) {
			if(isPrime(arr[i])) {
				count++;
			}
			if(i-j+1==k) {
				if(count>max) {
					max = count;
					currentIndex=j;
				}
				if(isPrime(arr[j])) {
					count--;
				}
				j++;
			}
			i++;
		}
		System.out.println(max);
		System.out.println();
		for(int x = currentIndex;x<currentIndex+k;x++) {
			System.out.print(arr[x]+" ");
		}
	}
   
	public static void main(String[] args) {
		int[] arr = {3,9,8,5,4,3,2};
		int k =4;
		CountPrime(arr,k);

	}

}
