package switchConditionalStatement;

public class MultipleSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int review=2;
		switch(review)
		{
		case 1:
		case 2:
			System.out.println("bad review");
			break;
		case 3:
		System.out.println("Average");
		break;
		case 4:
		case 5:
			System.out.println("good review");
			break;
		}
	}

}







