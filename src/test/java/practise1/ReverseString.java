package practise1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev="";
		String original="The world is round";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}

		System.out.println("The Reverse String is: "+rev);
	}

}
