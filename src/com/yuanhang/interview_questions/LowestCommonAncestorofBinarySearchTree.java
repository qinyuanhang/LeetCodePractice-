package com.yuanhang.interview_questions;
/**
 * 这说的二叉搜索树，相对比较简单,数值都是大小排列
 * */
public class LowestCommonAncestorofBinarySearchTree {
	
	
	//这个用递归，其实不用也可以做
	 public TreeNode lowestCommonAncestor_1(TreeNode root, TreeNode p, TreeNode q) {
		 if(root == null || p == null || q == null){
			 return root;
		 }
		 
		 if(root.val == p.val || root.val == q.val ){
			 return root;
		 }
		 
		 if(root.val > p.val && root.val > q.val ){
			 return lowestCommonAncestor_1(root.left, p, q);
		 }else if(root.val < q.val && root.val < p.val){
			 return lowestCommonAncestor_1(root.right, p, q);
		 }else{
			 return root;
		 }
 
	 }
	 
	 //不用递归的方法
	 public TreeNode lowestCommonAncestor_2(TreeNode root, TreeNode p, TreeNode q) {
	        while(root != null){
	            if(q.val > root.val && p.val > root.val){
	                root = root.right;
	            }else if(q.val < root.val && p.val < root.val){
	                root = root.left;
	            }else{
	                return root;
	            }
	        }
	        return null;
	    }
	 
	 
	 
}
