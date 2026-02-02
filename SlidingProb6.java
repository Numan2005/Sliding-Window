package com.sliding;

import java.util.ArrayList;
import java.util.List;
public class SlidingProb6 {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,1,4};
		int k =3;
		int x=5;
		int i=0,j=0;
		int sum=0;
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			sum+=arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				if(sum==x) {
					System.out.println(sum);
					for(int m=j;m<=i;m++) {
						list.add(arr[m]);
					}
					System.out.println(list);
				}
				sum-=arr[j];
				i++;
				j++;
			}
		}
	}

}
