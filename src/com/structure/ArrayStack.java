package com.structure;

/**
 * 
 * @author Administrator
 *	这是一个使用简答数组实现的stack
 */
public class ArrayStack {

	//top值表示stack当前的数组下标index
	private int top;
	//表示stack容量
	private int capacity;
	//使用数组实现stack
	private int[] array;
	
	/**
	 * 	
	 * @param stackNumber
	 * 	初始化数组和top
	 */
	public ArrayStack(int stackNumber) {
		capacity = stackNumber;
		array = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isStackFull() {
		//满了的时候 top也就是index指向的正好是数组最后 也是capacity-1
		return (top ==capacity-1);
	}
	
	/**
	 * 	入栈
	 * 	if 先判断数组满了没有，满了报错/异常
	 * 	else array[++top] = 输入的object
	 * @param data
	 */
	public void push(int data) {
		if(isStackFull()) {
			System.out.println("stack is full");
		}else {
			//没满
			array[++top] = data;
		}
	}
	
	/**
	 * 	出栈
	 * 	if 先判断栈是否为空
	 * 		为空则报错/异常 且 return 0 或者-1都可以
	 * 	else return array[top--]
	 * @return
	 */
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}else {
			return array[top--];
		}
		
	}
	
	public void deleteStack() {
		top = -1;
	}
	
	/**
	 * 	动态增大数组，防止stack overflow
	 * 	成倍数增大
	 */
	public void doubleStack() {
		int newArray[] = new int[capacity*2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity = capacity *2;
		array = newArray; 
	}
	
	
	
}
