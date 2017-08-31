import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int s=0;
		System.out.print("Reverse of the gven number is ");
		while(n>9){
			int m=n%10;
			n=n/10;
			System.out.print(m);
		}
		System.out.print(n+".");
		
	}

}
