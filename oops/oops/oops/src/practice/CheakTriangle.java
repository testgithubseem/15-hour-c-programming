package practice;
import java.util.Scanner;
public class CheakTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of c");
		int c=sc.nextInt();
		if(a==b && b==c)
		{
			System.out.println("traingle is equilateral");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("traingle is isoscales");
		}
		else
		{
			System.out.println("scalene triangle");
		}

	}

}
