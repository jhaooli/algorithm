package com.doingExer;

import java.util.Scanner;

import org.junit.Test;

public class MyMaths {

	/**
	 * ͳ������С�ڷǸ����� n ��������������

ʾ��:

����: 10
���: 4
����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
	 * @param n
	 * @return
	 * 
	 * 
	 * 19 / 20 ��ͨ����������
״̬������ʱ������
�ύʱ�䣺0 ����֮ǰ
���ִ�е����룺
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
	 * ����һ��������дһ���������ж����Ƿ��� 3 ���ݴη���

ʾ�� 1:

����: 27
���: true
ʾ�� 2:

����: 0
���: false
ʾ�� 3:

����: 9
���: true
ʾ�� 4:

����: 45
���: false
���ף�
���ܲ�ʹ��ѭ�����ߵݹ�����ɱ�����
	 * @param n
	 * @return
	 * 
	 * 14040 / 21038 ��ͨ����������
״̬��������
�ύʱ�䣺0 ����֮ǰ
���룺
45
�����
true
Ԥ�ڣ�
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
