package practice;
import java.util.Scanner;
public class CheakPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
if(n%2==1)
{
	System.out.println("prime number");
}
else
{
	System.out.println("not prime number");
}
	}
}

