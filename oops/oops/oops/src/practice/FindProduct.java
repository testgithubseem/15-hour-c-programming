package practice;
import java.util.Scanner;
public class FindProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n; i++)
		{
			fact=i*n;
			
		
		System.out.println(fact);
		}
		
}
}

