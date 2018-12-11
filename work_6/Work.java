import java.util.Scanner;
class Work_1
{
	public static int getPentagonalNumber(int n)
	{
		return n * (3 * n - 1) / 2;
	}
}
class Work_1_test
{
	public static void main(String[] rags)
	{
		final int NUMBER = 100;
		final int CHARS_PER_LINE = 10;

		for (int i = 1;i <= NUMBER;i++)
		{
			int n = Work_1.getPentagonalNumber(i);
			if (i % CHARS_PER_LINE == 0)
				System.out.println(n);
			else
				System.out.print(n + " ");
		}
	}
}

class Work_2
{
	public static void main(String[] args)
	{
		System.out.println(sumDigits(234));
	}
	public static int sumDigits(long n)
	{
		int sum = 0;
		while (n > 0)
		{
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}

class Work_3
{
	public static int reverse(int number)
	{
		int sum = 0;
		while(number > 0)
		{
			
			if (number < 10)
				sum = (sum + number % 10);
			else
				sum = (sum + number % 10) * 10;

			number /= 10;
		}

		return sum;
	}
	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}
}

class Work_3_test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(Work_3.isPalindrome(number))
			System.out.println(number + " is a palindrome number");
		else
			System.out.println(number + " is not a palindrome");
	}
}
class  Work_4
{
	public static void reverse(int number)
	{
		int sum = 0;
		while(number > 0)
		{
			
			if (number < 10)
				sum = (sum + number % 10);
			else
				sum = (sum + number % 10) * 10;

			number /= 10;
		}

		
		System.out.println("The inverse of is " + sum);
	}
}

class Work_4_test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		Work_4.reverse(number);
	}
}


class Work_5
{
	public static void displaySortedNumbers(
		double number1,double number2,double number3)
	{
		System.out.println("The ascending order of display is " +
			min(number1,number2,number3) + " " + Math.max(Math.min(number1,number2),number3) +
			 " " + max(number1, number2, number3));
	}
	public static double max(double num1,double num2,double num3)
	{
		return Math.max(Math.max(num1,num2),num3);
	}
	public static double min(double num1,double num2,double num3)
	{
		return Math.min(Math.min(num1,num2),num3);
	}

}

class Work_5_test
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);

		System.out.print("Enter three Numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();

		Work_5.displaySortedNumbers(n1,n2,n3);
	}
}

class Work_6
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of printed lines: ");
		int n = input.nextInt();

		displayPlayPattern(n);
	}
	public static void displayPlayPattern(int n)
	{
		for (int i = 1;i <= n;i++)
		{
			for (int z = 1;z <= n - i;z++)
				System.out.print("  ");

			for (int j = i;j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}

	}
}

class Work_7
{
	public static void main(String[] args)
	{
		final int TOTAL_NUMBER_OF_YEARS  = 30;
		Scanner input = new Scanner(System.in);

		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double monthlyInterestRate = input.nextDouble();
		System.out.println("Years\tFure Value");
		for (int i = 1;i <= TOTAL_NUMBER_OF_YEARS;i++)
		{
			System.out.printf("%-10d%.2f \n",i,futureInvestmentValue(investmentAmount,monthlyInterestRate/1200,i));
		}
	}
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int year)
	{
		double sum = investmentAmount * Math.pow((1 + monthlyInterestRate),(year * 12));
		return sum;
	}
}

class Work_8
{
	public static void main(String[] args)
	{
		double i = 0;
		double j = 0;
		System.out.println("celsius\t\tfahrenheit\t\tfahrenheit\tcelsius");
		for (i = 40,j = 120;i >= 31 && j >= 30.0;i--,j-=10)
			System.out.printf("%.1f\t\t%.1f\t\t\t%.1f\t\t%.2f\n",i,celsiusToFahrenheit(i),j,fahrenheitToCelsius(j));

	}
	public static double celsiusToFahrenheit(double celsius)
	{
		return (9.0 / 5) * (celsius + 32);
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (5.0 / 9) * (fahrenheit - 32);
	}
}

class Work_9
{
	public static void main(String[] args)
	{
		double i = 0;
		double j = 0;
		System.out.println("foot\tmeter\t\tmeter\tfoot");
		for (i = 1,j = 20;i <= 10 || j <= 65;i++,j+=5)
			System.out.printf("%.1f\t%.3f\t\t%.1f\t%.3f\n",i,fooToMeter(i),j,meterToFoot(j));

	}
	public static double fooToMeter(double foot)
	{
		return foot * 0.305;
	}
	public static double meterToFoot(double meter)
	{
		return meter * 3.279;
	}
}


class Work_10
{
	public  static void main(String[] args)
	{
		final int LINE_NUMBER = 10;
		int n = 1;
		int s = 0;
		while (n < 10000)
		{
			if (isPrime(n))
			{
				s += 1;
				if (s % LINE_NUMBER == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
			}
			n++;

		}
	}
	public static boolean isPrime(int number)
	{
		for (int i = 2;i <= number/2;i++)
		{
			if (number % i == 0)
				return false;
		}
		return true;
	}
}

class Work_11
{
	public static void main(String[] args)
	{
		System.out.println("salesAmount\t\tremuneration");
		for (double i = 10000;i<=100000;i+=5000)
		{
			System.out.printf("%d\t\t%.1f\n",(int)i,computeCommission(i));
		}
	}
	public static double computeCommission(double salesAmount)
	{
		double commission = 0;
		if (salesAmount > 10000)
			commission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
		else if (salesAmount <= 10000 && salesAmount >= 5000)
			commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
		else
			commission = salesAmount * 0.08;
		return commission;
	}
}

class Work_12
{
	public static void main(String[] args)
	{
		printChars('1','Z',10);
	}
	public static void printChars(char ch1,char ch2,int
		numberPerLine)
	{
		int n = 0;
		for (int i = ch1;i <= ch2;i++)
		{
			n++;
			if (n % numberPerLine == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");
		}
		System.out.println();
	}
}

class Work_13
{
	public static void main(String[] args)
	{
		System.out.println("i\t\tm(i)");
		for (double i = 1;i<=20;i++)
			System.out.printf("%d\t\t%.4f\n",(int)i,gitSeriesNumer(i));
	}
	public static double gitSeriesNumer(double number)
	{
		double sum = 0;
		for (double i = 1;i <= number;i++)
			sum += i / (i + 1.0);
		return sum;
	}
}

class Work_14
{
	public static void main(String[] args)
	{
		System.out.println("i\t\tm(i)");
		for (double i = 1;i<=901;i+=100)
			System.out.printf("%d\t\t%.4f\n",(int)i,gitPI(i));
	}
	public static double gitPI(double number)
	{
		double sum = 0;
		for (double i = 1;i <= number;i++)
			sum = sum + Math.pow((-1),i+1)/(2 * i - 1);
		return 4 * sum;
	}
}

class Work_15
{
	public static void main(String[] args)
	{
		System.out.println("Taxable\tSingle\tMarried Joint\tMarried\tHead of");
		System.out.println("Income\t       \t             \tSeparate\ta House");
		for (double i = 50000;i <= 60000;i+=50)
			System.out.printf("%d\t%d\t%d\t\t%d\t%d\n",(int)i,
				Math.round(computeTax(0,i)),
				Math.round(computeTax(1,i)),
				Math.round(computeTax(2,i)),
				Math.round(computeTax(3,i)));
	}
	public static double computeTax(int status, double income)
	{
		double tatx = 0;
		if (status == 0)
		{
			if (income <= 8350)
				tatx = income * 0.10;
			else if (income <= 33950)
				tatx = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tatx = 8350 * 0.10 + (33950 - 8350) * 0.15+
				(income - 33950) * 0.25;
			else if (income <= 171550)
				tatx = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tatx = 8350 * 0.10 + (income - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(income - 171550) * 0.33;
			else
				tatx = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 1)
		{
			if (income <= 16700)
				tatx = income * 0.10;

			else if (income <= 67900)
				tatx = income * 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tatx = income * 0.10 + (income - 16700) * 0.15+
				(income - 67900) * 0.25;
			else if (income <= 208850)
				tatx = income * 0.10 + (income - 16700) * 0.15 +
				(income - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tatx = income * 0.10 + (income - 16700) * 0.15 +
				(income - 67900) * 0.25 + (income - 137050) * 0.28 +
				(income - 208850) * 0.33;
			else
				tatx = income * 0.10 + (income - 16700) * 0.15 +
				(income - 67900) * 0.25 + (income - 137050) * 0.28 +
				(income - 208850) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 2)
		{
			if (income <= 8350)
				tatx = income * 0.10;
			else if (income <= 33950)
				tatx = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tatx = income * 0.10 + (income - 8350) * 0.15+
				(income - 33950) * 0.25;
			else if (income <= 104425)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33;
			else
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else if (status == 3)
		{
			if (income <= 8350)
				tatx = income * 0.10;
			else if (income <= 33950)
				tatx = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tatx = income * 0.10 + (income - 8350) * 0.15+
				(income - 33950) * 0.25;
			else if (income <= 104425)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33;
			else
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else
		{
			if (income <= 11950)
				tatx = income * 0.10;
			else if (income <= 45500)
				tatx = income * 0.10 + (income - 11950) * 0.15;
			else if (income <= 117450)
				tatx = income * 0.10 + (income - 11950) * 0.15+
				(income - 45500) * 0.25;
			else if (income <= 190200)
				tatx = income * 0.10 + (income - 11950) * 0.15 +
				(income - 45500) * 0.25 + (income - 117450) * 0.28;
			else if (income <= 372950)
				tatx = income * 0.10 + (income - 11950) * 0.15 +
				(income - 45500) * 0.25 + (income - 117450) * 0.28 +
				(income - 190200) * 0.33;
			else
				tatx = income * 0.10 + (income - 11950) * 0.15 +
				(income - 45500) * 0.25 + (income - 117450) * 0.28 +
				(income - 190200) * 0.33 + (income - 372950) * 0.35;
		}
		return tatx;
	}
}

class Work_16
{
	public static void main(String[] args)
	{
		System.out.println("year\tDays");
		for (int i = 2000;i <= 2020;i++)
			System.out.printf("%d\t%d\n",i,numberOfDaysInAYear(i));
	}

	public static int numberOfDaysInAYear(int year)
	{
		return (year % 400 ==0 || (year % 4 == 0 && year % 100 != 0))?366:365;
	}
}

class Work_17
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n:");
		int n = input.nextInt();

		printMatrix(n);
	}
	public static void printMatrix(int n)
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
				System.out.print((int)(Math.random()*2) + " ");
			System.out.println();
		}

	}
}

class Work_18
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the password: ");
		String password = input.nextLine();

		passWordAuthentication(password);
	}
	public static void passWordAuthentication(String password)
	{
		if (passWordLength(password,8) && alphanumeric(password) && numbersCheck(password))
			System.out.println("valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static boolean passWordLength(String password,int lengths)
	{
		return (password.length() >= lengths)?true:false;
	}
	public static boolean alphanumeric(String password)
	{
		char ch;
		for (int i = 0;i < password.length();i++)
		{
			ch = password.charAt(i);
			if (!Character.isLetterOrDigit(ch))
				return false;
		}
		return true;
	}
	public static boolean numbersCheck(String password)
	{
		password = password.toLowerCase();
		char ch;
		int n = 0;
		for (int i = 0;i < password.length();i++)
		{
			ch = password.charAt(i);
			if (Character.isDigit(ch))
				n++;
		}
		return (n >= 2)?true:false;
	}
}

class Work_19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the values of the three edges: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if (isValid(side1,side2,side3))
			System.out.println("The area of the triangle is " + area(side1,side2,side3));
		else
			System.out.println("Tripartite error");

	}
	public static boolean isValid(
		double side1,double side2,double side3)
	{
		if ((side1 + side2 > side3) && (side1+side3 > side2) && (side2 + side3 > side1))
			return true;
		else
			return false;
	}
	public static double area(
		double side1,double side2,double side3)
	{
		double s = (side1 + side2 + side3)/2;
		double areas = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return areas;
	}
}
class Work_20
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Input string: ");
		String s = input.nextLine();

		System.out.println("The number of characters is " +  countLetters(s));
	}
	public static int countLetters(String s)
	{
		int count = 0;
		for (int i = 0;i < s.length(); i++)
		{
			if (Character.isLetter(s.charAt(i)))
				count++;
			
		}
		return count;
	}
}

class Work_21
{
	public static void main(String[] args)
	{

	}

	public static int getNumber(char uppercaseLetter)
	{
		if (Character.isDigit(ch))
			return uppercaseLetter - '0';
		else if (Character.isLetter(ch))
		{
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
			if (uppercaseLetter == 'a' || uppercaseLetter == 'a' || uppercaseLetter == 'a')
				return 2
		}
		else
		{
			return -1;
		}

	}
}