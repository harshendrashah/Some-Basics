import java.util.Scanner;

public class TransposeOfAMatrix {
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of rows : ");
			int m= sc.nextInt();
			System.out.println("Enter the number of columns : ");
			int n= sc.nextInt();
			int matrix[][]=new int[m][n];
			System.out.println("Enter the elements of matrix : ");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=sc.nextInt();
				}
			}
			System.out.println("Transposed Matrix :");
			
			for(int j=0;j<n;j++){
				for(int i=0;i<m;i++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
			
		}
}
