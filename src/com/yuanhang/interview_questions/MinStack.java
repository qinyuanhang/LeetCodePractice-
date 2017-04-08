package com.yuanhang.interview_questions;
import java.util.Stack;

public class MinStack {
	   private  Stack<Integer> stack;
	   private Stack<Integer> minStack;
	    
	    public MinStack() {
	    	
	       stack = new Stack<Integer>();
	       minStack = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        stack.push(x);
	        if(minStack.empty() ){
	            minStack.push(x);
	        }else{
	            if(x <= minStack.peek() ){
	                 minStack.push(x);
	            }
	        }
	    }
	    
	    public void pop() {
	        int temp = stack.pop();
	        if(temp == minStack.peek()){
	            minStack.pop();
	        }
	        
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
}
