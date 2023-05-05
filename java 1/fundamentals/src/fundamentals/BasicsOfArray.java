package fundamentals;

import java.util.Scanner;

public class BasicsOfArray {

	public static int sum(int[] input){
        int n=input.length;
        int i,s=0;
        for(i=0;i<n;i++)
            s=s+input[i];
        return s;


	}
	public static void main(String ar[])
	{
		int []arr=sum();
		
	}
	
}
