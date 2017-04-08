package com.yuanhang.interview_questions;

/**
 * After robbing those houses on that street, 
 * the thief has found himself a new place for 
 * his thievery so that he will not get too much attention. 
 * This time, all houses at this place are arranged in a circle. 
 * That means the first house is the neighbor of the last one. 
 * Meanwhile, the security system for these houses remain the 
 * same as for those in the previous street.

Given a list of non-negative integers representing the amount 
of money of each house, determine the maximum amount of money 
you can rob tonight without alerting the police.
 * */

/*
 * house robber的中级难度，把arry 变成一个环，首尾相连，第一个和最后一个是邻居。
 * 解决方法：
 * 
 * 把array分成两段，0123456789 分成1： 012345678 和 123456789， 当成两段house robber 来做，最后取两个结果的最大值
 * */

public class HouseRobber_2 {
	
	public int houserobber_2(int [] house){
		if(house.length == 0) return 0;
		if(house.length == 1) return house[0];
		if(house.length == 2) return Math.max(house[0], house[1]);
		
		return Math.max(houserobber_1(house, 0, house.length - 2), houserobber_1(house, 1, house.length - 1));	
	}

	private int houserobber_1(int[] house, int start, int end) {
		// TODO Auto-generated method stub
		int [] result = new int[end - start + 1];
		result[0] = house[start];//这里容易犯错，写成house[0]
		result[1] = Math.max(house[start],house[start + 1]);//这里容易错写成 house[0] 和 house[1]
		start += 2;
		for(int i = 2; i < result.length; i++){
			result[i] = Math.max(result[i - 1], result[i - 2] + house[start]);
			start++;
		}
		return result[result.length - 1];
	}

}
