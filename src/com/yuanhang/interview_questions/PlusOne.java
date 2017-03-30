package com.yuanhang.interview_questions;

public class PlusOne {
	public int[] plusOne(int[] digits) {
	        
	        int [] res = new int [digits.length + 1];
	        int carry = 0;
	        int one = 1;
	        
	        for(int i = digits.length - 1; i >= 0; i--){
	            if(digits[i] + one + carry == 10){
	                carry = 1;
	              
	                res[i + 1] = 0;
	            }else{
	                res[i + 1] = digits[i] + carry + one;
	             
	                carry = 0;
	            }
	               one = 0;
	        }
	        if(carry == 1) res[0] = 1;
	        
	        if(res[0] != 0){
	            return res;
	        }else{
	            for(int i = 1; i < res.length; i ++){
	             digits[i - 1] = res[i];
	            }
	        }
	            return digits;   
	    }
}
