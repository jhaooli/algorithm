package com.doingExer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class MyOther {
	/**
	 * ��Ч������
����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ�����

ʾ�� 1:

����: "()"
���: true
ʾ�� 2:

����: "()[]{}"
���: true
ʾ�� 3:

����: "(]"
���: false
ʾ�� 4:

����: "([)]"
���: false
ʾ�� 5:

����: "{[]}"
���: true
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
