package com.yuanhang.interview_questions;

import java.util.ArrayList;
import java.util.List;

//import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

public class SubSet {
	 public List<List<Integer>> subsets(int[] nums) {	   
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 List<Integer> temp = new ArrayList<Integer>();
		 helper(res, temp, nums, 0);
		 return res;		 
	   }

	private void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int p) {
		// TODO Auto-generated method stub		
		for(int i = p; i < nums.length; i++){
			temp.add(nums[i]);
			helper(res, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
		res.add(new ArrayList<Integer>(temp));
	}
}
