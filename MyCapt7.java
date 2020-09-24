package myCapt7_package;
import java.util.Scanner;
public class MyCapt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");
		int min = sc.nextInt();
		int years = min/(60*24*365);
		int days = (min%(60*24*365))/(60*24);
		System.out.println(min+" minutes is approximately "+years+" years and "+days+" days.");
        sc.close();
	}

}
