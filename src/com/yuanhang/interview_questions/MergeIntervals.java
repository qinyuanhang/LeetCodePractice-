package com.yuanhang.interview_questions;

import java.util.*;

/*
 * Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].


 * */



/*重点是学会重写comparator方法，
 * 
 * 把里面的interval按照开始时间，从小往大排列，要是开始时间一样，就按结束时间，从小往大排列。
 * 排列好之后，按顺序一个一个merge，
 * 上一个和下一个没有重叠的话，结果直接把上一个加进去，
 * 上一个和下一个有重叠的话，新建一个interval，开始时间取最小，结束时间取最大。把这个新建的interval变成上一个interval（而不是直接加进结果）
 * 
*/

public class MergeIntervals {
	  public List<Interval> merge(List<Interval> intervals) {
	        
	        List<Interval> result = new ArrayList<Interval>();
	        
	        if(intervals.size() <= 0 || intervals == null){ return result;}
	        
	        /**
	         * 这个重写compare方法要学会
	         * */
	        Collections.sort(intervals, new Comparator<Interval>(){
	            public int compare(Interval interval_1, Interval interval_2){
	                if(interval_1.start != interval_2.start){
	                    return interval_1.start - interval_2.start;
	                }else{
	                    return interval_1.end - interval_2.end;
	                }
	            }
	        });
	        
	        
	        Interval pre = intervals.get(0);
	        
	        for(int i = 0; i < intervals.size(); i++){
	            Interval cur = intervals.get(i);
	            if(cur.start > pre.end){
	                result.add(pre);
	                pre = cur;
	            }else{
	                Interval merge = new Interval(pre.start, Math.max(pre.end,cur.end));
	                pre = merge;
	            }
	        }
	        result.add(pre);
	        
	        return result;
	  }
}
