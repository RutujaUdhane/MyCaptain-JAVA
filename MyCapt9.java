package myCapt9_package;
import java.util.Scanner;
public class MyCapt9 {
	int row,col;
	Scanner sc = new Scanner(System.in);
	int[][] Accept () {
		System.out.print("Enter the number of rows : ");
		this.row = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		this.col = sc.nextInt();	
		int[][] Arr = new int[this.row][this.col];
		System.out.println("Enter the elements of the matrix (row wise)");
		for(int i=0; i<this.row; i++) {
			for(int j=0;j<this.col;j++) {
				Arr[i][j]= sc.nextInt();
			}
		}
		return Arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		MyCapt9 a = new MyCapt9();
		MyCapt9 b = new MyCapt9();
		System.out.println("For the first matrix");
		int[][] A = a.Accept();
		System.out.println("For the second matrix");
		int[][] B = b.Accept();
		System.out.print("Enter your choice (1,2 or 3)\n1. Addition of the matrices\n2. Product of the matrices \n3. Both : ");
		int choice = s.nextInt();
		if(choice==1 || choice==3) {
			if(a.row==b.row && a.col==b.col) {
				int[][] Add = new int[a.row][a.col];
				System.out.println("The sum of the first and the second matrix is ");
				for(int i=0; i<a.row; i++) {
					for(int j=0;j<a.col;j++) {
						Add[i][j] = A[i][j]+B[i][j];
						System.out.print((Add[i][j]+"  "));
					}
					System.out.println();
				}
			}
			else {
				System.out.println("You cannot perform addition operation on these two matrices ");
				System.out.println("since the two matrices don't have equal number of rows and columns.");
			}
		}
		if(choice==2 || choice==3) {
			if(b.row==a.col) {
				System.out.println("The product of the first and the second matrix is ");
				int[][] Mul= new int[a.row][b.col];
				for(int i=0; i<a.row; i++) {
					for(int j=0; j<b.col; j++) {
						int Sum =0;
						for(int k=0; k<a.col; k++) {
							Sum = Sum+ A[i][k]*B[k][j];
						}
						Mul[i][j]= Sum;
						System.out.print(Mul[i][j]+ "  ");
					}
					System.out.println();
				}
			}
			else {
				System.out.println("You cannot perform multiplication opreation on these two matrices ");
				System.out.println("since the number of rows of the first matrix is not equal to the number of columns of the second.");
			}
		}
		if(choice!=1 && choice!=2 && choice!=3)
			System.out.println("Invalid choice. Please check your input.");
		s.close();
	}
}
