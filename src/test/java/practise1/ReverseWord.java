package practise1;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str="Java is Kawa".split(" ");
		String rev="";
		
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+" "+str[i];
		}

		System.out.println("Reverse Word is: "+rev);
	}

}
