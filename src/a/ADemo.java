package a;

public class ADemo {
	
	public static void main(String[] args) {
		System.out.println("ADemo: TeamE");

		ADemo s1 = new ADemo (); 
		s1.info("Zaid", 35); 
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void subtract(int a , int b) {
		System.out.println(a-b);
		
	}
	
	public void divid(int a , int b) {
		System.out.println(a/b);
		
		int c = 20;
		int d = 20;
		System.out.println(c+d);
		
	}
	 
	public void info ( String name, int age) {
		System.out.println(name);
		System.out.println(age);}
	
	
	public void info1 (String lastName) {
		System.out.println("Morillo");
	}

	public void TrueorFalse( boolean a , boolean b) {
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	public void getinfo(String lastName, int id) {
		System.out.println(lastName);
		System.out.println(id);
		
		// Zaid CODE -----------------------------------------------------------------------------
		ADemo b1 = new ADemo(); 
		
		int s1 = b1.sumDouble (1, 2); //→ 3
		int s2 = b1.sumDouble (3, 2); //→ 5
		int s3 = b1.sumDouble (2, 2); //→ 8
			
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	public int sumDouble (int a, int b) { 
		int result = 0; 
		int total = a + b; 
		if (a == b) { 
			result = total *2; 
		} else { 
			result = total; 
		}
		
		return result; 
	}
	
	}
	/**
		TEst
  TEST 
  TEST
	*/

