package ex5;

import java.util.Scanner;

public class ex5 {
	private static Scanner in;

	public static void main(String args[])
	{
	in = new Scanner(System.in);
	System.out.print("Enter first num:");
	int n1=in.nextInt();
	System.out.print("Enter second num:");
	int n2=in.nextInt();
	
	System.out.println(n1+"x"+n2+"="+n1*n2);

}
}
