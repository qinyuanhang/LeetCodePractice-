package com.yuanhang.interview_questions;
/*
 * 判断一个数字是不是回文，有3种方法
 * 1：变成字符串，头尾比较，简单，不用考虑是否超出范围，但是费额外空间
 * 
 * 2：当成数字来处理，用数学方法取头和尾，比如1234，取头就是1234 / 1000 = 1，  取尾 就是 1234 % 10 = 4
 * 
 * 3：把数字反过来，reverseNum 方法，在比较和原来数字是否相同，复杂，费额外空间，而且还需要考虑是否反过来超出了 int 的范围。 不推荐，这里不讨论

 * */
public class PalindromeNumber {
	
	//当成字符串来运算，
	public boolean palindromeNumber_1(int num){
		
		 if(num < 0) return false;
	        
			String numString = num + "";
			int head = 0;
			int end = numString.length() - 1;
			
			while(end > head){
				if(numString.charAt(head) != numString.charAt(end)){
					return false;
				}
				end--;
				head++;
			}
			return true;			
	}
	
	//当成数字来处理，
	public boolean palindromeNumber_2(int num){
		
	if(num < 0) return false;
		
		int zeros = 1;
		//获得最高位，比如：123321 就得到zeros = 100000， 这样 去左边第一个数字：123321 / 100000 = 1  取右边第一个数字：123321 % 10 = 1，不相等的话就返回错，
		// 相等的话， 123321 变成 （123321 % 100000）=23321 -》 23321 / 10 = 2332， 这时候 zeros也要相应的变成 100000 / 100 = 1000，以便于下一次取最左边和最右边
		while(num / zeros >= 10){
			zeros *= 10;			
		}
		
		while(num > 0){
			int left = num / zeros;
			int right = num % 10;
			if(left != right){
				return false;
			}
			num = (num % zeros) / 10;
			zeros /= 100;			
		}
		return true;
			
	}
}
