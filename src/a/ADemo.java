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
		
		
	}
	public void String (String nameEmployee, int id) {
	   System.out.println(nameEmployee);
	   System.out.println(id);
	
	
	}
	/**
		TEst
  TEST 
  TEST
	*/
}
