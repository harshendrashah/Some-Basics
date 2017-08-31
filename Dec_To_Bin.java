import java.util.Scanner;

public class Dec_To_Bin {
	public static void convertBinary(int num){
		int binary[]=new int[25];
		int index=0;
		while(num>0){
			binary[index++]=num%2;
			num=num/2;
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Dec_To_Bin obj=new Dec_To_Bin();
		System.out.println("Enter a decimal number : ");
		int n=sc.nextInt();
		System.out.println("Binary representation : ");
		obj.convertBinary(n);
		
	}

}
