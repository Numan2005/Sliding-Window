package com.sliding;
import java.util.ArrayList;
import java.util.List;

public class SlidingProb9 {
	public static void equalPrintSub(int[] arr,int k,int x) {
		int i=0,j=0;
		int sum=0;
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			sum+=arr[i];
			if(i-j+1<k) {
				i++;
			}else {
				if(sum-x==0) {
				  for(int a=j;a<=i;a++) {
					 list.add(arr[a]);
				  }
				  System.out.println(list);
				}
				sum-=arr[j];
				i++;
				j++;
				list.clear();
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,3,1,3,1,3};
		int k =3;
		int x=7;
		equalPrintSub(arr,k,x);

	}

}
