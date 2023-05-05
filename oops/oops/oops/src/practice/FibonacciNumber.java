package practice;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("enter the number");
int n=sc.nextInt();
int n1=0,  n2=1;
for(int i=1;i<=n;++i)
{
	int n3=n1+n2;
	n2=n1;
	n1=n3;

System.out.print(n1+"  ");

}
	}

}
