class A{
	
	protected int a;
	
	A(int _a){
		a = _a;
	}
}

class B extends A{
	
	int b;
	
	B(int _a, int _b){
		super(_a);
		
		b = _b;
		a += 100;
	}
	
	void print() {
		
		System.out.println(a+" "+b);
	}
	
}




public class Relationship {

	public static void main(String[] args) {
		
		B b = new B(10,20);
		b.print();
	}

}
