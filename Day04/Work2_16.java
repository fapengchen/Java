import java.util.Scanner;

public class Work2_16
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = ((-b + 
			Math.sqrt(b * b - 4 * a * c))/ (2 * a));


		System.out.println((int)(d * 100)/100);
	}
}