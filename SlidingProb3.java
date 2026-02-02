package com.sliding;

public class SlidingProb3 {

	public static void main(String[] args) {
		int[] arr = {2,3,4,2,3,2,1,5,3};
        int k=3;
        
        int i=0,j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(i<arr.length) {
        	sum+=arr[i];
        	 if(i-j+1<k) {
        		 i++;
        	 }else {
        		 min = Math.min(sum, min);
        		 sum-=arr[j];
        		 i++;
        		 j++;
        	 }
        }
        System.out.println(min);
	}

}
