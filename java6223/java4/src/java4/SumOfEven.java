package java4;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
	//System.out.println(i);

	if(i%2==0)
	{
		sum=sum+i;
	}
}
	System.out.print(sum);
}
}
