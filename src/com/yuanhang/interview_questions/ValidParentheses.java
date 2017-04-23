package com.yuanhang.interview_questions;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()%2!=0) return false;
        
        Stack<Character> stack = new Stack<Character>();
        
        int n = 0 ;
       
        while(n<s.length()){
            char k = s.charAt(n);
            
           if(k=='(' || k== '[' || k=='{'){
               stack.push(k);
           }else{
             //这里要加绝对值，
               if(stack.isEmpty() || Math.abs(k - stack.pop())> 3) return false;
               
           }
           n++;
        }
        return stack.isEmpty();
    }
}
