package com.suanfa;

import java.util.Scanner;

import org.junit.Test;

public class QuickSort {

	
	public static void main(String[] args) {
		//1.����һ���������
				Scanner sc = new Scanner(System.in);
				int numbers = sc.nextInt();
				int[] arr = new int[numbers];
				for(int i=0;i<=numbers-1;i++) {
					arr[i] = (int)(Math.random()*100);
				}
				System.out.println("sortǰ");
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
		//��ֹ����
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
			//��arr[left]<=povitʱ �ƶ���ָ��-��left++
			while(arr[left]<=pivot&&left<right) {
				left++;
			}//end while
			
			//��arr��right��>=pivotʱ�ƶ���ָ�� -��right++
			while(arr[right]>pivot&&left<right) {
				right--;
			}//end while
			
			//����һ���ƶ����ˣ���ͣ������ʱ��
			if(left<right) {
				System.out.println("������ǰarr[left]= "+arr[left]);
				System.out.println("������ǰarr[right]= "+arr[right]);
				swap(arr,left,right);
				System.out.println("������ arr[left]= "+arr[left]);
				System.out.println("������ arr[right]= "+arr[right]);
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
