


class Manager{
	
	public int salary = 10000;
}



class Developer extends Manager{
	
	
	int d_salary = salary - 5000;
	
	void print() {
		System.out.print("Manager:"+salary);
		System.out.print("\n");
		System.out.print("Developer:"+d_salary);
	}

}

public class Employee {

	public static void main(String[] args) 
	{
		Developer d = new Developer();
		d.print();

	}

}
