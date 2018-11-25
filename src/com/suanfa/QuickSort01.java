package com.suanfa;

import java.util.Scanner;

public class QuickSort01 {
	
	public static void main(String[] args) {
		//1.生成一个随机数组
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] arr = new int[numbers];
		for(int i=0;i<=numbers-1;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("sort前");
		for(int i=0;i<=numbers-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		quickSort(arr,0,numbers-1);
		
		System.out.println("sorthou");
		for(int i=0;i<=numbers-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr,int left,int right) {
		int pivot;
		//终止条件
		if(right>left) {
			pivot = partition2(arr,left,right);
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot+1,right);
		}
	}
	
	static int partition2( int[] arr, int left, int right)
	{
	 int pivot = arr[left];
	 int i = left + 1;
	 int j = right;
	 while(true)
	 {  
	   //向右遍历扫描
	   while(i < j && arr[i] <= pivot) i++;
	   //向左遍历扫描
	   while(i < j && arr[j] >= pivot) j--;
	   if(i >= j)
	     break;
	   //交换
	   int temp = arr[i];
	   arr[i] = arr[j];
	   arr[j] = temp;
	 }
	 //把arr[j]和主元交换
	 arr[left] = arr[j];
	 arr[j] = pivot;
	 return j;
	}

}
