package com.yuanhang.interview_questions;

public class SameTree {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	      if(p == null && q == null){
	          return true;
	      }else if(p != null && q != null){
	          if(p.val != q.val){
	              return false;
	          }
	          
	          boolean left = isSameTree(p.left, q.left);
	          boolean right = isSameTree(p.right, q.right);
	          
	          return left && right;
	      }else{
	          return false;
	      }
	    }
}
