package string;

public class StringManuplucation 
{

	public static void main(String[] args) 
	{
	
		String name = "M@dh5u$u1d#a3k@r";
		
		StringBuilder charac = new StringBuilder();
		StringBuilder num = new StringBuilder();
		StringBuilder sp = new StringBuilder();
		
		
		
		
		char[] a = name.toCharArray();
		
		for(char c : a)
		{
			if(Character.isLetter(c))
			{
				charac.append(c);
			}
			else if(Character.isDigit(c))
			{
				num.append(c);
			}
			
			else
			{
				sp.append(c);
			}
		}
		
		
		System.out.println(charac);
		System.out.println(num);
		System.out.println(sp);
		


	}

}
