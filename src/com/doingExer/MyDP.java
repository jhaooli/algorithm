package com.doingExer;

public class MyDP {

	/**
	 *  买卖股票的最佳时机
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票。

示例 1:

输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
示例 2:

输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
	 * @param prices
	 * @return
	 * 130+ms 很慢
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
        
        /*O(n)解法
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
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
进阶:

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
     * @param nums
     * @return
     * 
     */
    public int maxSubArray(int[] nums) {
//    	187/202通过率
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
