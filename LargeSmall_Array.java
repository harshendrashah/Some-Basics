import java.util.Scanner;

public class LargeSmall_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			else if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Largest element of the array is : "+max);
		System.out.println("Smallest element of the array is : "+min);
	}

}
