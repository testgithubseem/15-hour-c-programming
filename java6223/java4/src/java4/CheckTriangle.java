package java4;

public class CheckTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=10,c=10;
if(a==b&&b==c)
{
	System.out.println("equilateral triangle");
}
else if(a==b||b==c||c==a)
{
	System.out.println("isoscalen triangle");
}
else
{
	System.out.println("scalene triangle");
}
	}

}
