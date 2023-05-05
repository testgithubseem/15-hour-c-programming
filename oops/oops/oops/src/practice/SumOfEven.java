package practice;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
int sum=0;
for(int i=2;i<=n;i+=2)
{
	
	
	sum=sum+i;
	
	}
	System.out.println(sum);
}

	}



