import java.util.Scanner;
import java.io.*;

public class Comparision {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int x=sc.nextInt();
		System.out.println("Enter 2nd nuber : ");
		int y=sc.nextInt();
		if(x<y)
			System.out.println(y+" is greater than "+x);
		else if(x>y)
			System.out.println(x+" is greater than "+y);
		else
			System.out.println("Both are equal.");
	}

}
