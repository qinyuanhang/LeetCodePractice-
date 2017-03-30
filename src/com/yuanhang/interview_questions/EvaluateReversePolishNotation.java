package com.yuanhang.interview_questions;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;
        
        Stack<String> stack = new Stack<String>();
        
        for(int i = 0; i < tokens.length; i++){
            
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") ){
                stack.push(tokens[i]);
            }else{
                int post = Integer.parseInt(stack.pop());
                int pre = Integer.parseInt(stack.pop());
                int result = 0;
                switch(tokens[i]){
                    case "+": result = post+pre;
                                break;
                                
                    case "-": result = pre-post;
                                break;
                    
                    case "*": result = post*pre;
                                break;             
                                
                    case "/": result = pre/post;
                                break;             
                }
                stack.push(result+"");
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
}
