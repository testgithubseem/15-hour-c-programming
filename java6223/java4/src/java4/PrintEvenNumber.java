package java4;
import java.util.Scanner;
public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is not even");
		}

	}

}
