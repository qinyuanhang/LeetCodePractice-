package com.yuanhang.interview_questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	
	
	
	
	public String findLargestNumbe(int [] nums){	
		
		
		
		
		List<String> list = new ArrayList<String>();	
		for(int i : nums){
			list.add(String.valueOf(i));
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				long l1 = Long.parseLong(o1 + o2);
				long l2 = Long.parseLong(o2 + o1);								
				return (int)(l2 - l1);
			}			
		});
		
		StringBuffer sb = new StringBuffer();
		for(String s : list ){
			sb = sb.append(s);
		}
		
		return sb.toString();
	}
}
