package com.yuanhang.interview_questions;

import java.util.HashSet;
import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
    	
    	HashSet<String> set = new HashSet<String>();
    	for(String word : wordDict){
    		set.add(word);
    	}
    	
    	boolean [] res = new boolean[s.length() + 1];
    	Arrays.fill(res, false);
    	res[0] = true;
    	
    	for(int head = 0; head < res.length; head++){
    		for(int i = head; i < res.length; i++){
    			if(res[head] == true && set.contains(s.substring(head, i))){
    				res[i] = true;
    			}
    		}
    	}
    	
        return res[res.length - 1];
    }
}