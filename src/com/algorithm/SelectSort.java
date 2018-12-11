package com.algorithm;

import java.util.Scanner;

import org.junit.Test;

public class SelectSort {
	/**
	 * 选择排序
	 */
	@Test
	public void selectSort() {
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
		int min,tmp;
		//2.外层for遍历每一个元素
		for(int i=0;i<arr.length-1;i++) {
			min = i;
			//3.内层for判断目标key与后续元素的位置
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}//end for
			tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}//end for
		
		System.out.println("sortHou");
		for(int i=0;i<numbers-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
