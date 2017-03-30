package com.yuanhang.interview_questions;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * */

public class MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int end = n + m - 1;
        int nums1_end = m - 1;
        int nums2_end = n - 1;
        
        while(nums1_end >= 0 && nums2_end >= 0){
        	if(nums1[nums1_end] > nums2[nums2_end]){
        		nums1[end] = nums1[nums1_end];
        		nums1_end --;
        	}else{
        		nums1[end] = nums2[nums2_end];
        		nums2_end --;
        	}
        	
        	
        	end --;
        }
        
        while(nums1_end >= 0){
        	nums1[end] = nums1[nums1_end];
        	end--;
        	nums1_end--;
        }
        while(nums2_end >= 0){
        	nums1[end] = nums2[nums2_end];
        	end--;
        	nums2_end--;
        }
     
    }
	
	
	/**
	 * 简单一点
	 * */
	
	public void merge_2(int[] nums1, int m, int[] nums2, int n) {	       
	       while(m > 0 && n > 0){
	           if(nums1[m - 1] > nums2[n - 1]){
	               nums1[m + n - 1] = nums1[m - 1];
	               m--;
	           }else{
	               nums1[m + n - 1] = nums2[n - 1];
	               n--;
	           }
	       }
	       
	       while(n > 0){
	           nums1[m + n - 1] = nums2[n - 1];
	           n--;
	       }
	    }	
}
