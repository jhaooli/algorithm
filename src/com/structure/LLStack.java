package com.structure;

import java.util.EmptyStackException;

/**
 * 	这是一个使用链表实现的stack
 * @author Administrator
 *
 */
public class LLStack {

	private LLNode headNode;
	
	public LLStack() {
		this.headNode = new LLNode();
		
	}
	
	public void push(int data) {
		if(headNode ==null) {
			headNode = new LLNode(data);
		}else if(headNode.getData() == null) {
			headNode.setData(data);
		}else {
			LLNode llNode = new LLNode(data);
			llNode.setNextNode(headNode);
			headNode = llNode;
		}
		
	}//end func
	
	public int pop() {
		if(headNode == null) {
			throw new EmptyStackException();
			
		}else {
			int data = headNode.getData();
			headNode = headNode.getNextNode();
			return data;
		}
	}
	
	public boolean isEmpty() {
		if(headNode == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void deleteStack() {
		headNode = null;
	}
}

class LLNode{
	
	public Integer data;
	public LLNode nextNode;
	
	public LLNode(int data) {
		this.data = data;
	}
	
	public LLNode() {
		
	}

	public Integer getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LLNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LLNode nextNode) {
		this.nextNode = nextNode;
	}
	
}