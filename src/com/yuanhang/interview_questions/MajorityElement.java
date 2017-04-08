package com.yuanhang.interview_questions;

import java.util.Arrays;


/**
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
public class MajorityElement {
	//第一种方法，排列之后取中间那个
	 public int majorityElement_1(int[] num) {
	        Arrays.sort(num);  
	        return num[num.length/2];  
	     
	  }
	 /*抵消思想
	  * 用一个result存可能的结果，用一个count计算这个result的次数，一个for循环，
	  * 当碰到和result相同的数字时，count++，当碰到不一样的时候，count--，当count减到0的时候，说明当前result已经被抵消完了，result就换成 i 这个位置的数字
	  * */
	 public int majorityElement_2(int[] num) {
		 int result = 0;
	        int count = 0;
	        for(int i = 0; i < num.length; i++){
	        	
	        	if(count == 0){
	        		result = num[i];
	        		count = 1;
	        	}else if(result == num[i]){
	        		count++;
	        	}else{
	        		count--;
	        	}	
	        }
	        
	        
	        return result;
	  }
}
