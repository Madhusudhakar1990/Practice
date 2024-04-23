package oops;

public class PoliChild extends PoliParent
{
String name = "Mivaan";

String naam=  "Jala";


	public void poli(String naam)
	{
	//	System.out.println("Mivaan "+naam);
		
		System.out.println(super.name);
	
	}
	public void poli(String naam, String name)
	{
		System.out.println("test"+this.naam);
		
		System.out.println("---"+name + naam+"---");
	}
	
	public void data()
	{
		
		
		String name = "Superman";
		
		
		System.out.println(name);
		System.out.println(this.name);
		System.out.println();
	}
	
	
	
	
	
	
	public void poli(int num, int numa)
	{
		System.out.println("number : "+ num + " and next number "+numa);
	}
	
	public static void main(String[] args) 

	{

		PoliChild pc =  new PoliChild();
		
//		PoliParent pp = new PoliParent();
		
		pc.poli("madhu", "sudhakar");
//				
		pc.poli("Yaragudi");
//		
//		System.out.println(pc.name);
//		
//		System.out.println(pp.name);
//		
//		pp.poli("Sudhakar");
//		
//		pp.poli("Jala", 002);
//		
//		pc.poli(23, 34);
		
		pc.data();
		
		
	
		
		
		
	}

}
