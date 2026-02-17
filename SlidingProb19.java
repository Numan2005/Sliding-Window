package com.sliding;



//Find the maximum weight subarray of sum
public class SlidingProb19 {
     public static void WeightedSumMax(int[] arr,int k) {
    	 int i=0,j=0;
    	 int sum=0,max=Integer.MIN_VALUE;
    	 int x=0;
    
    	 while(i<arr.length) {
    		 if(x<=k) {
    			 x++;
    		 }
    		 int val = arr[i] * x;
    		 sum+=val;
    		 if(i-j+1<k) {
    			 i++;
    		 }else {
    			 if(sum>max) {
    				 max=sum;
    			 }
    			 sum-=arr[j]*x;
    			 i++;
    			 j++;
    		 }
    	 }
    	 System.out.println(max);
     }
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,2,5};
		int k=3;
		WeightedSumMax(arr,k);
	}

}
