package com.doingExer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class MyOther {
	/**
	 * 有效的括号
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		if(s==null&&s.trim()=="") {
			return true;
		}
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(Character c:ch) {
            if((c==']'||c=='}'||c==')')&&stack.isEmpty()) {
        		return false;
        		
        	}
        	if(c=='(') {
        		stack.push(c);
        	}else if(c=='[') {
        		stack.push(c);
        	}else if(c=='{') {
        		stack.push(c);
        	}else if(c==']'){
        		if(!stack.isEmpty()&&stack.pop()!='[') {
        			return false;
        		};
        	}else if(c==')'){
        		if(!stack.isEmpty()&&stack.pop()!='(') {
        			return false;
        		};
        	}else if(c=='}'){
        		if(!stack.isEmpty()&&stack.pop()!='{') {
        			return false;
        		};
        	}
        	
        	
        	
        	
        	
        }
        return stack.isEmpty();
    }
	
	
	@Test
	public void tmpTest() {
		//Map<String,Object> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int[] a = new int[]{1,3,7,9,10,22,16,8};
        for(int i:a){
            sb.append(i);
            
            sb.append("|");


        }
        
        
        LinkedList<Integer> arr = new LinkedList<>();
        
        System.out.println(sb);
        String[] strs = sb.toString().split("\\|");
        for(String str:strs) {
          System.out.println("!! "+ str);
	}


}
	
}
