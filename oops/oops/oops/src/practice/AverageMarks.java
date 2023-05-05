package practice;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the chareacter");


char ch=sc.next().charAt(1);
int avg;
System.out.println("enter the m1:-");
int m1=sc.nextInt();
System.out.println("enter the m2:-");
int m2=sc.nextInt();
System.out.println("enter the m3:-");
int m3=sc.nextInt();
avg=(m1+m2+m3)/3;
System.out.println(ch);
System.out.println(avg);

	}

}
