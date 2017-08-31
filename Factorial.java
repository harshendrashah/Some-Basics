import java.util.Scanner;

public class Factorial {
	public static void fact(int n){
		int m=1;
		int o=n;
		for(int i=n;i>2;i=i-2){
			m=(i-2)*(i-1);
			o=m*o;
		}
		System.out.print(n+"! = "+o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n=sc.nextInt();
		if(n==0)
			System.out.println("0! = 1");
		else
		 fact(n);
		}

}
