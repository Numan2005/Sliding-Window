package com.sliding;

public class P {

	public static void main(String[] args) {
		int[] arr = {3,4,5,5,2,7};
		int sum = 0,x=0;
		int k=3;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<k+1;j++) {
				if(x<=k) {
					x++;
					sum+=arr[j]*x;
				}
				if(sum>max) {
					max = sum;
				}
			}
		}
		System.out.println(max);

	}

}
