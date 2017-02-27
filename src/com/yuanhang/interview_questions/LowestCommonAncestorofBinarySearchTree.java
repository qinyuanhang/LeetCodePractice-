package com.yuanhang.interview_questions;
/**
 * 这说的二叉搜索树，相对比较简单,数值都是大小排列
 * */
public class LowestCommonAncestorofBinarySearchTree {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 if(root == null || p == null || q == null){
			 return root;
		 }
		 
		 if(root.val == p.val || root.val == q.val ){
			 return root;
		 }
		 
		 if(root.val > p.val && root.val > q.val ){
			 return lowestCommonAncestor(root.left, p, q);
		 }else if(root.val < q.val && root.val < p.val){
			 return lowestCommonAncestor(root.right, p, q);
		 }else{
			 return root;
		 }
 
	 }
}
