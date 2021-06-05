
/**
 * @author Velampudi Rohit
 * @SFID 292119
 *
 */
import java.util.Scanner;
class Employee {
	private String name; 
	private String address;
	private String mobile;
	
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
		Scanner sc=new Scanner(System.in); //scanner class created
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
		sc.close();
		
	}
	
	void DataOutput()
	{
		System.out.println("Employee details");
		System.out.println("name: "+getName());  
		System.out.println("address: "+getAddress());   
		System.out.println("mobile: "+getMobile());  
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(); // object created
		e1.DataInput();
		e1.DataOutput();

	}

}