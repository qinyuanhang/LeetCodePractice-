package com.yuanhang.interview_questions;

import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
        int res = 0;
        if(s.length() == 0){
            return res;
        }        
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                if(stack.empty()){
                    max = 0;
                }else{
                    int matchL = i - stack.pop() + 1;
                    if(stack.empty()){
                        max += matchL;
                        matchL = max;
                    }else{
                        matchL = i - stack.peek();
                    }
                      res = Math.max(matchL,res);
                }
            }
          
        }
        return res;
    }
}
