package com.yuanhang.interview_questions;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        TreeNode root2 = root;
        
       return isSymmetric(root,root2);
    }
    
    
    public boolean isSymmetric(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                boolean left = isSymmetric(root1.left, root2.right);
                boolean right =  isSymmetric(root1.right,root2.left);
                return left && right;
            }else{
                return false;
            }
        }else{
            return false;
        }    
    }
}
