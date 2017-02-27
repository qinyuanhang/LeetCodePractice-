package com.yuanhang.interview_questions;

import java.util.*;


/*
 * 左右中
 * */
public class BinaryTreePostorderTraversal {
	List<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }
        
        help(root);
        return res;
        
    }    
    public void help(TreeNode root){
        if(root == null) return;
        help(root.left);
        help(root.right);
        res.add(root.val);
    }
}
