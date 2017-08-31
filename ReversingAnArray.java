import java.util.Scanner;

public class ReversingAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in your array : ");
		int n= sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("The reverse array of your array is as follows : ");
		System.out.print("{");
		for(int j=n-1;j>0;j--){
			System.out.print(array[j]+",");
		}
		System.out.print(array[0]);
		System.out.print("}");
	}

}
