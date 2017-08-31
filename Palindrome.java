import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		int n=s.length();
		int flag=0;
		if(n%2==1){
			for(int i=0;i<(n-1)/2;i++){
				if(s.charAt(i)==s.charAt(n-i-1)){
					flag=1;
				}
				else
					System.out.println("Given String is not a Palindrome.");
				break;
			}
			if(flag==1)
				System.out.println("Given String is a Palindrome.");
				
		}
		else{
			for(int i=0;i<(n)/2;i++){
				if(s.charAt(i)==s.charAt(n-i-1)){
					flag=1;
				}
				else
					System.out.println("Given String is not a Palindrome.");
				break;
			}
			if(flag==1)
				System.out.println("Given String is a Palindrome.");
		}
	}

}
