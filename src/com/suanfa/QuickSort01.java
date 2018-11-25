package com.suanfa;

import java.util.Scanner;

public class QuickSort01 {
	
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

	public static void quickSort(int[] arr,int left,int right) {
		int pivot;
		//��ֹ����
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
	   //���ұ���ɨ��
	   while(i < j && arr[i] <= pivot) i++;
	   //�������ɨ��
	   while(i < j && arr[j] >= pivot) j--;
	   if(i >= j)
	     break;
	   //����
	   int temp = arr[i];
	   arr[i] = arr[j];
	   arr[j] = temp;
	 }
	 //��arr[j]����Ԫ����
	 arr[left] = arr[j];
	 arr[j] = pivot;
	 return j;
	}

}
