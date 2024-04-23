package experiment;

public class PracTwo 
{

	public void overload(int a)
	{
		String name = "madhu "+a+" sudhakar";
		System.out.println(name);
	}
	
	public void overload(int a, String na)
	{
		String name = "madhu "+a+na;
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		PracTwo test = new PracTwo();
		
		test.overload(4721);
		test.overload(5323, "Mivaan");
		
		
	}

}
