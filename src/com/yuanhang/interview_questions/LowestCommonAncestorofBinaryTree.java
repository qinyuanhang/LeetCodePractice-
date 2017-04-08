package com.yuanhang.interview_questions;

/**
 * 这是一道binary tree， 数值排放没有规律。所以比较难
 * */
public class LowestCommonAncestorofBinaryTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        if(root == null) return null;
   
   if(root.val == A.val || root.val == B.val) return root;
   
   
   TreeNode left = lowestCommonAncestor(root.left, A, B);
   TreeNode right = lowestCommonAncestor(root.right, A, B);
   
   
   if(left != null && right != null){
       return root;
   }else if(left != null)
   {
       return left;
   }else if(right != null){
       return right;
   }
   else {
       return null;
   }  
}
}
