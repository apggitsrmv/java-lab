import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;

		
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
	}
}

