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
class Work_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();

		gratuity = subtotal * (gratuity / 100);
		double total = gratuity + subtotal;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}

class Work_6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000:");
		int number = input.nextInt();
		int number_1 = number % 10;
		number = number / 10;

		int number_2 = number % 10;
		number = number/ 10;

		int number_3 = number % 10;

		int sub = number_1 + number_2 + number_3;

		System.out.println("The sum of the digites is " + sub);
	}
}

class Work_7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes:");
		int minutes = input.nextInt();
		System.out.print(minutes);
		int approximately = minutes / (365 * 24 * 60);
		minutes = minutes % (365 * 24 * 60);

		int day = minutes / (24 * 60);

		System.out.println(" minutes is approximately " + approximately + " years and " + day + " days");
	}
}

class Work_8
{
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		int Gmt = input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;


		long totalHours = totalMinutes / 60;
		totalHours  = totalHours + Gmt;
		long currentHour = totalHours % 24;
		System.out.println("The current time is " + currentHour + " : " + currentMinute + " : " + currentSecond);
	}
}

class Work_9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter v0, v1, and t:");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double a = (v1 - v0) / t;

		System.out.print("The average acceleration is" + (int)(a * 10000)/10000.0);
	}
}

class Work_10
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amout of water in kilograms: ");
		double weight = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initial = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double fin = input.nextDouble();

		double energy = weight * (fin - initial) * 4184;

		System.out.println("The energy needed is " + energy);
	}

}

class Work_11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		int born =  (365* 24 * 60 * 60 * years) / 7;
		int death = (365* 24 * 60 * 60 * years) / 13;
		int move = (365 * 24 * 60 * 60 * years) / 45;

		int population = 312032486 - death + born + move;

		System.out.println("The population in " + years + " years is " + population);
	}
}

class Work_12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		double airplane = (speed * speed) / (2 * acceleration);

		System.out.println("The minmum runway length for this airplane is " + airplane);

	}
}

class Work_13
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();

		amount = amount * (1 + 0.00417);
		amount = (100 + amount) * (1 + 0.00417);
		amount = (100 + amount) * (1 + 0.00417);
		amount = (100 + amount) * (1 + 0.00417);
		amount = (100 + amount) * (1 + 0.00417);
		amount = (100 + amount) * (1 + 0.00417);

		System.out.println("After the six month, the account value is $" + amount);
	}
}

class Work_14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

		System.out.println("BMI is " + bmi);
	}
}

class Work_15
{
	public static void main(String[] args)
	{


	Scanner input = new Scanner(System.in);

	System.out.print("Enter x1 and y1:");
	double x1 = input.nextDouble();
	double y1 =	input.nextDouble();

	System.out.print("Enter x2 and y2:");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();

	double points = Math.pow(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2),0.5);

	System.out.println("The distance between the two pouints is " + points);

	}
}


class Work_16
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		double hexagon = 3 * Math.pow(3, 0.5) / 2 * (side * side);

		System.out.println("The area of the hexagon is " + hexagon); 
	}
}

class Work_17
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58.F and 41.F: ");
		double temperature = input.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double sped = input.nextDouble();

		double wind = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(sped, 0.16) + 0.4275 * temperature * Math.pow(sped, 0.16);

		System.out.println("The wind chill index is " + wind);
	}
}

class Work_18
{
	public static void main(String[] args)
	{
		System.out.println("a   b   pow(a, b)");
		System.out.println("1   2   " + Math.pow(1,2));
		System.out.println("2   3   " + Math.pow(2,3));
		System.out.println("3   4   " + Math.pow(3,4));
		System.out.println("4   5   " + Math.pow(4,5));
		System.out.println("5   6   " + Math.pow(5,6));
	}
}

class Work_19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three for a triangle: ");
		double x1 = input.nextDouble();//a = x1,y1 x2 y2
		double y1 = input.nextDouble();//

		double x2 = input.nextDouble();//b = x2,y2 x3 y3
		double y2 = input.nextDouble();//
		
		double x3 = input.nextDouble();//c = x3,y3 x1 y1
		double y3 = input.nextDouble();//

		double a = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2), 0.5);
		double b = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2,2), 0.5);
		double c = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3,2), 0.5);

		double s = (a + b + c)/2;

		double area = Math.pow(s * (s - a) * (s - b) * (s - c),0.5);

		System.out.println("The area of the triangle is " + area);
	}
}

class Work_20
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
		Double balance = input.nextDouble();
		Double interest = input.nextDouble();

		Double interests = balance * (interest/12) / 100;

		System.out.println("The interest is " + interests);
	}
}

class Work_21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		Double amount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		Double percentage = input.nextDouble();

		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		Double value = amount * Math.pow(1 + (percentage / 1200), years * 12);

		System.out.println("Accumulated value is $" + value); 

	}
}

class Work_22
{
	public static void main(String[] args)
	{
				Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for examle 11.56: ");
		int num = input.nextInt();
		
		int dollars =  num / 100;//11
		int pennies = num % 100;//56

		double nickels = pennies/100.0;

		double data = dollars + nickels;

		System.out.println(data);

		
	}
}

class Work_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();

		double driving = distance / miles * price;

		System.out.println("The cost of driving is $" + driving);

	}
}