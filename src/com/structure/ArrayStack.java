package com.structure;

/**
 * 
 * @author Administrator
 *	����һ��ʹ�ü������ʵ�ֵ�stack
 */
public class ArrayStack {

	//topֵ��ʾstack��ǰ�������±�index
	private int top;
	//��ʾstack����
	private int capacity;
	//ʹ������ʵ��stack
	private int[] array;
	
	/**
	 * 	
	 * @param stackNumber
	 * 	��ʼ�������top
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
		//���˵�ʱ�� topҲ����indexָ���������������� Ҳ��capacity-1
		return (top ==capacity-1);
	}
	
	/**
	 * 	��ջ
	 * 	if ���ж���������û�У����˱���/�쳣
	 * 	else array[++top] = �����object
	 * @param data
	 */
	public void push(int data) {
		if(isStackFull()) {
			System.out.println("stack is full");
		}else {
			//û��
			array[++top] = data;
		}
	}
	
	/**
	 * 	��ջ
	 * 	if ���ж�ջ�Ƿ�Ϊ��
	 * 		Ϊ���򱨴�/�쳣 �� return 0 ����-1������
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
	 * 	��̬�������飬��ֹstack overflow
	 * 	�ɱ�������
	 */
	public void doubleStack() {
		int newArray[] = new int[capacity*2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity = capacity *2;
		array = newArray; 
	}
	
	
	
}
