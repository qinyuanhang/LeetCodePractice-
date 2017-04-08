package com.yuanhang.interview_questions;
/**
 * 左右两个指针，谁小谁向中间靠
 * */
public class TrappingRainWater {
	public int trappingRainWater(int [] h){
		int res = 0;
		int left = 0;
		int right = h.length - 1;
		if(left >= right){
			return res;
		}
		int leftH = h[left];
		int rightH = h[right];
		while(right > left){
			if(h[left] < h[right]){
				left++;
				if(leftH <= h[left]){
					leftH = h[left];
				}else{
					res += leftH - h[left];
				}
			}else{
				right--;
				if(rightH <= h[right]){
					rightH = h[right];
				}else{
					res += rightH - h[right];
				}
			}			
		}
		return res;
	}
}
