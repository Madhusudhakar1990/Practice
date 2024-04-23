package practices;

public class Car 
{
	
	String brand;
	int drive;
	
	
	
//	System.out.print(" Brand name is "+brand+"and drive state is "+drive);
	
	

	
	public Car(String brnd, int drv)
	{
		System.out.println(brnd+"car name"+" "+drv+" test" );
		
		this.brand = brnd;
		this.drive = drv;
	
	}
	
	
	
	public Car()
	{
		System.out.println("default const");
		System.out.println(" Brand name is "+brand+"and drive state is "+drive);
	}
	
	
	
	public static void main(String[] args) 
	
	{
		
		Car cr =  new Car();
		
		Car cr1 = new Car("tata",23);
		
		

		
		
		
		
	}

}
