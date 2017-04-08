package com.yuanhang.interview_questions;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int longestConsecutiveSequence (int [] nums){

		if(nums.length == 0|| nums == null){
			return 0;
		}	

		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int element : nums){
			set.add(element);
		}

		int max = 0;
		for(int element : nums){

			int left = element - 1;
			int right = element + 1;
			int count = 1;

			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}

			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}

			max = Math.max(max, count);

		}

		return max;

	}
}
