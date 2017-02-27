package com.yuanhang.interview_questions;



public class BinaryTreeMaximumPathSum {
	
	
	
	class result{
		int singlePath;
		int maxPath;
		result(int singlePath, int maxPath){
			this.singlePath = singlePath;
			this.maxPath = maxPath;
		}
	}
	
	private result helper(TreeNode root){
		if(root == null){
			return new result(0, Integer.MIN_VALUE);
		}
		
		result left = helper(root.left);
		result right = helper(root.right);
		
		int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
		singlePath = Math.max(0, singlePath);
		
		int maxPath = Math.max(left.maxPath, right.maxPath);
		maxPath = Math.max( maxPath, left.maxPath + right.maxPath + root.val );
		
		return new result(singlePath, maxPath);
		
	}
	
	public int maxPathSum(TreeNode root) {
        result res = helper(root);
        return res.maxPath;
    }
}
