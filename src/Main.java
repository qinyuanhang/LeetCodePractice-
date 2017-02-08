/**
 * test all challenge  here  
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("verify challenge \"ValidPassWord\"");
		ValidPassWord validPassWord = new ValidPassWord();		
		System.out.println(validPassWord.check("0","10"));
		System.out.print("\n\n");
		
		
		
		System.out.println("verify challenge \"VerifyPassWord\"");
		VerifyPassWord verifyPassWord = new VerifyPassWord();		
		System.out.println(verifyPassWord.check("yqyqh18191"));
		System.out.print("\n\n");
		
		
		System.out.println("verify challenge \"wellorderedstring\"");
		WellOrderedString wellOrderedString = new WellOrderedString();
		wellOrderedString.generate(2);
		System.out.print("\n\n");
		

	}

}
