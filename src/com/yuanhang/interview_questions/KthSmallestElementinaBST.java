package com.yuanhang.interview_questions;

public class KthSmallestElementinaBST {
	private int count = 0;
    private TreeNode res = null;
    public int kthSmallest(TreeNode root, int k) {
      help(root, k);
      return res == null ? -1 : res.val;
    }   
    public void help(TreeNode root, int k){
        if(root.left != null){
            help(root.left, k);
        }
        count ++;
        if(count == k){
            res = root;
            return;
        }
        if(root.right != null){
            help(root.right, k);
        }
    }
}
