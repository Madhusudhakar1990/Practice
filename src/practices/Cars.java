package practices;

import oops.Child;

public  class Cars extends Child
{

	public void data(String name)
	{
		String cars = name;
		
		System.out.println(cars);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Cars cr  = new Cars();
		
		cr.data("Bajaja");
		cr.data("tata");
		
		
		
	}

}
