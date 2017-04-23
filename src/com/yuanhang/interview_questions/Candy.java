package com.yuanhang.interview_questions;
//左右走一遍，最大的
public class Candy {
	public int candy(int[] ratings) {
	    
	    
	    int [] res = new int [ratings.length]; 
	    res[0] = 1;
	    
	        for(int i = 1; i < res.length; i++){
	            if(ratings[i] > ratings[i - 1]){
	                res[i] = res[i - 1] + 1;
	            }else{
	                res[i] = 1;
	            }
	        }
	        
	        int result = res[ratings.length - 1];
	        for(int j = res.length - 2; j >= 0; j--){
	            int cur = 1;
	            if(ratings[j] > ratings[j + 1]){
	                cur = res[j + 1] + 1;
	            }
	            result += Math.max(cur, res[j]);
			    res[j] = cur;
	        }
	        return result;
	    }
}
