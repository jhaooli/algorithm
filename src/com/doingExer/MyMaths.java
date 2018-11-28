package com.doingExer;

import java.util.Scanner;

import org.junit.Test;

public class MyMaths {

	/**
	 * 统计所有小于非负整数 n 的质数的数量。

示例:

输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
	 * @param n
	 * @return
	 * 
	 * 
	 * 19 / 20 个通过测试用例
状态：超出时间限制
提交时间：0 分钟之前
最后执行的输入：
1500000
	 */
	@Test
    public int countPrimes(int n) {
		int count = 0;
		//int[] isBool = new int[n];
		for(int i=2;i<n;i++) {
			if(isbool(i)) {
				count++;
			}
			}
		
		
		return count;
    }
	
	public boolean isbool(int m) {
		for(int j=2;j<=Math.sqrt(m);j++) {
			if(m%j==0) {
				return false;
			}
	}
		return true;
	}
	
	/**
	 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。

示例 1:

输入: 27
输出: true
示例 2:

输入: 0
输出: false
示例 3:

输入: 9
输出: true
示例 4:

输入: 45
输出: false
进阶：
你能不使用循环或者递归来完成本题吗？
	 * @param n
	 * @return
	 * 
	 * 14040 / 21038 个通过测试用例
状态：解答错误
提交时间：0 分钟之前
输入：
45
输出：
true
预期：
false
	 */
	
    public static boolean isPowerOfThree(int n) {
        
    	boolean flag = false;
    	double tmp = Math.floor(n/3);	
    	System.out.println(tmp);
    	if((tmp*3)==(double)n) {
    		System.out.println("keyi");
    		return true;
    	}		
    	return flag;
        
    }
    
    public static void main(String[] args) {
		MyMaths maths = new MyMaths();
		maths.isPowerOfThree(0);
		
	}
}
