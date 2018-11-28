package com.doingExer;

public class MyDP {

	/**
	 *  ������Ʊ�����ʱ��
����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������

ע���㲻���������Ʊǰ������Ʊ��

ʾ�� 1:

����: [7,1,5,3,6,4]
���: 5
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
ʾ�� 2:

����: [7,6,4,3,1]
���: 0
����: �����������, û�н������, �����������Ϊ 0��
	 * @param prices
	 * @return
	 * 130+ms ����
	 */
    public int maxProfit(int[] prices) {
        int indexi = 0;
        int indexj = 0;
        int max_value = 0;
        
        for(int i=0;i<prices.length-1;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		
        		if(prices[i]>prices[j]&&prices[i]-prices[j]>max_value) {
        			max_value = prices[i]-prices[j];
        			indexi = i;
        			indexj = j;
        		}
        	
        		
        	}//end for
        }//end for
        
        return max_value;
        
        /*O(n)�ⷨ
         * int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
         */
    }
    
    
    
    /**
     * ����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�

ʾ��:

����: [-2,1,-3,4,-1,2,1,-5,4],
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
����:

������Ѿ�ʵ�ָ��Ӷ�Ϊ O(n) �Ľⷨ������ʹ�ø�Ϊ����ķ��η���⡣
     * @param nums
     * @return
     * 
     */
    public int maxSubArray(int[] nums) {
//    	187/202ͨ����
//    	int maxSum = 0;
//    	int tmpSum = 0;
//        for(int i=0;i<nums.length;i++) {
//        	for(int j=i;j<nums.length;j++) {
//        		tmpSum += nums[j];
//        		maxSum = Math.max(maxSum, tmpSum);
//        		
//        	}
//        }//out for
//        return maxSum;
        int maxSum = nums[0];
    	int tmpSum = nums[0];
    	
    	for(int i=0;i<nums.length;i++) {
    		tmpSum = Math.max(nums[i], tmpSum+nums[i]);
    		maxSum = Math.max(maxSum, tmpSum);
    	}
    	return maxSum;
    }
}
