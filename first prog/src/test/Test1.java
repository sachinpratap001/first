package test;

public class Test1 {
	
	public void s () {
		
		this .s3(10, 20, 30);
		System.out.println("Default Method");
	}
	
	public void s1(int a) {
		
		this.s();
		System.out.println("one perametrized");
	}
			
	public void s2(int a, int b) {
		
		this.s1(10);
		System.out.println("Two Parameterized");
	}
	
	public void s3(int a, int b, int c) {
		System.out.println("three parametrized");
		
	}
	public void s4(int a, int b, int c, int d) {
		
		this.s2(00, 00);
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.s4(00, 01, 02, 03);
		
	}

}
