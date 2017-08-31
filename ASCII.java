import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		String c=sc.nextLine();
		int d=c.charAt(0);
		System.out.printf("ASCII code of %c is %d.",c.charAt(0),d);
	}

}
