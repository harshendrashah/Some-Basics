import java.util.Scanner;

public class String_Basics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String :");
		String s=sc.nextLine();
		System.out.println("String entered :"+s);
		int size=s.length();
		System.out.print("Reversed String : ");
		for(int i=size-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.print(".");
	}

}
