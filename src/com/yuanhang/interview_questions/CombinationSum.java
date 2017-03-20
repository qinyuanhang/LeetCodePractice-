package com.yuanhang.interview_questions;

import java.util.*;

public class CombinationSum {
	    public List<List<Integer>> combinationSum(int[] nums, int target) {
	        
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        
	        if(nums.length <= 0 || nums == null){
	            return res;
	        }
	        Arrays.sort(nums);
	        List<Integer> temp = new ArrayList<Integer>();
	        help(res, temp, nums, target, 0);
	        return res;
	        
	    }
	    
	    private void help( List<List<Integer>> res, List<Integer> temp, int[] nums, int target, int p){

	        for(int i = p; i < nums.length; i++){
	            if(target - nums[i] > 0){
	                temp.add(nums[i]);
	                help(res, temp, nums, target - nums[p], p++);
	                /**
	                 * 上面的语句相当于：
	                 *  help(res, temp, nums, target - nums[p], p);
	                 *  p++;
	                 * */
	                temp.remove(temp.size() - 1);
	            }else if(target - nums[p] == 0){
	                temp.add(nums[p]);
	                if(!res.contains(temp)){
	                    res.add(new ArrayList<Integer>(temp));
	                }
	                temp.remove(temp.size() - 1);
	            }else{
	                return;
	            }
	        }
	    }
}
