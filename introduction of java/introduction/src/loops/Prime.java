package loops;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
if(n%i==0)
{
	isprime=false;
	break;
}
if(n<2)
{
	isprime=false;
}
	
}
		System.out.println("is prime"  +isprime);
	}

}
