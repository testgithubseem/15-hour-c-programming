package practice;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	System.out.println(n*i);
}
	}

}
