package java4;
import java.util.Scanner;
public class AllFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println(n1+"  "+n2);
		for(int i=2;i<=n;++i)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
		}
		
