package com.algorithm;

import java.util.Scanner;

import org.junit.Test;

public class BubbleSort {
	
	@Test
	public void bubbleSort() {
		Scanner sc = new Scanner(System.in);
		
		int numbers = sc.nextInt();
		int[] arr = new int[numbers];
		int swap_times =0;
		
		for(int i=0;i<numbers-1;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("sort前");
		for(int i=0;i<numbers-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		/*
		 * 外层遍历整个数组
		 * 内层使用最前的一个数跟其他数做对比
		 */
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					
					int tmp = arr[j];
					arr[j] = j;
					arr[j+1] = tmp;
					System.out.println("swap = "+ swap_times++);
				}
			}//end for
		}//end for
		
		System.out.println("sort后");
		for(int i =0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}//end function

	

}
