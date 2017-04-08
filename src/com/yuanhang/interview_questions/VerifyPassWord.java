package com.yuanhang.interview_questions;

/*
 * Verify if the given password is valid/invalid
 * 1. must be 5-12 characters long 
 * 2. must contain at least one number and one lower case character 
 * 3. a sequence must not be followed by the same sequence 
 * (like 123123qs is invalid, 123qs123 is valid)
 */


public class VerifyPassWord {
	public String password;

	private boolean hasLowerCase = false;
	private boolean hasNumber = false;
	private boolean lengthMatch = false;
	private boolean noSamePatten = false; 
	
	public VerifyPassWord(){
		password = null;
	}
	
	public boolean check(String password){
		this.password = password;
		if(password.length() >=5 && password.length() <=12) lengthMatch = true;
		for(char c : password.toCharArray()){
			if(c == ' ') return false;
			if(c < '9' && c > '0') hasNumber = true;
			if(c > 'a' && c < 'z') hasLowerCase = true;			
		}		
		checkPatten(password);		
		return hasLowerCase && hasNumber && lengthMatch && noSamePatten;
	}
	
	private void checkPatten(String password){
		
		
		noSamePatten = true;
	}  
	
}
