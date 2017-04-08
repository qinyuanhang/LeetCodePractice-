package com.yuanhang.interview_questions;

/**
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/

/**
我第一次接触双指针的题就是这个，碰到相同的，第二个跑，当第二个碰到与第一个不同的数时，把第一个往前走一步，把第二个copy到
当前第一的位置，两个再一起往前走一步，在循环直到第二个跑到头。
*/


public class RemoveDuplicatesfromSortedArray {
	   public int removeDuplicates(int[] nums) {

		   int length = nums.length;
	        if(length < 2) return length;


	        int right = 0;
	        int left = 0; 

	        while(right < length){
	            if(nums[right] == nums[left]){
	                right++;
	            }else{
	                left++;
	                nums[left] = nums[right];
	                right++;
	            }

	        }
	        return left + 1; 
	    }
}
