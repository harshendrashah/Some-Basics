import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int s=0;
		while(n>9){
			int m=n%10;
			n=n/10;
			s=s+m;
		}
		s=s+n;
		System.out.println("The sum of the digis is "+s+".");
	}

}
