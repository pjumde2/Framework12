package practise1;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="MLKJ";
		String rev="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}

		System.out.println("Reverse String is: "+rev);
	}

}
