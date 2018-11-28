package com.doingExer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



/**
 * 	树的练习
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
	 * 给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。
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
		 * 图类
		 * 1.添加边的方法
		 * 2.添加点的方法
		 * 3.dfs()及其辅助方法
		 * 4.构造器实现图类的初始化
		 * 成员变量包括：
		 * 1.一个顶点数组
		 * 2.用于存储边的二维数组
		 * 3.int型顶点计数器
		 * 4.用于dfs的栈stack
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
			//这里就要区分是有向图还是无向图了
			//以下是无向图的添加方式，即双向都有
			adjMat[start][end] = 1;
			adjMat[end][start] = 1;
		}
		
		//显示顶点
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
			
			//当stack为空的时候，已经遍历完了 将所有的访问reset为false
			for(int i=0;i<nVerts;i++){
				vertexList[i].wasVisited = false;
			}
		}

		private int getAdjUnvisitedVertex(int v) {
			// TODO 自动生成的方法存根
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
		 * 不通过
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
     * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：

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
    	//队列加入根节点
    	que.add(root);
    	//判断队列是否为空
    	//若不为空，获取int size以及新建一个数组用来存储每一层的数值
    	
    	while(!que.isEmpty()) {
    		int size = que.size();
    		List<Integer> tmp_list = new LinkedList<>();
    		
    		while(size--) {
    			TreeNode tmp_node= que.peek();
    			//将当前节点的数添加到tmp_list
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
    		
    		//将tmp_list添加到list中
    	}
    }

    
    /**
     * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

示例:

给定有序数组: [-10,-3,0,5,9],

一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：

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

