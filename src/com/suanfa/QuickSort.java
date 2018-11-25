package com.suanfa;

import java.util.Scanner;

import org.junit.Test;

public class QuickSort {

	
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
	
	public static void quickSort(int[] arr,int low,int high) {
		int pivot;
		//终止条件
		if(high>low) {
			pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
		
	}
	
	public static int partition(int[] arr,int low,int high) {
		int left,right,pivot = arr[low];
		left = low;
		right = high;
		
		while(left<right) {
			//当arr[left]<=povit时 移动左指针-》left++
			while(arr[left]<=pivot&&left<right) {
				left++;
			}//end while
			
			//当arr【right】>=pivot时移动右指针 -》right++
			while(arr[right]>pivot&&left<right) {
				right--;
			}//end while
			
			//当这一轮移动完了，都停下来的时候
			if(left<right) {
				System.out.println("交换后前arr[left]= "+arr[left]);
				System.out.println("交换后前arr[right]= "+arr[right]);
				swap(arr,left,right);
				System.out.println("交换后 arr[left]= "+arr[left]);
				System.out.println("交换后 arr[right]= "+arr[right]);
			}
		}//end while
		arr[low] = arr[right];
		arr[right] = pivot;
		return right;
	}

	private static void swap(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
