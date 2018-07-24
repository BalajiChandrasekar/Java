package ex6;

import java.util.Scanner;

public class ex6 {
	private static Scanner input;

	public static void main(String args[])
	{
		input = new Scanner(System.in);
        System.out.print("Input the first number:");
        int n1=input.nextInt();
        System.out.print("Input the second number:");
        int n2=input.nextInt();
        int sum= n1+n2;
        int prod= n1*n2;
        float diff;
        diff = (n1/n2);
        int sub= n1-n2;
        System.out.println("The Sum of 2 given nos. is:"+sum);
        System.out.println("The product of 2 given nos. is:"+prod);
        System.out.println("The Division of 2 given nos. is:"+diff);
System.out.println("The difference of 2 given nos. is:"+sub);
	}

}
