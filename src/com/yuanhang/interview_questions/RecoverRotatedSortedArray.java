package com.yuanhang.interview_questions;

import java.util.ArrayList;

public class RecoverRotatedSortedArray {
	public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        int mini = Integer.MAX_VALUE;
        int miniP = 0;
        
        
        //要是没有重复数字的话，可以用二分法来找最小的数字
      for(int i = 0; i < nums.size(); i++){
          if(nums.get(i) < mini){
              miniP = i;
              mini = nums.get(i);
          }
      }
      
      help(nums, 0, miniP - 1);
        help(nums, miniP, nums.size() - 1);
            help(nums, 0, nums.size() - 1);    
    }
      
    private void help(ArrayList<Integer> nums, int head, int end){
        
        while(end > head){
            int temp = nums.get(end);
            nums.set(end, nums.get(head));
            nums.set(head, temp);
            end --;
            head ++;
        }
    }
}
