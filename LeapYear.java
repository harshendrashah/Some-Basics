import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Year : ");
		int year=sc.nextInt();
		if(year%4==0)
			System.out.println(year+" is a leap year.");
		else 
			System.out.println(year+" is not a leap year.");
	}

}
