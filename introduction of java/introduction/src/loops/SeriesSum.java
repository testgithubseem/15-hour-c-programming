package loops;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		//System.out.println("enter the number");
		float result=0;
		for(float i=1;i<=n;i++)
		{
			//float result=0;
			result=result+1/i;
		}
		System.out.println(result);

	}

}
