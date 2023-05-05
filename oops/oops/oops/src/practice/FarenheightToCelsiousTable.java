package practice;
import java.util.Scanner;
public class FarenheightToCelsiousTable {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the s value:-");
int s=sc.nextInt();
System.out.println("enter the e value:-");
int e=sc.nextInt();
System.out.println("enter the w value:-");
int w=sc.nextInt();
int fah;
if(s<=w)
{
	fah=((5*(s-39)/9));
	System.out.println(s+ "  "+fah);
	
}
s+=w;

	}

}
