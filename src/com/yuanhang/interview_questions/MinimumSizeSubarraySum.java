package com.yuanhang.interview_questions;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
          
        if(nums.length == 0 || nums == null){ return 0;}
        if(nums.length < 2){ return nums[0] > s ? 1 : 0;}
        
       
        int l = 0;
        int r = 0;
        int sum = 0;
        int minL = Integer.MAX_VALUE;
        
        while(r < nums.length){
            sum += nums[r];
            while(sum >= s){
                minL = Math.min(minL, r - l + 1);
                sum -= nums[l];
                l++;
            }
            r++;
        }
             
        return minL == Integer.MAX_VALUE ? 0 : minL;
    }
}
