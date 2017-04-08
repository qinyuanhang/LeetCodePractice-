package com.yuanhang.interview_questions;
/**
 * *
 * @author yuanhangqin
 * 
 * 水桶装水问题，求能装最多水的容器体积是多少。
 * 关键是那个模板短，就往中间移动。动态规划解法
 *
 */
public class ContainerWithMostWater {
	
	public int containerWithMostWater(int [] nums){
		
		int head = 0; 
		int end = nums.length - 1;
		int result = Integer.MIN_VALUE;
		
		while(end > head){
			
			result = Math.max(result, Math.min(nums[end], nums[head]) * (end - head));
			if(nums[end] > nums[head]){
				head++;
			}else{
				end--;
			}			
		}	
		return result;
	}

}
