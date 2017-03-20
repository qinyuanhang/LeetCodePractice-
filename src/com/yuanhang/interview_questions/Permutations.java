package com.yuanhang.interview_questions;

import java.util.*;

/**
 * Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 * */

public class Permutations {
	 public List<List<Integer>> permute(int[] nums) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
	     if(nums.length == 0 || nums == null){
	    	 return res;
	     }
	     List<Integer> temp= new ArrayList<Integer>();	     
	     getPermutation(res, temp, nums);
		 
		 return res;
	 }
	
	
	 private void getPermutation(List<List<Integer>> res, List<Integer> temp, int [] nums){
		 
		 if(temp.size() == nums.length){
			 res.add(new ArrayList<Integer>(temp));
			 return;
		 }
		 
		 for(int i = 0; i < nums.length; i++){
			 if(temp.contains(nums[i])){
				 continue;
			 }
			 
			 temp.add(nums[i]);
			 getPermutation(res, temp, nums);
			 temp.remove(temp.size() - 1);			 
		 } 
	 }
	 
	 
	
}
