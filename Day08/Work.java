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

class Work_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int today = input.nextInt();

		int nextday = (day + today) % 7;
		switch(nextday)
		{
			case 0: System.out.println("Today is Sunday and the future day is Sunday");break;
			case 1: System.out.println("Today is Sunday and the future day is Monday");break;
			case 2: System.out.println("Today is Sunday and the future day is Tuesday");break;
			case 3: System.out.println("Today is Sunday and the future day is Wednesday");break;
			case 4: System.out.println("Today is Sunday and the future day is Thursday");break;
			case 5: System.out.println("Today is Sunday and the future day is Friday");break;
			case 6: System.out.println("Today is Sunday and the future day is Saturday");
		}

	}
}

class Work_6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		double height = feet * 12 + inches;
		double weightInkilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInkilograms / 
			(heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}

class Work_7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for examle 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount =  remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of");

		if (numberOfOneDollars != 0)
		{
			if (numberOfOneDollars % 2 == 0)
				System.out.println("    " + numberOfOneDollars + " doollars ");
			else
				System.out.println("    " + numberOfOneDollars + " doollar ");
		}
		if (numberOfQuarters != 0)
		{
			if (numberOfQuarters % 2 == 0)
				System.out.println("    " + numberOfQuarters + " quarters ");
			else
				System.out.println("    " + numberOfQuarters + " quarter ");
		}
		if (numberOfDimes != 0)
		{
			if (numberOfDimes % 2 == 0)
				System.out.println("    " + numberOfDimes + " dimes ");
			else
				System.out.println("    " + numberOfDimes + " dime ");
		}
		if (numberOfNickels != 0)
		{
			if (numberOfNickels % 2 == 0)
				System.out.println("    " + numberOfNickels + " nickels ");
			else
				System.out.println("    " + numberOfNickels + " nickel ");
		}
		if (numberOfPennies != 0)
		{
			if (numberOfPennies % 2 == 0)
				System.out.println("    " + numberOfPennies + " pennies ");
			else
				System.out.println("    " + numberOfPennies + " pennie ");		
		}

	}
}
class Work_8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a b c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a < b && a < c)
		{
			System.out.print(a + " ");
			if (b < c)
			{
				System.out.print(b + " ");
				System.out.print(c);
			}
			else
			{
				System.out.print(c + " ");
				System.out.print(b);
			}
		}
		else if (b < a && b < c)
		{
			System.out.print(b + " ");
			if (a < c)
			{
				System.out.print(a + " ");
				System.out.print(c);
			}
			else
			{
				System.out.print(c + " ");
				System.out.print(a);
			}
		}
		else
		{
			System.out.print(c + " ");
			if (a < b)
			{
				System.out.print(a + " ");
				System.out.print(b);
			}
			else
			{
				System.out.print(b + " ");
				System.out.print(a);
			}
		}
	}
}

class Work_9
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int digits = input.nextInt();

		int d1 = digits / 100000000;
		digits = digits % 100000000;

		int d2 = digits / 10000000;
		digits = digits % 10000000;

		int d3 = digits / 1000000;
		digits = digits % 1000000;

		int d4 = digits / 100000;
		digits = digits % 100000;

		int d5 = digits / 10000;
		digits = digits % 10000;

		int d6 = digits / 1000;
		digits = digits % 1000;

		int d7 = digits / 100;
		digits = digits % 100;

		int d8 = digits / 10;
		digits = digits % 10;

		int d9 = digits;

		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9 ) % 11;

		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "x");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);


	}
}

class Work_10
{
	public static void main(String[] args)
	{
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);

		if (number1 < number2)
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 +" + " + number2 + " ? ");
		int answer = input.nextInt();

		if (number1 + number2 == answer)
			System.out.println("Your answer is wrong.");
		else
		{
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 +
				" should be " + (number1 + number2));
		}
	}
}

class Work_11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month and Year :");

		int month = input.nextInt();
		int year = input.nextInt();

		if (month == 2)
		{
			if ((year % 4==0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println( month + " month " + year + " Year has 29 days");
			else
				System.out.println( month + " month " + year + " Year has 28 days");
		}
		else
		{
			if (month == 4 || month == 6 || month == 9 || month == 11)
				System.out.println( month + " month " + year + " Year has 30 days");
			else
				System.out.println( month + " month " + year + " Year has 31 days");
		}
	}
}

class Work_12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();

		int number_1 = number / 100;
		number = number % 100;
		int number_2 = number / 10;
		number = number % 10;
		int number_3 = number;
		
		if (number_1 == number_3)
			System.out.println(number_1 * 100 + number_2 * 10 + number_3 + " is a palindrome");
		else
			System.out.println(number_1 * 100 + number_2 * 10 + number_3 + " is not a palindrome");
	}
}

class Work_14
{
	public static void main(String[] args)
	{
		int num = (int)(Math.random() * 2);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter You guessed positive and negative 0 is positive and 1 is negative: ");
		int guess = input.nextInt();

		if (num == guess)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}

class Work_15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int lottery = (int)(Math.random() * (100 - 1000) + 1000);
		System.out.println(lottery);
		System.out.print("Enter yo7ur lottery pick (two digites): ");
		int guess = input.nextInt();

		int newlottery = lottery;
		int newguess =  guess;

		int lottery1 = lottery / 100;
		lottery = lottery % 100;
		int lottery2 = lottery / 10;
		int lottery3 = lottery % 10;

		int guessDigit1 = guess / 100;
		guess = guess % 100;
		int guessDigit2 = guess / 10;
		int guessDigit3 = guess % 10;

		if (newguess == newlottery)
			System.out.println("Exact match you win $10,000");
		else if (lottery1 == guessDigit2 && lottery2 == guessDigit1 && lottery3 == guessDigit3
			  || lottery1 == guessDigit3 && lottery3 == guessDigit1 && lottery2 == guessDigit2
			  || lottery2 == guessDigit3 && lottery3 == guessDigit2 && lottery1 == guessDigit1
			  || lottery1 == guessDigit2 && lottery2 == guessDigit3 && lottery3 == guessDigit1
			  || lottery1 == guessDigit3 && lottery2 == guessDigit1 && lottery3 == guessDigit2)
			System.out.println("Exact match you win $3,000");
		else if (lottery1 == guessDigit1
			  || lottery1 == guessDigit2
			  || lottery1 == guessDigit3
			  || lottery2 == guessDigit1
			  || lottery2 == guessDigit2
			  || lottery2 == guessDigit3
			  || lottery3 == guessDigit1
			  || lottery3 == guessDigit2
			  || lottery3 == guessDigit3)
			System.out.println("Exact match you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}

class Work_16
{
	public static void main(String[] args)
	{
		int x = (int)(Math.random() * 100);
		int y = (int)(Math.random() * 200);
		System.out.println("(x,y) x: " + x + "  y : " + y);
	}
}

class Work_17
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int box = (int)(Math.random() * 3);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int guess = input.nextInt();

		switch (guess)
		{
			case 0: 
				if (box == 0)
					System.out.println("The computer is scissor. You are scissor too. It is a draw");
				else if (box == 1)
					System.out.println("The computer is rock You are scissor . You lose");
				else
					System.out.println("The computer is paper You are scissor . You win");
				break;
			case 1:
				if (box == 1)
					System.out.println("The computer is rock. You are rock too. It is a draw");
				else if (box == 2)
					System.out.println("The computer is paper. You are rock. You lose");
				else
					System.out.println("The computer is scissor. You are rock. You win");
				break;
			case 2:
				if (box == 2)
					System.out.println("The computer is paper. You are paper too. It is a draw");
				else if (box == 0)
					System.out.println("The computer is scissor. You are paper . You lose");
				else
					System.out.println("The computer is rock. You are paper . You win");
		}
	}
}

class Work_18
{
	public static void main(String[] args)
	{


	Scanner input = new Scanner(System.in);

	System.out.print("w: ");
	double w = input.nextDouble();

	if (w <= 1)
		System.out.println(3.5);
	else if (w <= 3)
		System.out.println(5.5);
	else if (w <= 10)
		System.out.println(8.5);
	else if (w <= 20)
		System.out.println(10.5);
	else
		System.out.println("the package cannot be shiped");
	}

}

class Work_19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a < b + c && b < a + c && c < a + b)
			System.out.println(a + b + c);
		else
			System.out.println("error");
	}
}

class Work_20
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58.F and 41.F: ");
		double temperature = input.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double sped = input.nextDouble();
		if (temperature >= -58 && temperature <=41 && sped >= 2)
		{
			double wind = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(sped, 0.16) + 0.4275 * temperature * Math.pow(sped, 0.16);
			System.out.println("The wind chill index is " + wind);
		}
		else
			System.out.println("error");
		
	}
}


class Work_21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year:(e.g, 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		int m = 0;
		int k = (int)year % 100;
		int j = (int)(Math.abs(year / 100));
		int q = day;
		if (month == 1|| month == 2)
		{
			if (month==1)
				m = 13;
			else
				m = 14;
		}
		int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		switch (h)
		{
			case 0: System.out.println("Day of the week is Saturday");break;
			case 1: System.out.println("Day of the week is Sunday");break;
			case 2: System.out.println("Day of the week is Monday");break;
			case 3: System.out.println("Day of the week is Tuesday");break;
			case 4: System.out.println("Day of the week is Wednesday");break;
			case 5: System.out.println("Day of the week is Thursday");break;
			case 6: System.out.println("Day of the week is Friday");
		}
	}
}

class Work_22
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextInt();
		double y = input.nextInt();
		double spacing = (Math.pow(Math.pow(0 - x,2) + Math.pow(0 - y, 2), 0.5));
		if (spacing <= 10)
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
	}
}

class Work_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextInt();
		double y = input.nextInt();
		if (x <= 10/2 && y < 5/2)
			System.out.println("Point (" + x + ", " + y + ") is in the rectange");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the rectange");
	}
}
class Work_24
{
	public static void main(String[] args)
	{
		String brand = "";

		int b = (int)(Math.random() * (1-14) + 14);
		int c = (int)(Math.random() * 3);
		if (b == 1)
			brand = "Ace";
		else if(b == 11)
			brand = "Jack";
		else if (b == 12)
			brand = "Queen";
		else if (b == 13)
			brand = "king";
		else
			brand = b+"";

		switch(c)
		{
			case 0:System.out.println("The card you picked is " + brand + " of Clubs");break;
			case 1:System.out.println("The card you picked is " + brand + " of Diamonds");break;
			case 2:System.out.println("The card you picked is " + brand + " of Hearts");break;
			case 3:System.out.println("The card you picked is " + brand + " of Spades");
		}

	}
}

class Work_25
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double a = y1 - y2;
		double b =  -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3 - x4);
		double z = a * d - b * c;
		if (z != 0)
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("The intersecting point is at (" + x +" , " + y +")");
		}
		else
		{
			System.out.println("The two lines are parallel");
		}

	}
}

class Work_26
{
	public static void main(String[] args)
	{
		
	}
}