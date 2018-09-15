package com.yuanhang.interview_questions;

import java.util.Stack;

import com.sun.istack.internal.logging.Logger;
import com.sun.org.apache.bcel.internal.generic.RETURN;



/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Example 1:

Input: "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()"
Example 2:

Input: ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()"
 * 
 * */

public class LongestValidParentheses {
	
	public LongestValidParentheses(){
		testLongestValidParentheses();
	}
	
	public int longestValidParentheses(String s) {
        int res = 0, tempL = 0;       
        Stack<Integer> positionStack = new Stack<>();
        positionStack.push(-1);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                positionStack.push(i);
            }else{
               positionStack.pop();
               if (positionStack.empty()) {
            	   positionStack.push(i);
               } else {
            	   res = Math.max(res, i - positionStack.peek());           	   
               }
            }
          
        }
        return res;
    }
	
	
	public void testLongestValidParentheses() {
		String [] testStrings = {
				"()()()()(((())))",
				"(()()()()()()",
				"(()(()()()"
		};
		
		for (String test : testStrings){
			System.out.println(test + " answer is: " + longestValidParentheses(test));
		}
	}
}
