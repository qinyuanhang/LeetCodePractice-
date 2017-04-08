package com.yuanhang.interview_questions;



/*
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint 
 * stopping you from robbing each of them is that adjacent houses have 
 * security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.
 * */


/*
 * 一道入门级别的DP算法题，
 * 状态转移方程：res[i] = Math.max(res[i - 1], res[i - 2] + nums[i]);
 * 
 * 要么抢这个和隔着的前一个，要么就保留抢的上一家
 * */


public class HouseRobber {
	public int houseRobber(int[] house){
		
int length = house.length;
		
		if(length == 0) return 0;
		if(length == 1) return house[0];
	
		int[] result = new int [length];
		
		result[0] = house[0];
		result[1] = Math.max(house[0],house[1]);//记得这里要赋值
		
		
		for(int i = 2; i < length; i++){
			result[i] = Math.max(result[i - 1], house[i] + result[i - 2]);
		}

		return result[length - 1];
		
	}
	

}
