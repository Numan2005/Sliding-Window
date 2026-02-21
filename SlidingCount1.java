package com.sliding;

public class SlidingCount1 {
     public static void evenSub(int[] arr, int k) {
    	 int i=0,j=0;
    	 int count=0;
    	 int sum =0;
          while(i<arr.length) {
        	  if(arr[i]%2==0) {
        		  count++;
        	  }
        		  if(i-j+1==k) {
        			 System.out.println(count);
        		   sum+=count;
        			  if(arr[j]%2==0) {
        				  count--;
        			  }
        			  j++;
        		  }
        			  i++;
          }
          System.out.println(sum);
     }
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,7,6};
		int k=3;
		evenSub(arr,k);

	}

}
