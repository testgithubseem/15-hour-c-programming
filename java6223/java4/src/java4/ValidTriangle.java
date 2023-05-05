package java4;

public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=12,c=10;
		if(a+b>c)
		{
			System.out.println("it is a valid triangle");
		}
		else if(b+c>a)
		{
			System.out.println("it is a valid triangle");
		}
		else if(c+a>b)
		{
			System.out.println("it is a valid triangle");
		}
		else
		{
			System.out.println("it is a invalid triangle");
		}

	}

}
