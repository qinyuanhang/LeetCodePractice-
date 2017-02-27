package com.yuanhang.interview_questions;



/**
 * 不能只比较 root root.left 和root.right  要用一个全局变量保证一个最小值，并且inorder 遍历，不能碰到比这个值更加小的值
 * */
public class ValidateBinarySearchTree {
	
		private int min = Integer.MIN_VALUE;
		private boolean isFirst = true;
	
	public boolean validateBinarySearchTree(TreeNode root){
		
		  
		  if(root == null) return true;
		       
		  if(!validateBinarySearchTree(root.left)) return false;
		      
		      
		       
		        if(!isFirst && root.val <= min){
		            return false;
		        }else{
		            isFirst = false;
		            min = root.val;
		        }
		        //if(!isValidBST(root.right)) return false;
		       
		        
		        return  validateBinarySearchTree(root.right);
		        
		    }
	} 

