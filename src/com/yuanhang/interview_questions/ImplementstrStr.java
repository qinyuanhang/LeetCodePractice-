package com.yuanhang.interview_questions;

public class ImplementstrStr {
	 public int strStr(String h, String n) {
	        
	        if(h.equals(n) || n.equals("")) return 0;
	        
	        for(int i = 0; i <= h.length() - n.length(); i++){
	            if(h.charAt(i) == n.charAt(0)){
	                String temp = h.substring(i, i+n.length());
	                if(temp.equals(n)){
	                    return i;
	                }
	            }
	        }
	        return -1;
	    }
}
