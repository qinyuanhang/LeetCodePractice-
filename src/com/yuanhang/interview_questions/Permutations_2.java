package com.yuanhang.interview_questions;

import java.util.*;

public class Permutations_2 {
	//这个方法可以，但是时间很久。不能过leetcode
public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums.length == 0 || nums == null){
            return res;
        }
        
        HashSet<Integer> usedP = new HashSet<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        
        help(nums, res, temp, usedP);
        
        return res;
    }
    
    private void help(int[] nums, List<List<Integer>> res, List<Integer> temp, HashSet<Integer> usedP){
        if(temp.size() == nums.length){
            if(!res.contains(temp))
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(usedP.contains(i)){
                continue;
            }else{
                usedP.add(i);    
                temp.add(nums[i]);
                HashSet<Integer> tempSet = new HashSet<Integer>(usedP);
                usedP.remove(i);
                help(nums, res, temp, tempSet);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
   // 
    
    
}
