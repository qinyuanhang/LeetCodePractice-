package com.yuanhang.interview_questions;


/**
 * 爬楼梯，一次只能爬1或者2步，给n个台阶，有多少钟爬法
一开始我想用递归算得，但是想的太复杂啦，
其实0，1，2，3个台阶只有0，1，2，3种爬法
到4就可以从3走一步上来或者从2有两种方法上来，
 * */
public class ClimbStairs{
	public int climbStairs(int n){
		int result = 0;
		if(n < 3) return n;
		
		int dp[] = new int [n + 1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;		
		/*
		 * //离我1远的台阶有一种方法，离我2远的台阶有两种方法，所以到我这里就有3种法，
             //再从3开始，到4有一种方法，到5有从3开始的两种方法和从4开始的1种方法，一直积累着从上一步到这一步的
             各种方法，积累到n时，放在n的就是一共到n得走法
		 * */
		for(int i = 3; i <= n; i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		result = dp[n];
		return result;
	}
}
