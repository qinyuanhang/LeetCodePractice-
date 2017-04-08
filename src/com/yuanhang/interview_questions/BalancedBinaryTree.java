package com.yuanhang.interview_questions;

/**
 * 左右子树的高度差不能超过1
 * 
 * */
public class BalancedBinaryTree {
	
	 public boolean isBalanced(TreeNode root) {
	        return getHigh(root) == -1 ? false : true;
	 }
	 
	 private int getHigh(TreeNode root){
		 if(root == null){
			 return 0;
		 }
		 
		 int left = getHigh(root.left);
		 int right = getHigh(root.right);
		 
		 
		 if(Math.abs(left - right) > 1 || left == -1 || right == -1){
			 return -1;
		 }
		 
		 return Math.max(left, right) + 1;
		 
	 }
	

}
