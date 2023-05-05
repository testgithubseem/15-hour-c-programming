

package methods;

public class IntroductioMethod {

	public static void main(String[] args) {
		int firstNumber=80;
		int secondNumber=30;
		int result=maxOf(firstNumber,secondNumber);
	System.out.println(result);
	sayHi();
	sayHi();
	
	
	
	
	maxOf(5);
	//System.out.println(result2);
	
	
	
	}
	
	static int maxOf(int a,int b)
	{
		if(a>b)
		{
			return a;
	}
	else
	{
		return b;
	}

	}
	static void maxOf(float d) {
		
	}
	static void sayHi()
	{
		System.out.println("hi");
		System.out.println("hello");
	}

}
