package com.yuanhang.interview_questions;

import java.util.*;

/**
 * Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log","cog"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.
 * */
public class WordLadder_1 {
	
	/*
	 * 这个方法会溢出，可以作为面试第一个方法。主要用了递归，空间和时间都很浪费
	 * */
	 public int ladderLength_1(String beginWord, String endWord, List<String> wordList) {
	        
	        Set<String> dic = new HashSet<String>();
	        
	        for(String str : wordList){
	        
	            dic.add(str);
	        }
	        
	        return help(beginWord, endWord, dic, 1);
	      
	    }
    
	    private int help(String beginWord, String endWord, Set<String> dic, int res){
	        
	        if(beginWord.equals(endWord)){
	            return res;
	        }
	        
	        for(int i = 0; i < beginWord.length(); i++){
	            if(beginWord.charAt(i) != endWord.charAt(i)){
	                for(char ch = 'a'; ch <= 'z'; ch++){
	                    String temp = changeChar(beginWord,  i, ch);
	                    if(dic.contains(temp)){
	                        return help(temp, endWord, dic, res + 1);
	                    }
	                }
	            }
	        }
	        
	        return 0;
	    }
	    
	    
	    private String changeChar(String s, int index, char c) {
	        char[] chars = s.toCharArray();
	        chars[index] = c;
	        return new String(chars);
	    }
	    
	    
	    /*
	     * 这个方法使用queue，只把有的string存起来，少了很多不必要的比较
	     * */
	    
	    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	        int res = 1;
	        
	        Set<String> dic = new HashSet<String>();
	        for(String word : wordList){
	            dic.add(word);
	        }
	        
	        if(beginWord.equals(endWord)){
	            return res;
	        }
	        
	        Queue<String> queue = new LinkedList<String>();
	        /*
	         * 这个hashset 是用来存已经比较过的字符串，如果没有的话会多很多不必要的比较
	         * 
	         * 
	         * 比如： bbbac
	         * 如果咩有这个set，这个字符串会比较很多次（bbbac）,因为0号位比一次，1号位biyici，2号位比一次。。。。
	       		有了这个set，0，1，2 三个位置只用比较一次（bbb就可以）
	         * */
	        Set<String> set = new HashSet<String>();
	        
	        queue.offer(beginWord);
	        while(!queue.isEmpty()){
	            res++;
	            int size = queue.size();
	            for(int i = 0; i < size; i++){
	                String start = queue.poll();
	                for(String str : getNextString(start, dic)){
	                    if(str.equals(endWord)){
	                        return res;
	                    }else if(set.contains(str)){
	                        continue;
	                    }else{
	                        queue.offer(str);
	                        set.add(str);
	                    }
	                }
	            }
	        }
	        
	        return 0;
	    }
	    	    
	    private ArrayList<String> getNextString(String beginWord, Set<String> dic){
	        ArrayList<String> list = new ArrayList<String>();
	        
	        for(char ch = 'a'; ch <= 'z'; ch++){
	           for(int i = 0; i < beginWord.length(); i++){
	               if(beginWord.charAt(i) != ch){
	                   String temp = changeChar(beginWord, i, ch);
	                   if(dic.contains(temp)){
	                       list.add(temp);
	                   }
	               }
	           }
	        }
	        return list;
	    }
}
