package com.yuanhang.interview_questions;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

    /** Initialize your data structure here. */
    Queue<Integer> mainQ;
    Queue<Integer> sQ;
    
    
    
    
    public ImplementStackusingQueues() {
        mainQ = new LinkedList<Integer>();
        sQ = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        mainQ.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(mainQ.size() > 1){
            sQ.offer(mainQ.poll());
        }
        int res = mainQ.poll();
        while(sQ.size() > 0){
            mainQ.offer(sQ.poll());
        }
        return res;
    }
    
    /** Get the top element. */
    public int top() {
          while(mainQ.size() > 1){
            sQ.offer(mainQ.poll());
        }
        int res = mainQ.peek();
        sQ.offer(mainQ.poll());
        while(sQ.size() > 0){
            mainQ.offer(sQ.poll());
        }
        return res;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mainQ.isEmpty();
    }
}