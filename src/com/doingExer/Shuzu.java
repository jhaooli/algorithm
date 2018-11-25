package com.doingExer;

public class Shuzu {

	
	public int removeDuplicates(int[] nums) {
		
		int count = nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count--;
                //出现相等时将整个数组往前移动
                for(int j=i+1;j<nums.length-1;j++) {
                	nums[j] = nums[j+1];
                }
            }
        }
       return count;
    }
	
	  public int removeElement(int[] nums, int val) {
	        int count =nums.length;
	        for(int j=0;j<nums.length-1;j++){
	            if(nums[j]==val) {
	            	count--;
	            	for(int i=j;i<nums.length-2;i++) {
	            		nums[i] = nums[i+1];
	            	}
	            }//end if
	        }//end for
	        
	        return count;
	    }
	  
	  public void rotate(int[] nums, int k) {
	        while(k>=nums.length) {
	        	k = k-nums.length;
	        }
	        int tmp;
	        for(int i=0;i<k;i++) {
	        	tmp = nums[nums.length-1];
	        	for(int j=nums.length-1;j>0;j--) {
	        		nums[j] = nums[j-1];
	        	}
	        	nums[0] = tmp;
	        }
	    }
	  
	  public int[] intersect(int[] nums1, int[] nums2) {
		  	int contain;
		  	if(nums1.length>nums2.length) {
		  		contain = nums1.length;
		  	}else {
		  		contain = nums2.length;
		  	}
		  	int count=0;
		  	int[] results = new int[contain];
	        for(int i=0;i<nums1.length;i++) {
	        	for(int j=0;j<nums2.length;j++) {
	        		if(nums1[i]==nums2[j]) {
	        			results[count++] = nums1[i];
	        			
	        		}
	        	}//end for1
	        }//end for2
	        
	        return results;
	    }
	  
	  
	  /**
	   *	 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的 两个 整数。

			你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

			示例:

			给定 nums = [2, 7, 11, 15], target = 9

			因为 nums[0] + nums[1] = 2 + 7 = 9
			所以返回 [0, 1]
	   * 	
	   * @param nums
	   * @param target
	   * @return
	   * 	这个通过率20/29
	   */
	   public int[] twoSum(int[] nums, int target) {
		  	int[] keys = new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	        	keys[i] = target - nums[i];
	        }//end for
	        int[] result = new int[2];
	        for(int i=0;i<nums.length;i++) {
	        	for(int j=0;j<nums.length;j++) {
	        		if(nums[j]==keys[i]) {
//                       if(i<j){
//                    	   result[0] = i;
//                           result[j] = j;
//                       }else{
	        			result[0] = j;
	        			result[1] = i;
//                       }
	        		}
	        	}//end for
	        }//end for
	        
	        return result;
	    }
	   
	   /**
	    * 	上一题的100%暴力解法
	    * @param nums
	    * @param target
	    * @return
	    */
	   public int[] twoSum2(int[] nums, int target) {
		    for (int i = 0; i < nums.length; i++) {
		        for (int j = i + 1; j < nums.length; j++) {
		            if (nums[j] == target - nums[i]) {
		                return new int[] { i, j };
		            }
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
	  
	  
	  
}

