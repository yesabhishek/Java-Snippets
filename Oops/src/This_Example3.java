class Alpha{

	Alpha getAlpha() {
		return this;
	}
	
	void message() {
		System.out.println("Hey I just printed the message");
	}

}

public class This_Example3 {

	public static void main(String[] args) {
		
		new Alpha().getAlpha().message();
	}

}
