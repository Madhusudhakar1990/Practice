package experiment;

public class Maths {

	public void fibona(int n) {
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 0; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
			
			
		}
		System.out.println("********");
	}

	public void prime(int n) {

		int count = 0;
		
//		for(int j = 2; j<=n;j++)
//	{
//			
			
		for (int i = 1; i <= n; i++) 
		{
			if (n % i == 0) 
			{
				count++;
			}
		}
		if (count == 2) 
		{
	//		System.out.println(j+"");
		}
	}
	
	

	public void revString(String name) {
		String test = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i)); 
			test = test + name.charAt(i);
		}
//		System.out.println(test);
		if (name.equals(test)) {
			System.out.println("palindrom");
		}
	}

	public void swap(int a, int b) {
		System.out.println("inital value of A :" + a); // 3
		System.out.println("inital value of B :" + b); // 2
		a = a + b;// 2 + 3 =5
		b = a - b; // 5 - 3 = 2
		a = a - b;// 5 - 2 =3
		System.out.println("After value of A :" + a); // 3
		System.out.println("After value of B :" + b); // 2
	}
	
	

	public static void main(String[] args) {

		Maths m = new Maths();

		m.fibona(9);
		m.prime(7);
		m.revString("madam");
		m.swap(2, 3);

	}

}
