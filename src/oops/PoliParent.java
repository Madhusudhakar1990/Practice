package oops;

public class PoliParent 
{
	
	String name  = "Madhu";
	
	public void poli(String naam)
	{
		name = naam ;
		
		System.out.println("Madhu "+naam);
	}
	
	public void poli(String empname, int empid )
	{
		System.out.println("Employ name : "+empname+ " and his ID : "+empid);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		PoliParent pp = new PoliParent();
		
		pp.poli("Sudhakar");
		
		
		
	}

}
