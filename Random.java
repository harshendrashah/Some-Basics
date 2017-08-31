import java.util.*;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range of randomm number to be generated : ");
		int r=sc.nextInt();
		int x=(int) (Math.random()*(r+1));
		System.out.println(x);
	}

}
