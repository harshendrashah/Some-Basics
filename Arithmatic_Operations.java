import java.util.Scanner;
public class Arithmatic_Operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		double x=sc.nextDouble();
		System.out.println("Enter 2nd nuber : ");
		double y=sc.nextDouble();
		System.out.println("Sum is : "+(x+y));
		System.out.println("Subtraction is : "+(x-y));
		System.out.println("Multiplication is : "+(x*y));
	    System.out.println("Division is : "+(x/y));
	}

}
