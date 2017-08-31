import java.util.Scanner;

public class EvenOdd_Array {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even numbers : ");
		System.out.print("{ ");
		for(int i=0;i<n-1;i++){
			if(arr[i]%2==0)
			 System.out.print(arr[i]+" , ");
		}
		if(arr[n-1]%2==0)
			System.out.print(arr[n-1]+" ");
		System.out.println("}");
		
		System.out.println("Odd numbers :  ");
		System.out.print("{ ");
		for(int i=0;i<n-1;i++){
			if(arr[i]%2!=0)
			 System.out.print(arr[i]+" , ");
		}
		if(arr[n-1]%2!=0)
			System.out.print(arr[n-1]+" ");
		System.out.println("}");
	}
}
