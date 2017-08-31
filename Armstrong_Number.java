import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int temp=n;
		int arr[]=new int[n];
		int j=0;
		while(temp>9){
			int i=temp%10;
			temp=temp/10;
			arr[j]=i;
			j++;
		}
		arr[j]=temp;
		int m=0;
		for(int k=0;k<=j;k++){
			m+=Math.pow(arr[k],3);
		}
		if(m==n){
			System.out.println(n+" is an armstrong number.");
		}
		else 
			System.out.println(n+" is not an armstrong number :");
	}

}
