package com.yuanhang.interview_questions;

public class RemoveDuplicatesfromSortedArrayII {
public int removeDuplicates(int[] nums) {
        
        if(nums.length < 3){
            return 2;
        }
        
        int count = 1;
        int res = 1;
        
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }else{
                count=1;
            }
            
            if(count < 3){
                nums[res] = nums[i];
                res++;
            }
        }
        
        return res;
    }
}
