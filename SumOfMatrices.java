import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Info of first matrix : ");
		System.out.println("Enter the number of rows : ");
		int m= sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int n= sc.nextInt();
		int matrix1[][]=new int[m][n];
		System.out.println("Enter the elements of matrix : ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Info of second matrix : ");
		System.out.println("Enter the number of rows : ");
		int x= sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int y= sc.nextInt();
		int matrix2[][]=new int[m][n];
		System.out.println("Enter the elements of matrix : ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix2[i][j]=sc.nextInt();
			}
		}
		if(m==x && n==y){
			int matrix[][]=new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
			System.out.println("Sum of the given matrices : ");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Sum not possible because order of the matrices don't match");
	}
}
