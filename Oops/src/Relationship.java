class A{
	
	protected int a = 10;
}

class B extends A{
	
	int b = 20;
	
}

class C extends B{
	
	int c = 30;

	void print() {
		
		System.out.println("a:"+a+", b:"+b+", c:"+c);
	}

}


public class Relationship {

	public static void main(String[] args) {
		
		C c = new C();
		c.print();
	}

}
