

/*
 * In 1-9 keypad one key is not working. If someone enters a password 
 * then not working key will not be entered. You have given expected 
 * password and entered password. Check that entered password is valid 
 * or not. Ex: entered 164, expected 18684 (you need to take care as 
 * when u enter 18684 and 164 only both will be taken as 164 input)
 */

public class ValidPassWord {
	public String expectString;
	public String enterString;
	private boolean result;
	
	ValidPassWord(){
		expectString = null;
		enterString = null;
		result = true;		
	}
	
	public boolean check(String expectString,String enterString){		
		int [] expectInts = getCharMap(expectString);
		int [] enterInts = getCharMap(enterString);
		
		for(int i : expectInts){
			if(enterInts[i] != expectInts[i] || expectInts[i] != 0) return false; 
		}		
		return result;
	}	
	private int [] getCharMap(String inputString){
		int [] result = new int[10];
		for(int i = 0; i < 10; i++){
			result[i] = 0;
		}
		for(int i = 0; i < inputString.length(); i++){			
			int charToInt = inputString.toCharArray()[i] - '0';
			result[charToInt]++; 
		}				
		return result;
	}	
}
