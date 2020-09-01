class Address{

	String city, state, country;
	
	Address(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Emp{
	
	int id;
	String name;
	Address address;
	
	Emp(int id, String name,  Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}


public class Aggregation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a = new Address("Mumbai", "MH", "INDIA");
		Emp e = new Emp(1234, "Raj", a);
		
		e.display();
	}
	

}
