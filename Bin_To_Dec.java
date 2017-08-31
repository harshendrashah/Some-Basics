import java.util.*;

public class Bin_To_Dec {
	public void convertDecimal(int num){
		int decimal=0;
		int power=0;
		while(true){
			if(num==0)
				break;
			else{
				int m = num%10;
				decimal += (int) (m*Math.pow(2,power));
				num=num/10;
				power++;
			}
		}
		System.out.print(decimal);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bin_To_Dec obj=new Bin_To_Dec();
		System.out.println("Enter a binary number : ");
		int k=sc.nextInt();
		System.out.println("Decimal representation : ");
		obj.convertDecimal(k);
	}

}
