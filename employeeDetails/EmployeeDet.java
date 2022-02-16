package employeeDetails;

public class EmployeeDet {
	
	public void bike(){
		System.out.println ("pulsar");	
		}
	public void car(){
		System.out.println ("honda city");	
		}
	public void scooter(){
		System.out.println ("XL");	
		}
	public static void main(String[] args) {
		EmployeeDet v= new EmployeeDet();
		v.bike();
		v.car();
		v.scooter();
		GroceryThings s= new GroceryThings();
		s.Dhaal();
		s.sugar();
		s.fruit();
	}
	
}

