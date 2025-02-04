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
		
	}
	 
	public void info ( String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	
	public void getinfo(String lastName, int id) {
		System.out.println(lastName);
		System.out.println(id);
		
		
	}
	

	/**
		TEst
  TEST 
  TEST
	*/
}
