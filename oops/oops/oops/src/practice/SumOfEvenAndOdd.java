package practice;
import java.util.Scanner;
public class SumOfEvenAndOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the  number");
int n=sc.nextInt();
int digit=0;
int even=0,odd=0;
while(n>0)
{
	digit=n%10;
	n=n/10;
	if(digit%2!=0)
	
		odd=odd+digit;
	
	
		else
		
	even=even+digit;
}
	System.out.println(odd+"  "+even);


	

}
}
	
	
