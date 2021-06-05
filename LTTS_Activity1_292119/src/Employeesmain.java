/**
 * @author Velampudi Rohit
 * @SFID 292119
 * @Question 5
 * @Activity 1
 */
import java.util.*;

class Employees{
	private String name; 
	private String address;
	private String mobile;
	
	Scanner sc=new Scanner(System.in);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	void DataInput() {
		System.out.print("Enter name: ");  
		setName(sc.nextLine());
		System.out.print("Enter address: ");  
		setAddress(sc.nextLine());
		int a=0;
		while(a==0) {
			System.out.print("Enter mobile: ");
			setMobile(sc.next());
			if(mobile.length()==10) {
				a=1;
			}
			else
			{
				System.out.println("Enter valid number!");
			}	
		}
		
	}
	
	void DataOutput() {
		int option=0;
		System.out.println("Employee details");
		System.out.println("Name:"+getName());
		System.out.println("Address:"+getAddress());
		System.out.println("Mobile:"+getMobile());
		System.out.println("Verify and update details:");
		do {
			System.out.println("\nMenu\n");
			System.out.println("1.Update Employee name");
			System.out.println("2.Update Employee Address");
			System.out.println("3.Update Employee mobile");
			System.out.println("4.All information correct/Exit"); 
			System.out.println("Enter the option:");
			option=sc.nextInt();
			System.out.println("\n");
			switch(option) {
			case 1:
				System.out.println("Current Employee name is:"+getName());
				System.out.println("Enter the name:");
				setName(sc.next());
				break;
			case 2:
				System.out.println("Current Employee address is:"+getAddress());
				System.out.println("Enter the address:");
				setAddress(sc.next());
				break;
			case 3:
				System.out.println("Current Employee mobile is:"+getMobile());
				System.out.println("Enter the mobile:");
				setMobile(sc.next());
				break;
			case 4:
				System.out.println("Complete Employee details");
				System.out.println("Name:"+getName());
				System.out.println("Address:"+getAddress());
				System.out.println("Mobile:"+getMobile());
				break;
			default:
				System.out.println("Invalid Option...please enter again.");
				break;
				
			}
			
		}while(option!=4);
		sc.close();
		
	}
}


public class Employeesmain {

	public static void main(String[] args) {
		Employees e=new Employees();
		e.DataInput();
		e.DataOutput();

	}

}
