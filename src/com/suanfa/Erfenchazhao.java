package com.suanfa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Administrator
 *	���ֲ���
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
		System.out.println("sortǰ");
		for(int i=0;i<numbers-1;i++) {
			
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("sort��");
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
				System.out.println("key "+key +">"+arr[mid]+"��mid= "+mid);
				start = mid+1;
				System.out.println("start = "+start+" end = "+end+"����mid= "+(start+end) / 2);
			}else if(key<arr[mid]){
				System.out.println("key "+key +"<"+arr[mid]+"��mid= "+mid);
				end = mid-1;
				System.out.println("start = "+start+" end = "+end+"����mid= "+(start+end) / 2);
			}else {
				System.out.println("find it,index is "+ mid);
				System.out.println(arr[mid-1]+" "+ arr[mid]+ " "+arr[mid+1]);
				return;
				
			}
		}
	}

	
	/**
	 * sin(��/2)��1.0
       sin(90��)��1.0
                     ����ת�Ƕȣ�90.0
                     �Ƕ�ת���ȣ�1.5707963267948966
       4����:2.0
       -10.312�ľ���ֵ��10.312
       2��8�η���256.0
       3.1�������룺3
       3.1����ȡ����4.0
       3.1����ȡ����3.0
       1,2�е����ֵ��2
       1,2�е���Сֵ��1
                      �����������0��1����0.5246239874336371
       lg(10)��2.302585092994046
       lg(10)��1.0
	 */
	@Test
	  public void Test1() {

	    //���Ǻ����ͽǶ�����
	    System.out.println("sin(��/2)��"+Math.sin(Math.PI / 2));
	    System.out.println("sin(90��)��"+Math.signum(90));
	    System.out.println("����ת�Ƕȣ�"+Math.toDegrees(Math.PI / 2));
	    System.out.println("�Ƕ�ת���ȣ�"+Math.toRadians(90));
	    //��ѧ����
	    System.out.println("4����:"+Math.sqrt(4));
	    System.out.println("-10.312�ľ���ֵ��"+Math.abs(-10.312));
	    System.out.println("2��8�η���"+Math.pow(2,8));
	    //��������
	    System.out.println("3.1�������룺"+Math.round(3.1));
	    System.out.println("3.1����ȡ����"+Math.ceil(3.1));
	    System.out.println("3.1����ȡ����"+Math.floor(3.1));
	    //�����Сֵ
	    System.out.println("1,2�е����ֵ��"+Math.max(1,2));
	    System.out.println("1,2�е���Сֵ��"+Math.min(1,2));
	    //�����
	    System.out.println("�����������0��1����"+Math.random());
	    //��������
	    System.out.println("lg(10)��"+Math.log(10));
	    System.out.println("lg(10)��"+Math.log10(10));
	  }

	@Test
	public void getSum() {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=b;i++) {
			sum += a/i;
			System.out.println("(a/i) = "+a/i);
		}
		System.out.println("sum = " +sum);
		
		int sum1 = 0;
		for(int i=1;i<=b;i++) {
			sum1 += Math.floor((double)a/(double)i);
			System.out.println("floor(a/i) = "+Math.floor((double)a/(double)i));
		}
		System.out.println("sum1 = " +sum1);
		
		int sum2 = 0;
		for(int i=1;i<=b;i++) {
			sum2 += Math.ceil((double)a/(double)i);
			System.out.println("celi(a/i) = "+Math.ceil((double)a/(double)i));
		}
		System.out.println("sum2 = " +sum2);
	}
	
	@Test
	public void mathFloorDiv() {
		 Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int c = Math.floorMod(a, b);
	        System.out.println(a+"%"+b+"=��"+c);
	        System.out.println();
	        
	        System.out.println(a%b);

	}
}
