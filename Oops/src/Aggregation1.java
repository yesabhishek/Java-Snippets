class Operation{
	
	int square(int n) {
		return n*n;
	}
}

class Circle{
	
	
	double pi = 3.14;
	
	double area(int radius) {
		
		Operation op = new Operation();
		int rsquare = op.square(radius);
		
		return pi*rsquare;
	}
	
	
}

public class Aggregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		System.out.print("Area:"+c.area(4));
		
	}

}
