package practice;
import java.util.Scanner;
public class MemberOfFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int firstNumber=0,secondNumber=1,thirdNumber=2;
while(thirdNumber>n)
{
	thirdNumber=firstNumber+secondNumber;//1
	firstNumber=secondNumber;//1
	secondNumber=thirdNumber;//0
}
if(thirdNumber==n)
{
System.out.println("member belong to the fibonacci");	
}
else
{
	System.out.println("member do not belong to fibonacci ");
}
	}
}
