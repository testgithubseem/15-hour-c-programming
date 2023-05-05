package loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a");
int a=sc.nextInt();
System.out.println("enter the value of b");


int b=sc.nextInt();
int result=1;
for(int i=0;i<b;i++) {
	result=result*a;

}
System.out.print(result);
	}

}
