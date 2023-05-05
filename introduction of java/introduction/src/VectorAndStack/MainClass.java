package VectorAndStack;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack();
		//stack.push(12);
		//stack.push(24);
		//stack.push(36);

	//	int popped1=stack.pop();
		//System.out.println(popped1);
		int peeked=stack.peek();
		System.out.println(peeked);
		//int popped2=stack.pop();
		//System.out.println(popped2);
		//int popped3=stack.pop();
		//System.out.println(popped3);
		stack.push(5);
		stack.push(4);
		stack. push(3);
		stack. push (2);
		stack. pop();
		stack. push(6);
		stack. push(8);
		stack. push(9);
		 stack.size(); //to print the size of stack

		

	}

}
