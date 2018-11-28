package com.doingExer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



/**
 * 	������ϰ
 * @author jhao
 *
 */
public class MyTree {

	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	/**
	 * ����һ�����������ҳ��������ȡ�

�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����

˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣

ʾ����
���������� [3,9,20,null,null,15,7]��

    3
   / \
  9  20
    /  \
   15   7
�������������� 3 ��
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		  int depth = 0;
	        if (root != null) {
	            depth = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	        }
	        return depth;
			
    }
	
	
	class Graph{
		/*
		 * ͼ��
		 * 1.��ӱߵķ���
		 * 2.��ӵ�ķ���
		 * 3.dfs()���丨������
		 * 4.������ʵ��ͼ��ĳ�ʼ��
		 * ��Ա����������
		 * 1.һ����������
		 * 2.���ڴ洢�ߵĶ�ά����
		 * 3.int�Ͷ��������
		 * 4.����dfs��ջstack
		 */
		private int MaxV = 20;
		private Vertex vertexList[];
		private int adjMat[][];
		private int nVerts;
		private Stack theStack;
		
		public Graph(){
			vertexList = new Vertex[MaxV];
			adjMat  = new int[MaxV][MaxV];
			nVerts = 0;
			for(int i=0;i<MaxV;i++){
				for(int j=0;j<MaxV;j++){
					adjMat[i][j] = 0;
				}
			}
			theStack = new Stack();
		}//end constructor
		
		public void addVertex(char lab){
			vertexList[nVerts++] = new Vertex(lab);
		}
		
		public void addEdge(int start,int end){
			//�����Ҫ����������ͼ��������ͼ��
			//����������ͼ����ӷ�ʽ����˫����
			adjMat[start][end] = 1;
			adjMat[end][start] = 1;
		}
		
		//��ʾ����
		public void displayVertex(int v){
			System.out.println(vertexList[v].label);
		}
		
		//dfs
		public void dfs(){
			
			vertexList[0].wasVisited = true;
			displayVertex(0);
			theStack.push(new Integer(0));
			
			while(!theStack.isEmpty()){
				int v = getAdjUnvisitedVertex(Integer.parseInt(theStack.peek().toString()));
				if(v ==-1){
					theStack.pop();
				}else{
					vertexList[v].wasVisited = true;
					displayVertex(v);
					theStack.push(new Integer(v));
				}
			}//end while
			
			//��stackΪ�յ�ʱ���Ѿ��������� �����еķ���resetΪfalse
			for(int i=0;i<nVerts;i++){
				vertexList[i].wasVisited = false;
			}
		}

		private int getAdjUnvisitedVertex(int v) {
			// TODO �Զ����ɵķ������
			for(int i=0;i<nVerts;i++){
				if(adjMat[v][i]==1&&vertexList[i].wasVisited==false){
					return i;
				}
				
			}//end for
			return -1;
		}
		
	}


	class Vertex{
		public char label;
		public boolean wasVisited;
		
		public Vertex(char lab){
			label = lab;
			wasVisited = false;
		}
}
	
	/**
	 * 
	 * @param root
	 * @return
	 */
	public boolean isValidBST(TreeNode root) {
		/*
		 * ��ͨ��
        if(root.left.val>root.val||root.right.val<root.val) {
        	return false;
        }else {
        	return isValidBST(root.left)&&isValidBST(root.right);
        }
		 */
		List<Integer> list = new ArrayList<Integer>();
        getSeq(root,list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public  void getSeq(TreeNode root, List<Integer> list){
        if (root == null) {
            return;
        }
        getSeq(root.left,list);
        list.add(root.val);
        getSeq(root.right, list);
    }

    
    /**
     * ����һ���������������䰴��α����Ľڵ�ֵ�� �������أ������ҷ������нڵ㣩��

����:
����������: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
�������α��������

[
  [3],
  [9,20],
  [15,7]
]
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> list =null;
    	if(root==null) {
    		return list;
    	}
    	
    	Queue<TreeNode> que = new ArrayDeque<TreeNode>();
    	//���м�����ڵ�
    	que.add(root);
    	//�ж϶����Ƿ�Ϊ��
    	//����Ϊ�գ���ȡint size�Լ��½�һ�����������洢ÿһ�����ֵ
    	
    	while(!que.isEmpty()) {
    		int size = que.size();
    		List<Integer> tmp_list = new LinkedList<>();
    		
    		while(size--) {
    			TreeNode tmp_node= que.peek();
    			//����ǰ�ڵ������ӵ�tmp_list
    			tmp_list.add(que.peek().val);
    			que.remove();
    			
    			if(tmp_node.left!=null) {
    				que.add(tmp_node.left);
    			}
    			
    			if(tmp_node.right!=null) {
    				que.add(tmp_node.right);
    			}
    		}
    		
    		
    		list.add(tmp_list);
    		
    		//��tmp_list��ӵ�list��
    	}
    }

    
    /**
     * ��һ�������������е��������飬ת��Ϊһ�ø߶�ƽ�������������

�����У�һ���߶�ƽ���������ָһ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������ 1��

ʾ��:

������������: [-10,-3,0,5,9],

һ�����ܵĴ��ǣ�[0,-3,9,-10,null,5]�������Ա�ʾ��������߶�ƽ�������������

      0
     / \
   -3   9
   /   /
 -10  5f
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        return getTree(nums,0,nums.length - 1);
    }
     
    public TreeNode getTree(int []nums,int l,int r){
        if(l <= r){
            int mid = (l+r)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getTree(nums,l,mid-1);
            node.right = getTree(nums,mid+1,r);
            return node;
        }else{
            return null;
        }
    }




}

