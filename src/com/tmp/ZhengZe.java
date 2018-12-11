package com.tmp;

public class ZhengZe {

	public static void main(String[] args) {
		String str = "afaf235235dad2421wrrt";
		String regex = "\\d+";//0-9 的数字可以出现1次或者1次以上
		String result[] = str.split(regex); //拆分所有匹配正则的
		
		for (int i = 0; i < result.length; i++) {
		System.out.println(result[i]); //循环输拆分后的字母	
		}
		
		int[] nums = new int[] {1,54,6,4,66,8,3,8};
		StringBuffer sb = new StringBuffer();
		for(int j=0;j<nums.length;j++) {
			sb.append(nums[j]);
			sb.append(",");
		}
		
		System.out.println("sb = "+ sb);
		System.out.println("sb.tostring = "+ sb.toString());
		
		String[] strs = sb.toString().split(",");
		System.out.println("长度是   "+strs.length);
		for(int p = 0;p<strs.length;p++) {
			System.out.println(strs[p]);
		}
}
	
	
	
}
