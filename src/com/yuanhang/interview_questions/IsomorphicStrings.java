package com.yuanhang.interview_questions;

import java.util.HashMap;


/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 * */

/**
 * 用到hashtable的知识了，字符串同位置的字符，一个是key一个是value，
 * 
 * 当碰到存有的key， value 也应该和另一个字符串同位置的字符一样，否则是错
 * 
 * 当碰到存有的value， 没有对应的key， 报错。
 * 
 * 最后确定没有key，也没有value时，才把这个key， value加入
 * */
public class IsomorphicStrings {
	
	public boolean isomorphicStrings( String s, String t){
		
		if( s.length() == 0 ){ return true; }
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		for( int i = 0; i < s.length(); i++ ){
			
			if( map.containsKey( s.charAt(i) ) && map.get( s.charAt(i) ) != t.charAt(i) ){				
				return false;
			}
			if( map.containsValue( t.charAt(i) ) && !map.containsKey( s.charAt( i ) ) ) { 
				return false; 
			}				
				map.put( s.charAt(i), t.charAt(i));

		}
		return true;		
	}
}
