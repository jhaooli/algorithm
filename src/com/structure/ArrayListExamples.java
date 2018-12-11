package com.structure;

import java.util.*;

public class ArrayListExamples {

    public static void main(String args[]) {
        // ����һ���յ������������list��list�������String���͵�����
        ArrayList<String> list = new ArrayList<String>();

        // ����Ԫ�ص�list������
        list.add("Item1");
        list.add("Item2");
        list.add(2, "Item3"); // ������佫��ѡ�Item3���ַ������ӵ�list�ĵ�3��λ�á�
        list.add("Item4");

        // ��ʾ���������е�����
        System.out.println("The arraylist contains the following elements: "
                + list);

        // ���Ԫ�ص�λ��
        int pos = list.indexOf("Item2");
        System.out.println("The index of Item2 is: " + pos);

        // ������������Ƿ�Ϊ��
        boolean check = list.isEmpty();
        System.out.println("Checking if the arraylist is empty: " + check);

        // ��ȡ����Ĵ�С
        int size = list.size();
        System.out.println("The size of the list is: " + size);

        // ��������������Ƿ����ĳԪ��
        boolean element = list.contains("Item5");
        System.out
                .println("Checking if the arraylist contains the object Item5: "
                        + element);

        // ��ȡָ��λ���ϵ�Ԫ��
        String item = list.get(0);
        System.out.println("The item is the index 0 is: " + item);

        // ����arraylist�е�Ԫ��

        // ��1�ַ���: ѭ��ʹ��Ԫ�ص�����������Ĵ�С
        System.out
                .println("Retrieving items with loop using index and size list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " - Item: " + list.get(i));
        }

        // ��2�ַ���:ʹ��foreachѭ��
        System.out.println("Retrieving items using foreach loop");
        for (String str : list) {
            System.out.println("Item is: " + str);
        }

        // �����ַ���:ʹ�õ�����
        // hasNext(): ����true��ʾ���������л���Ԫ��
        // next(): ������һ��Ԫ��
        System.out.println("Retrieving items using iterator");
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println("Item is: " + it.next());
        }

        // �滻Ԫ��
        list.set(1, "NewItem");
        System.out.println("The arraylist after the replacement is: " + list);

        // �Ƴ�Ԫ��
        // �Ƴ���0��λ���ϵ�Ԫ��
        list.remove(0);

        // �Ƴ���һ���ҵ��� "Item3"Ԫ��
        list.remove("Item3");

        System.out.println("The final contents of the arraylist are: " + list);

        // ת�� ArrayList Ϊ Array
        String[] simpleArray = list.toArray(new String[list.size()]);
        System.out.println("The array created after the conversion of our arraylist is: "
                        + Arrays.toString(simpleArray));
    }
}
