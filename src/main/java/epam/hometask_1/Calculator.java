package epam.hometask_1;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter number 1");
		a=sc.nextInt();
		System.out.println("Enter number 2");
		b=sc.nextInt();
		int choice;
		System.out.println("Enter your option from the menu");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 : add(a,b);break;
		case 2 : subtract(a,b);break;
		case 3 : multiplication(a,b);break;
		case 4 : division(a,b);break;
		default :System.out.println("Invalid Choice ! ");

		}


	}
	public static void add(int a, int b)
	{
	 System.out.println("Addition of number 1 : "+a+" and number 2 : "+b+" is "+a+b);	
	}
	public static void multiplication(int a, int b)
	{
	 System.out.println("Multiplication of number 1 : "+a+" and number 2 : "+b+" is "+a*b);	
	}
	public static void subtract(int a, int b)
	{
	 System.out.println("Subtraction of number 1 : "+a+" and number 2 : "+b+" is "+(a-b));	
	}
	public static void division(int a, int b)
	{
		if(b!=0)
	 System.out.println("Division of number 1 : "+a+" and number 2 : "+b+" is "+(a/b));	
		else
			System.out.println("Invalid number ! Denominator shouldn't be 0");
	}

}
