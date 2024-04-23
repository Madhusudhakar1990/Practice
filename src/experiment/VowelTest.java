package experiment;

public class VowelTest {

	public static void main(String[] args) {

		String name = "Madhusudhakaryaragudi";
//		char[] na = name.toCharArray();

//		char AA = 'a';
//		char ee = 'e';
//		char ii = 'i';
//		char oo = 'o';
//		char uu = 'u';

		int counta = 0 ;
//		int counte = 0;
//		int counti = 0;
//		int counto = 0;
//		int countu = 0;
		
		
		for(int i =0; i <= name.length()-1;i++)
		{
			if(name.charAt(i) == 'a')
			{
			counta++;
			}
			
		}
		
				

		System.out.println(counta);


	}

}
