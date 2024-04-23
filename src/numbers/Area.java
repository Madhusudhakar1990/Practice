package numbers;

public class Area 
{
	
	static double pi =  3.14;
	
	public void circle(int radius)
	{
		int  r = radius;
		
		double area =  Area.pi*r*r;
		
		System.out.println("Area of circle : "+area);
	}
	
	public void triangle(int height, int base)
	{
		int h = height;
		int b = base ;
		
		double area  =  0.5*b*h ;
		
		System.out.println("Area of Triangle : "+area);
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		
		Area  a =  new Area();
		
		a.circle(54);
		a.triangle(23, 34);

	}

}
