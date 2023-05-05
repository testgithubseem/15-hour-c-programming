package operator;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=100;
		int result=0;
		result=a>b?a>c?a:c:b>c?b:c;
		System.out.println("largest number is:-" +result);

	}

}
