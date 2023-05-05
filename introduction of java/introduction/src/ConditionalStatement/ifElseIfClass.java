package ConditionalStatement;

public class ifElseIfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		if(num<=10)
		{
			System.out.println("number is greater than 20");
		}
		else if(num>10 && num<=20)
		{
		System.out.println("numbe is greater than 10 and less than equal to 20");

	}
		else if(num>20&&num<=30)
		{
			System.out.println("number is grater than 20 and less than equal to 30");
		}
		else
		{
			System.out.println("number is grater than 30");
		}
		
	}
}


