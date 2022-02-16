package jewelDiamond;

import employeeDetails.GroceryThings;
import employeeDetails.EmployeeDet;
public class DiamondPlatinum {
	
	public void Diamond(){
		System.out.println ("Diamond");	
		}
	public void Platinum(){
		System.out.println ("Platinum");	
		}
	public void Emarald(){
		System.out.println ("Emarald");	
		}
	public static void main(String[] args){
		DiamondPlatinum d= new DiamondPlatinum();
		d.Diamond();
		d.Platinum();
		d.Emarald();
		GroceryThings s= new GroceryThings();
		s.Dhaal();
		s.sugar();
		s.fruit();
		EmployeeDet v= new EmployeeDet();
		v.bike();
		v.car();
		v.scooter();
		
	}
}
