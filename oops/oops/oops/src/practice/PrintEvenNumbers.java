package practice;
import java.util.Scanner;
public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	if(i%2==1)
	{
		System.out.println(i);
	}
}

}
}

