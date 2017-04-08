package com.yuanhang.interview_questions;

public class MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
         if(root.left==null && root.right!=null) return minDepth(root.right) + 1;
         if(root.left!=null && root.right==null) return minDepth(root.left) + 1;
       return Math.min(minDepth(root.left)+1 , minDepth(root.right)+1 );
    }
}
