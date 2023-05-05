package java4;
import java.util.Scanner;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
if(n%2==0)
{
	System.out.println("not a prime number");
}
else
{
	System.out.println(" a prime number");
}
	}

}
