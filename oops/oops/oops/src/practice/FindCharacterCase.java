package practice;
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the charater:-");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<= 'Z')
{
	System.out.println("print 1");
}
else if(ch>='a' && ch<='z')
{
	System.out.println("print 0");
}
else
{
	System.out.println("print -1");
}
	}

}
