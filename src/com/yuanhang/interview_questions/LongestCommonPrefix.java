package com.yuanhang.interview_questions;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
	        
	        if(strs.length == 0 || strs == null){
	            return "";
	        }
	        
	        Arrays.sort(strs, new Comparator<String>(){
	            public int compare(String s1, String s2){
	                return s1.length() - s2.length();
	            }
	        });    
	        
	        for(int i = strs[0].length(); i >= 0; i--){
	            for(int j = 0; j < strs.length; j++){
	                if(!strs[j].substring(0,0 + i).equals(strs[0].substring(0,0 + i))){
	                    break;
	                }
	                if(j == strs.length - 1){
	                    return  strs[0].substring(0,0 + i);
	                }
	            }
	        }	        
	        return "";
	    }
	    
}
