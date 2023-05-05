package practice;
import java.util.Scanner;
public class Table1To10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int j=1;j<=n;j++) {
		int tableOf=j;
	
	
	
	for(int i=1;i<=n;i++)
	{
		System.out.print(tableOf*i+"  ");
	}
	System.out.println();
	

	}

}
}
