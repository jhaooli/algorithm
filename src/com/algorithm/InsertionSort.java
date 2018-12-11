package com.algorithm;

import java.util.Scanner;

import org.junit.Test;

public class InsertionSort {

	
	@Test
	public void insertionSort() {
		//1.生成一个随机数组
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] arr = new int[numbers];
		for(int i=0;i<numbers-1;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("sort前");
		for(int i=0;i<numbers-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
				
		int i,j,v;
		for(i=2;i<=numbers;i++) {
			v = arr[i];
			j = i;
			while(arr[j-1]>v&&j>=1) {
				arr[j] = arr[j-1];
				j--;
			}//end while
			
			arr[j] = v;
		}//end for
		
		System.out.println("sorthou");
		for(int m=0;m<numbers-1;m++) {
			System.out.print(arr[m]+" ");
		}
		System.out.println();
	}
}
