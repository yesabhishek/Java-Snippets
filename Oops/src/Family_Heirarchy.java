class GrandParent{
	
	String name;
	int age;
	long assets;
	int childrens;
	long income;
	
	GrandParent(long _income){
		
		assets = _income;
		income = _income;
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
	
	String pname;
	int page;
	int pchildrens;
	long pworth;
	long pincome;
	long passets;
	
	Parent(String x, int y, long i, int c, long income) 
	{
		super(income);
		pname = x;
		page = y;
		passets = i;
		pchildrens = c;
		pworth = i + income;
		
	}
	

	void print_parent() {
		
		System.out.println("Name: "+pname);
		System.out.println("Age: "+page);
		System.out.println("Income: "+passets);
		System.out.println("Total Worth: "+pworth);
		System.out.println("Childrens: "+pchildrens);
	
	}

}

class Children extends Parent{
	
	String cname;
	int cage;
	long cassets;
	int cchildrens;
	long ctotal_worth;
	
	

	void print_child() {
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Assets left: "+assets);
		System.out.println("Total Worth: "+total_worth);
		System.out.println("Childrens I have: "+childrens);
		
	}

}

public class Family_Heirarchy {

	public static void main(String[] args) {
		


		Parent g1 = new Parent("Asim", 45, 20, 1, 30);
		g1.print();
		System.out.print("-------------------------------------------------\n");

		g1.print_parent();
		System.out.print("-------------------------------------------------\n");
		
	}

}
