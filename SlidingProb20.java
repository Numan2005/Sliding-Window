package com.sliding;

public class SlidingProb20 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8};
		int k =3;
		int i=0,j=0;
		int max=Integer.MIN_VALUE;
		int product =1;
		while(i<arr.length) {
			product *= arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				max=Math.max(max, product);
				product /= arr[j];
				//product-=arr[j];
				i++;
				j++;
			}
		}
      System.out.println(max);
	}

}
