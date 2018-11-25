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

	
	/**
	 * sin(π/2)：1.0
       sin(90°)：1.0
                     弧度转角度：90.0
                     角度转弧度：1.5707963267948966
       4开方:2.0
       -10.312的绝对值：10.312
       2的8次方：256.0
       3.1四舍五入：3
       3.1向上取整：4.0
       3.1向下取整：3.0
       1,2中的最大值：2
       1,2中的最小值：1
                      产生随机数（0～1）：0.5246239874336371
       lg(10)：2.302585092994046
       lg(10)：1.0
	 */
	@Test
	  public void Test1() {

	    //三角函数和角度问题
	    System.out.println("sin(π/2)："+Math.sin(Math.PI / 2));
	    System.out.println("sin(90°)："+Math.signum(90));
	    System.out.println("弧度转角度："+Math.toDegrees(Math.PI / 2));
	    System.out.println("角度转弧度："+Math.toRadians(90));
	    //科学计算
	    System.out.println("4开方:"+Math.sqrt(4));
	    System.out.println("-10.312的绝对值："+Math.abs(-10.312));
	    System.out.println("2的8次方："+Math.pow(2,8));
	    //四舍五入
	    System.out.println("3.1四舍五入："+Math.round(3.1));
	    System.out.println("3.1向上取整："+Math.ceil(3.1));
	    System.out.println("3.1向下取整："+Math.floor(3.1));
	    //最大最小值
	    System.out.println("1,2中的最大值："+Math.max(1,2));
	    System.out.println("1,2中的最小值："+Math.min(1,2));
	    //随机数
	    System.out.println("产生随机数（0～1）："+Math.random());
	    //对数运算
	    System.out.println("lg(10)："+Math.log(10));
	    System.out.println("lg(10)："+Math.log10(10));
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
	        System.out.println(a+"%"+b+"=："+c);
	        System.out.println();
	        
	        System.out.println(a%b);

	}
}
