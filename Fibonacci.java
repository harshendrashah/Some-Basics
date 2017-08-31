import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonacci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
        Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
        int t2=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		arr[0]=t1;
		arr[1]=t2;
		for(int i=2;i<n;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.print(arr[n-1]);
		
    }
}