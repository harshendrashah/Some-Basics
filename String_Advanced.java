import java.util.Scanner;

public class String_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a string");
		String s= sc.nextLine();
		System.out.println("1)	Find the length of the string.");
		System.out.println("2)	Finding the character at some position.");
		System.out.println("3)	Concatenate the string.");
		System.out.println("4)	Check if the string equals “cat”");
		System.out.println("5)	Replace any character of the string.");
		System.out.println("6)	Convert all the characters to Upper case");
		System.out.println("7)	Convert all characters to lower case");
		System.out.println("8)	Trim the string.");
		System.out.println("9)  Exit.");
		System.out.println("");
		
		System.out.println("Enter your Choice : ");
		int n=sc.nextInt();
		while(n!=9){
			switch(n){
			
			case 1 :
				System.out.println("Length of the String is : "+s.length());
				break;
			case 2 :
				System.out.println("Enter any position between 0 to "+(s.length()-1)+" :");
				int m=sc.nextInt();
				System.out.println("Character at "+m+"th position is "+s.charAt(m)+".");
				break;
			case 3 :
				System.out.println("Enter the String you want to concate : ");
				String t=sc.nextLine();
				String str=s+t;
				System.out.println("Concatinated String : "+str);
				break;
			case 4 :
				String p = "cat";
				if(s==p)
					System.out.println("String is same as cat.");
				else
					System.out.println("String is not equal to CAT.");
				break;
			case 5 :
				System.out.println("Enter the position at which u want to replace the character :");
				int o=sc.nextInt();
				System.out.println("ENter the Character : ");
				String c=sc.next();
				StringBuilder newS=new StringBuilder(s);
				newS.setCharAt(o,c.charAt(0));
				System.out.println("New String : "+newS);
				break;
			case 6 :
				System.out.println(s.toUpperCase());
				break;
			case 7 : 
				System.out.println(s.toLowerCase());
				break;
			case 8 :
				String d=null;
				System.out.println("Enter the positions oto trim the String ");
				int i=sc.nextInt();
				int j=sc.nextInt();
				d=s.substring(i, j);
				System.out.println("New String : "+d);
				break;
		
			}
			n=sc.nextInt();
		}
	}
}
