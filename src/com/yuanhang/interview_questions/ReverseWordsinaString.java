package com.yuanhang.interview_questions;

public class ReverseWordsinaString {
	public String reverseWords(String s) {
        s = s.replaceAll(" +", " ");//注意这个地方，把多个空格变成一个空格，用加好而不是乘号
        
        String[] arr = s.split(" ");
        
        int head = 0; 
        int end = arr.length - 1;
        while(end > head){
            String temp = arr[end];
            arr[end] = arr[head];
            arr[head] = temp;
            end --;
            head ++;
        }
        
        StringBuffer sb = new StringBuffer();
        for(String ss : arr){
            sb.append(ss);
             sb.append(" ");
        }       
        return sb.toString().trim(); 
    }
}
