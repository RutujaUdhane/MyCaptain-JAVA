package myCapt8_package;
import java.util.Scanner;
public class MyCapt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick one : 1. Hi   2. Hey   3. Hello   ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("You said Hi");
		        break;
		case 2: System.out.println("You said Hello");
                break;
		case 3: System.out.println("You said Hey");
                break;
		default: System.out.println("Invalid choice.");        
		}
        sc.close();
	}

}
