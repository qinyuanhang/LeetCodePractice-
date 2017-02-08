import java.util.*;


public class WellOrderedString {
	public int total = 0;
	public void generate(int stringLength){
		ArrayList<String> result = new ArrayList<String>();
		generator(0, stringLength, result, "");
		for(String string : result){
			System.out.print(string+"\t");
		}
		System.out.println();
		System.out.println(total);
	}
	
	private void generator(int position, int stringLength, ArrayList<String> result,String temp){
		if(stringLength == 0){
			result.add(temp);
			total++;
			return;
		}
		
		for(int i = position; i < 26; i++){
			generator(i + 1, stringLength - 1, result, temp + (char)('a' + i));
			generator(i + 1, stringLength - 1, result, temp + (char)('A' + i));
		}
		
	}
	

}
