class GrandParent{
	
	String name;
	int age;
	long assets;
	int childrens;
	long income;
	
	GrandParent(String name, int age, long assets, int childrens, long income){
		this.name = name;
		this.age = age;
		this.assets =assets;
		this.childrens = childrens;
		this.income = income;
	}
	
	void print() {
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Income: "+income);
		System.out.println("Assets: "+assets);
		System.out.println("Childrens: "+childrens);
		
	}
	
}

class Parent extends GrandParent{
	

	Parent(String name, int age, long assets, int childrens, long income) 
	{
		super(name, age, assets, childrens, income);
		this.name = name;
		this.age = age;
		this.assets = income + assets ;
		this.childrens = childrens;
		this.income = income;
		
	}
	

	void print_parent() {
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Income: "+income);
		System.out.println("Assets: "+assets);
		System.out.println("Childrens: "+childrens);
	
	}

}

class Children extends Parent{
	

	Children(String name, int age, long assets, int childrens, long income) 
	{
		super(name, age, assets, childrens, income);
		this.name = name;
		this.age = age;
		this.assets =assets;
		this.childrens = childrens;
		this.income = income;
		
	}	

	void print_child() {
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Income: "+income);
		System.out.println("Assets: "+assets);
		System.out.println("Childrens: "+childrens);
		
	}

}

public class Family_Hierarchy {

	public static void main(String[] args) {
		

		GrandParent g = new GrandParent("Kamlesh", 77, 0, 5, 10);
		Parent p = new Parent("Asim", 45, g.income, 1, 5);
		Children c = new Children("Abhishek", 22, p.assets, 0, 0);
		g.print();
		System.out.print("-------------------------------------------------\n");

		p.print_parent();
		System.out.print("-------------------------------------------------\n");
		

		c.print_child();
		System.out.print("-------------------------------------------------\n");
	}

}
