package com.sliding;
//skip the positive number
public class SlidingProb16 {
	public static void minNeg(int[] arr,int k) {
		int i =0,j=0;
		int sum =0;
		int min = Integer.MAX_VALUE;
		int startIndex =0;
		while(i<arr.length){
			if(arr[i]<0) {
			sum+=arr[i];
			}
			if(i-j+1<k) {
				i++;
			}else { 
				if(sum<min) {
					min = sum;
					startIndex =j;
				}
				if(arr[j]<0) {
				sum-=arr[j];
				}
				i++;
				j++;
			}
		}
		System.out.println(min);
		for(int x=startIndex;x<startIndex+k;x++) {
			System.out.print(arr[x]+" ");
		}
	}
  public static void main(String[] args) {
	  int[] arr = {-4,-7,-11,-9,-12};
	  int k = 3;
	  minNeg(arr,k);
  }
}
