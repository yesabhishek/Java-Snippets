class X{
	X(){
		System.out.print("I am inside the default constructor \n");
	}
	
	X(int a){
//		this();
		System.out.print("I am inside the parameterised Constructor \n");
//		this();  We can't  call the default constructor other than from the first line
	}
}
public class This_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X b = new X(11);
		
	}

}
