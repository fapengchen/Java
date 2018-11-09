import java.util.Scanner;
class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a degree in Celsius:");
		double Celsius = input.nextDouble();

		double Fahrenheit = (9.0 / 5) * Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit ");

	}
}

class Work_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * 3.1415926;
		double volume = area * length;

		System.out.println("The area is " + (int)(area * 10000)/10000.0);
		System.out.println("The volume is " + volume);
	}
}

class Work_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}
}

class Work_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * 0.454;
		System.out.println(pounds + " punds is " + kilograms + " kilograms");
	}
}