import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String :");
		String s=sc.nextLine();
		int n=0;
		if(s.length()<10)
			n=1;
		else if(s.length()<=25 && s.length()>=10)
			n=2;
		else if(s.length()>25)
			n=3;
		
		switch(n) {
			case 1 : if(s.length()<10)
				System.out.println("small String.");
			case 2 : if(s.length()<=25 && s.length()>=10)
				System.out.println("medium String.");
			case 3 : if(s.length()>25)
				System.out.println("large String.");
		}
			
	}

}
