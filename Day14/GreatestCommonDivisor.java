
import java.util.Scanner;

public class GreatestCommonDivisor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("ENter second integer: ");
		int n2 = input.nextInt();

		int gcd = 1;
		for (int k = 2; k <= n2 && n1/2 >= k/2; k++)
		{
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		System.out.println("The greatest common divi for " + n1 +
			" and " + n2 + " is " + gcd);

	}
}