package loops;
import java.util.Scanner;
public class SeriesSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		float result=1;
		for(float i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				result=result-1/i;
				
			}
			else
			{
				result=result+1/i;
			}	
			}
		System.out.println(result);
		}

	}



