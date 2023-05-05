package ConditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=5,c=100;
		int result=0;
		//Nesting inside the ternary operator
		//result=a>b?a>c?a:c:b>c?b:c;
		if(a>b)
		{
			if(a>c)
			{
				result=a;
			}
			else
			{
				result=c;
				
				
			}
		}
			else
			{
				if(b>c)
				{
					result=b;
				}
				else
				{
					result =c;
				}
			}
		
		System.out.println("largest of the three numbers    " + result);

	}

}
