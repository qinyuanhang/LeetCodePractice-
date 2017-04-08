package com.yuanhang.interview_questions;

import java.util.HashMap;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
	     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(map.containsKey(nums[i])){
	                int position = map.get(nums[i]);
	                if(i - position <= k){
	                    return true;
	                }
	            }
	                map.put(nums[i],i);
	            
	        }
	        return false;
	    }
}
