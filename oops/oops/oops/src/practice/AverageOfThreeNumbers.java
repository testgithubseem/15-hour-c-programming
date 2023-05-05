package practice;
import java.util.Scanner;
public class AverageOfThreeNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the value of a:-");
	int a=sc.nextInt();
	System.out.println("enter the value of b:-");
	int b=sc.nextInt();
	System.out.println("enter the value of c:-");
	int c=sc.nextInt();
	int avg=(a+b+c)/3;
	System.out.println("avgerage is:-" +avg);

	}

}
