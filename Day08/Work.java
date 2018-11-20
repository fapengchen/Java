import java.util.Scanner;

class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double z = b * b - 4 * a * c;

		if (z > 0)
		{
			double r1 = (-b + Math.pow(z,0.5)) / (2 * a);
			double r2 = (-b - Math.pow(z,0.5)) / (2 * a);

			System.out.println("THe equation has two roots " + (int)(r1 *1000000)/1000000.0 + " and " + (int)(r2 *1000000)/1000000.0);
		}
		else if (z == 0)
		{
			double r = (-b + Math.pow(z,0.5)) / (2 * a);
			System.out.println("THe equation has one root " + (int)(r *1000000)/1000000.0);
		}
		else
			System.out.println("The equation has no real roots");
	}
}

class Work_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 3 % 10);
		int number3 = (int)(System.currentTimeMillis() / 2 % 10);

		System.out.print("What is " + number1  + " + " + number2 + " + " + number3 + "?");
		int answer = input.nextInt();

		System.out.println(
			number1 + " + " + number2  + " = " + answer + " is " + 
			(number1 + number2 + number3 == answer));
	}
}

class Work_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double z = a * d - b * c;

		if (z != 0)
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
		else
			System.out.println("THe equation has no solution");
	}
}
class Work_4
{
	public static void main(String[] args)
	{
		int number = (int)(Math.random() * (1-13)+13);
		switch(number)
		{
			case 1:System.out.println("January");break;
			case 2:System.out.println("February");break;
			case 3:System.out.println("March");break;
			case 4:System.out.println("April");break;
			case 5:System.out.println("May");break;
			case 6:System.out.println("June");break;
			case 7:System.out.println("July");break;
			case 8:System.out.println("August");break;
			case 9:System.out.println("September");break;
			case 10:System.out.println("Octorber");break;
			case 11:System.out.println("November");break;
			case 12:System.out.println("December");
		}

	}
}