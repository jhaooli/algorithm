package com.suanfa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * 
 * @author Administrator
 *	二分查找
 *
 */
public class Erfenchazhao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numbers = sc.nextInt();
		int key = sc.nextInt();
		int[] arr = new int[numbers];
		
		for(int i=0;i<numbers-1;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("sort前");
		for(int i=0;i<numbers-1;i++) {
			
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("sort后");
		for(int i=0;i<numbers-1;i++) {
			
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		int start = 0;
		int end = numbers-1;
		
		while(start<=end) {
			int mid = (start+end) / 2;
			if(key!=arr[mid]&&key>arr[mid-1]&&key<arr[mid+1]) {
				System.out.println("fail to find ");
				for(int i=mid;i<end;i++) {
					
					System.out.print(arr[i]+" ");
					
				}
				return;
			}else if(key>arr[mid]) {
				System.out.println("key "+key +">"+arr[mid]+"且mid= "+mid);
				start = mid+1;
				System.out.println("start = "+start+" end = "+end+"且新mid= "+(start+end) / 2);
			}else if(key<arr[mid]){
				System.out.println("key "+key +"<"+arr[mid]+"且mid= "+mid);
				end = mid-1;
				System.out.println("start = "+start+" end = "+end+"且新mid= "+(start+end) / 2);
			}else {
				System.out.println("find it,index is "+ mid);
				System.out.println(arr[mid-1]+" "+ arr[mid]+ " "+arr[mid+1]);
				return;
				
			}
		}
	}

}
