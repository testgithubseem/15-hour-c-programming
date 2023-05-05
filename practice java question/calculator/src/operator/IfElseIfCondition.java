package operator;

public class IfElseIfCondition {
	public static void main(String ar[])
	{
		int n=23;
		if(n<=10)
		{
			System.out.println("number is greater less than 10");
		}
		else if(n<10&&n<20)
		{
			System.out.println("number is a greater than 10 and less than 20");
		}
		else if(n>20&&n<30)
		{
			System.out.println("number is greater than 20 and less than 30");
			
		}
		else
		{
			System.out.println("number is greater than 30");
		}
	}

}
