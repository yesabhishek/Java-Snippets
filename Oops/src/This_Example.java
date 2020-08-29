class Student{
	int fee;
	String name;
	
	Student(String name, int fee){
		this.name = name;
		this.fee = fee;
	}
	
	void print() {
		System.out.println("Name:"+name+", Fee:"+fee+"\n");
	}
}
public class This_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Rajesh", 10);
		Student s2 = new Student("Gagan", 20);
		s1.print();
		s2.print();
	}

}
