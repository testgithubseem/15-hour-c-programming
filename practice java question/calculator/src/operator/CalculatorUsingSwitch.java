package operator;
import java.util.Scanner;
public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the firest number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		System.out.println("enter the  operation ");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		int result=0;
		switch(operation)
		{
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1+n2;
			break;
		case '/':
			result=n1/n2;
			break;
			default:
				
				System.out.println("invalid operation");
		}
		
		System.out.println("result is:-"  +result);

	}

}

