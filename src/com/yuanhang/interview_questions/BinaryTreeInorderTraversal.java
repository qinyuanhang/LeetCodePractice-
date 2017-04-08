package com.yuanhang.interview_questions;

import java.util.*;

/*
 * Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].

 * */


/**
 * 左中右
 * */


public class BinaryTreeInorderTraversal {
	
	
	    public List<Integer> inorderTraversal(TreeNode root) {

	   	 List<Integer> result = new ArrayList<Integer>();
	   	 
	   	List< List< Integer > >  result_arr = new ArrayList< List< Integer >  >();
	   	
	   	result_arr.add(inorder_Iteration(root, result));
	   	result_arr.add(inorder_Recursion(root, result));
	   	 
	   	 		return result_arr.get(0);
	    }
	    	
	    
	    /**
	     * 这个用递归方法做的。先对简单
	     * */
	    private List<Integer> inorder_Recursion(TreeNode root, List<Integer> result){
	        if(root == null) return result;
	        inorder_Recursion( root.left, result );
	        result.add( root.val );
	        inorder_Recursion( root.right, result);
	        return result;
	    }
	    
	    
	    
	    /**
	     * 这个用iteration做的
	     * */    
	    private List<Integer> inorder_Iteration(TreeNode root, List<Integer> result){
	    	
	    	Stack<TreeNode> stack = new Stack<TreeNode>(); 
	    	TreeNode cur = root;	    	
	    	while(cur != null || !stack.empty() ){
	    		while( cur != null ){
	    			stack.add( cur );
	    			cur = cur.left;
	    		}
	    		cur = stack.pop();//这个有一个pop，所以可能会有空栈的可能。所以要判断这个栈是不是空。
	    		result.add( cur.val );
	    		cur = cur.right;	    		
	    	}
	    	return result;
	    }
	
	

	
		
}
