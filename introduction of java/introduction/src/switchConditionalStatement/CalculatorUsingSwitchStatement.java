package switchConditionalStatement;
import java.util.Scanner;

public class CalculatorUsingSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the operation");
		sc.nextLine();
		int operation=sc.nextLine().charAt(0);
		int result=0;
		switch(operation)
		{
		
		
		
		
		
		case '+' :
			result=a+b;
			break;
		
			
		case '-' :
		result=a-b;
		break;
		case '*' :
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
			default:
				System.out.println("invalid");}
		System.out.println("the result is"+result);
		
			
		
		
		

	}

}
