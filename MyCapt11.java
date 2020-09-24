package myCapt11_package;
import java.util.Scanner;

class Employee{
	Scanner sc = new Scanner(System.in);
	public static void sop(Object o) {System.out.print(o);}
	String Name, Address;
	int Year;
	public void Accept() {
		sop("Enter the name of the Employee : ");
		this.Name = sc.nextLine();
		sop("Enter the year of joining : ");
		this.Year = sc.nextInt();
		sc.nextLine();
		sop("Enter the address of the employee : ");
		this.Address = sc.nextLine();
		}
}


public class MyCapt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of Employee : ");
		int num = sc.nextInt();
		Employee[] Arr = new Employee[num];
		for(int i=0; i<num; i++) {
			Arr[i] = new Employee();
			System.out.println("\nFor employee number "+(i+1));
			Arr[i].Accept();	
		}
		
		System.out.printf("%10s %10s %20s","Name","Year","Address");
		System.out.println();
		for(int i=0; i<num; i++) {
			System.out.printf("%10s %10s %20s",Arr[i].Name,Arr[i].Year,Arr[i].Address);
			System.out.println();
		}		
		sc.close();
	}

}
