package com.sliding;
//find the odd sub array which is == 3
//we have find how many odd num we have in our subarray than we have compare this with 3;
public class SlidingCount8 {
	public static void countOdd(int[] arr,int k) {
	int i=0,j=0;
	int count =0;
	int result =0;
	while(i<arr.length) {
		if(arr[i]%2==1) {
			count++;
		
		}
		if(i-j+1==k) {
			if(count>=3) {
				result++;
				
			}
			if(arr[j]%2==1) {
				count--;
			}
			j++;
		}
		i++;
	}
	System.out.println(result);
}

	public static void main(String[] args) {
		int[] arr= {1,3,3,7,6,7,50,9};
		int k = 3;
		countOdd(arr,k);
		
	}

}
