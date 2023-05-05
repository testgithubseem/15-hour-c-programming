package fundamentals;
import java.util.Scanner;
public class BasicsofConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a>b)
		{
			System.out.println("first number is greater");
		}
		else
		{
			System.out.println("second number is greater" );
		}
		System.out.println("outside the ifelse");
		
			
	}

}
