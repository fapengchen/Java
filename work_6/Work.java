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
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		char ch;
		String s1 = "";
		for (int i = 0;i < s.length();i++)
		{
			ch = s.charAt(i);
			if (getNumber(ch) >= 0)
				s1 += getNumber(ch);
			else
				s1 += s.charAt(i);
		}
		System.out.println(s1);
	}

	public static int getNumber(char uppercaseLetter)
	{
		if (Character.isDigit(uppercaseLetter))
			return uppercaseLetter - '0';
		else if (Character.isLetter(uppercaseLetter))
		{
			char ch = Character.toLowerCase(uppercaseLetter);
			if (ch == 'a' || ch == 'b' || ch == 'c')
				return 2;
			if (ch == 'd' || ch == 'e' || ch == 'f')
				return 3;
			if (ch == 'g' || ch == 'h' || ch == 'i')
				return 4;
			if (ch == 'j' || ch == 'k' || ch == 'l')
				return 5;
			if (ch == 'm' || ch == 'n' || ch == 'o')
				return 6;
			if (ch == 'p' || ch == 'q' || ch == 'r'
				|| ch == 's')
				return 7;
			if (ch == 't' || ch == 'u' || ch == 'v')
				return 8;
			if (ch == 'w' || ch == 'x' || ch == 'y' 
				|| ch == 'z')
				return 9;
		}

	return -1;

	}
}

class Work_22
{
	public static void main(String[] args)
	{
		System.out.println(sqrt(1111));
	}
	public static double sqrt(long n)
	{
		final double APPROX = 0.0001;
		double lastGuess = 1;
		double nextGuess = 0;

		while(Math.abs(nextGuess*nextGuess - n) > 0)
		{
			nextGuess = (lastGuess + n / lastGuess) / 2;
			lastGuess = nextGuess;
		}
		return nextGuess;
	}
}

class Work_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Input string: ");
		String str = input.nextLine();

		System.out.print("Enter the character to view: ");
		String s=input.nextLine(); 
		char a = s.charAt(0);

		System.out.println(a + " appears " +  count(str,a) + " times");
	}

	public static int count(String str,char a)
	{
		int count = 0;
		for (int i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}
}

class Work_24
{
	public static void main(String[] args)
	{
		ShowCurrentTime();
	}

	public static void ShowCurrentTime()
	{

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60 + 8;

		long currentHour = totalHours % 24;

		long totalDays = totalHours / 24 + 1;

		int year = 1970;

		while (totalDays > 366)
		{
			if (isLeapYear(year))
				totalDays -= 366;
			else
				totalDays -= 365;
			year++;

		}

		int month = 1;
		while (totalDays > 30)
		{	
			if (month == 1 || 
				month == 3 ||
				month == 5 ||
				month == 7 ||
				month == 8 ||
				month == 10 ||
				month == 12 )
				totalDays -= 31;
			else if (month == 2)
			{
				if (isLeapYear(year))
					totalDays -= 29;
				else
					totalDays -= 28;
			}
			else
				totalDays -= 30; 
			month++;
		}
		System.out.println(totalDays);
		System.out.println("Current time is " + year + "year " + month + "month " + 
		totalDays + "Day " + currentHour + ":"+ currentMinute + ":" + currentSecond + "GMT");
	}

	public static boolean isLeapYear(int year)
	{
		return year % 400 == 0|| (year % 4 == 0 && year % 100 != 0);
	}


}

class Work_25
{
	public static void main(String[] args)
	{
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
	}
	public static String convertMillis(long millis)
	{
		long totalSeconds = millis / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60 ;

		long currentHour = totalHours % 24;

		return totalHours + ":" + currentMinute + ":" + currentSecond;
	}
}

class Work_26
{
	public static void main(String[] args)
	{
		final int FIXED_THE_NUMBER_OF_ROWS = 10;
		int n = 2;
		int count = 0;
		while (count <= 100)
		{
			if (isPalindromePrimes(n))
			{
				count++;
				if (count % FIXED_THE_NUMBER_OF_ROWS == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
			}
			n++;
		}
	}	
	public static boolean isPalindromePrimes(int num)
	{
		return isprime(num) && (num == reverse(num));
	}
	public static boolean isprime(int num)
	{
		for (int i=2;i <= num / 2;i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
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
}
class Work_27
{
	public static void main(String[] args)
	{
		final int FIXED_THE_NUMBER_OF_ROWS = 10;
		int n = 2;
		int count = 0;
		while (count <= 100)
		{
			if (isPalindromePrimes(n))
			{
				count++;
				if (count % FIXED_THE_NUMBER_OF_ROWS == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
			}
			n++;
		}
	}	
	public static boolean isPalindromePrimes(int num)
	{
		return isprime(num) && isprime(reverse(num)) && num != reverse(num);
	}
	public static boolean isprime(int num)
	{
		for (int i=2;i <= num / 2;i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
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
}

class Work_28
{
	public static void main(String[] args)
	{
		System.out.println("p\t\t\t2^p-1");
		int n = 2;
		int count = 0;
		int mason = 0;
		while (mason < 31)
		{
			mason = isMason(n);
			if (mason > -1)
			{
				System.out.println(n + "\t\t\t" + mason);
			}
			n++;
		}
	}
	public static int isMason(int num)
	{
		if (isprime(num) && isprime(Mason(num)))
			return Mason(num);
		else
			return -1;
	}
	public static boolean isprime(int num)
	{
		for (int i=2;i <= num / 2;i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static int Mason(int num)
	{
		return (int)Math.pow(2,num) - 1;
	}
}

class Work_29
{
	public static void main(String[] args)
	{
		int n = 2;
		String p="";
		while (n < 1000)
		{
			p = pairssPrime(n);
			if (!p.equals(""))
				System.out.println(p);
			n++;
		}
	}

	public static String pairssPrime(int num)
	{
		String s = "";
		if (isprime(num) && isprime(num+2))
			s = "(" + num+" " + (num+2) +")";
		return s;
	}
	public static boolean isprime(int num)
	{
		for (int i=2;i <= num / 2;i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
}

class Work_30
{
	public static void main(String[] args)
	{
		gambling();
	}
	public static void gambling()
	{
		int sum = rollSum();
		boolean win = false;
		if (sum == 7 || sum == 11)
			win = true;
		else if (sum == 2 ||sum == 3 ||sum == 12)
			win = false;
		else
			win = keepRoollDice();

		if (win)
			System.out.println("You win");
		else
			System.out.println("You lose");
	}
	public static int rollDice()
	{
		return 1 + (int)(Math.random() * 6);
	}
	public static int rollSum()
	{
		int num1 = rollDice();
		int num2 = rollDice();
		int sum = num1 + num2;
		System.out.printf("You rolled %d + %d = %d\n" ,num1,num2,sum);
		return sum;
	}
	public static boolean keepRoollDice()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Point is ");
		int ask = input.nextInt();
		int sum = 0;
		do
		{
			sum = rollSum();
		}while(sum != 7 && sum != ask);

		return (sum == ask)?true:false;

	}

}

class Work_31
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long l = input.nextLong();

		if (isValid(l))
			System.out.println(l + " is valid");
		else
			System.out.println(l + " is invalid");
	}
	public static boolean isValid(long number)
	{
		int sum1 = 0;
		int sum2 = 0;
		if (getSize(number) < 13 || getSize(number) > 16)
		{
			System.out.println(0);
			return false;
		}

		else if (!prefixMatched(number,4) &&
		    !prefixMatched(number,5) &&
		    !prefixMatched(number,37) &&
		    !prefixMatched(number,6))
		{
		    return false;
		}
		else
		{
			sum1 = sumOfDoubleEvenPlace(number);
			sum2 = sumOfOddPlace(number);
			if ((sum1 + sum2) % 10 == 0)
				return true;
			return false;
		}
	}
	public static int sumOfDoubleEvenPlace(long number)
	{
		int sum = 0;
		String s = number + "";
		int d = 0;
		for (int i = 0;i < s.length();i++)
		{
			if (i % 2 == 0)
			{
				d = s.charAt(i) - '0';
				sum += getDigit(d*2);				
			}

		}
		return sum;
	}
	public static int getDigit(int number)
	{
		int sum = 0;
		if (number < 10)
			return number;
		else
		{	while(number > 0)
			{
				sum = sum + number % 10;
				number = number / 10;
			}

			return sum;
		}
	}
	public static int sumOfOddPlace(long number)
	{
		String snumber = number+"";
		int sum = 0;
		for (int i = 0;i < snumber.length();i++)
		{
			if (i % 2 == 1)
			sum += snumber.charAt(i) - '0';
		}
		return sum;
	}
	public static boolean prefixMatched(long number, int d)
	{
		return ((number+"").startsWith(d+""));
	}
	public static int getSize(long d)
	{
		return (d+"").length();
	}
	public static long getPrefix(long number, int k)
	{
		return Integer.parseInt((number+"").substring(0,k));
	}
}

class Work_32
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 0;i < 1000;i++)
		{
			if (gambling())
				count++;
		}
		System.out.println("You win:" + count);
	}
	public static boolean gambling()
	{
		int sum = rollSum();
		boolean win = false;
		if (sum == 7 || sum == 11)
			win = true;
		else if (sum == 2 ||sum == 3 ||sum == 12)
			win = false;
		else
			win = keepRoollDice();

		return win;
	}
	public static int rollDice()
	{
		return 1 + (int)(Math.random() * 6);
	}
	public static int rollSum()
	{
		int num1 = rollDice();
		int num2 = rollDice();
		int sum = num1 + num2;
		System.out.printf("You rolled %d + %d = %d\n" ,num1,num2,sum);
		return sum;
	}
	public static boolean keepRoollDice()
	{
		int ask = rollSum();
		System.out.println("Point is " + ask);
		int sum = 0;
		do
		{
			sum = rollSum();
		}while(sum != 7 && sum != ask);

		return (sum == ask)?true:false;

	}

}
class Work_33
{
	public static void main(String[] args)
	{
		ShowCurrentTime();
	}
	public static void ShowCurrentTime()
	{

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60 + 8;

		long currentHour = totalHours % 24;

		long totalDays = totalHours / 24 + 1;

		int year = 1970;

		while (totalDays > 366)
		{
			if (isLeapYear(year))
				totalDays -= 366;
			else
				totalDays -= 365;
			year++;

		}

		int month = 1;
		while (totalDays > 30)
		{	
			if (month == 1 || 
				month == 3 ||
				month == 5 ||
				month == 7 ||
				month == 8 ||
				month == 10 ||
				month == 12 )
				totalDays -= 31;
			else if (month == 2)
			{
				if (isLeapYear(year))
					totalDays -= 29;
				else
					totalDays -= 28;
			}
			else
				totalDays -= 30; 
			month++;
		}
		System.out.println("Current date and time is " + getMonthName(month) +" "+ totalDays+ " ,"+ 
		year + " " + currentHour + ":"+ currentMinute + ":" + currentSecond);
	}
	public static String getMonthName(int month)
	{
		String monthName = "";
		switch(month) 
		{
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName =  "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "Decmber";
		}
		return monthName;
	}
	public static boolean isLeapYear(int year)
	{
		return year % 400 == 0|| (year % 4 == 0 && year % 100 != 0);
	}
}

class Work_34
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("ENter full year (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("ENter month as a number between 1 and 12: ");
		int month = input.nextInt();

		printMonth(year, month);
	}
	public static void printMonth(int year,int month)
	{
		printMonthTitle(year,month);
		printMonthBody(year,month);
	}
	public static void printMonthTitle(int year,int month)
	{
		System.out.println("          " + getMonthName(month)
			+ " " + year);
		System.out.println("---------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	public static String getMonthName(int month)
	{
		String monthName = "";
		switch(month) 
		{
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName =  "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "Decmber";
		}
		return monthName;
	}
	public static void printMonthBody(int year, int month)
	{
		int startDay = getStartDay(year, month);

		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		int i = 0;
		for (i = 0; i < startDay;i++)
			System.out.print("    ");

		for (i = 1; i <= numberOfDaysInMonth;i++)
		{
			System.out.printf("%4d",i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
	}
	public static int getStartDay(int year,int month)
	{
		int m = 0;
		int q = 1;
		if (month == 1|| month == 2)
		{
			m = (month == 1)?13:14;
			year -= 1;
		}
		else
			m = month;
		int j = (int)(Math.abs(year / 100));
		int k = (int)year % 100;
		int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

		return h;
	}
	public static int getNumberOfDaysInMonth(int year,int month)
	{
		if (month == 1|| month == 3 || month == 5 || month == 7 ||
			month == 8|| month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2) return isLeapYear(year) ? 29: 28;
		return 0;
	}
	public static boolean isLeapYear(int year)
	{
		return year % 400 ==0 || (year % 4 == 0 && year % 100 != 0);
	}
}
class Work_35
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the pentagon is " + area(side));
	}
	public static double area(double side)
	{
		return (5 * side * side) / (4 * Math.tan(Math.PI/5));
	}
}

class Work_36
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double side = input.nextDouble();


		System.out.println("The area of the polygon is " + area(n,side));
	}
	public static double area(int n, double side)
	{
		return (n * side * side) / (4 * Math.tan(Math.PI/5));
	}
}

class Work_37
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number and character width: ");
		int number = input.nextInt();
		int width = input.nextInt();

		System.out.println(format(number,width));
	}
	public static String format(int number, int width)
	{
		String s = number + "";
		if (s.length() > width)
			return s;
		width = width - s.length();
		for (int i = 0;i < width;i++)
			s = '0' + s;
		return s;
	}
}
class Work_38
{
	public static void main(String[] args)
	{
		int count = 1;

		while (count <= 100)
		{
			if (count % 10 == 0)
				System.out.println(getRandomCharacter('A','Z'));
			else
				System.out.print(getRandomCharacter('A','Z'));
			count++;
		}
		System.out.println();
		count = 1;
		while (count <= 100 )
		{
			if (count % 10 == 0)
				System.out.println(getRandomCharacter('0','9'));
			else
				System.out.print(getRandomCharacter('0','9'));
			count++;
		}
	}
	public static char getRandomCharacter(char ch1,char ch2)
	{
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseLetter()
	{
		return getRandomCharacter('a','z');
	}

	public static char getRandomUppercaseLetter()
	{
		return getRandomCharacter('A','Z');

	}
	public static char getRandomDigitCharacter()
	{
		return getRandomCharacter('0','9');
	}
	public static char getRandomCharacter()
	{
		return getRandomCharacter('\u0000','\uFFFF');
	}
}

class Work_39
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (leftOfTheLine(x0,y0,x1,y1,x2,y2))
				System.out.println("(" + x2 +"," + y2 +") is on the left side of the line from (" + 
								x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		else if (ontheSameLine(x0,y0,x1,y1,x2,y2))
			System.out.println("(" + x2 +"," + y2 +") is on the line from (" + 
								x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		else if (onTheLineSegment(x0,y0,x1,y1,x2,y2))
			System.out.println("(" + x2 +"," + y2 +") is on the right side of the line from (" + 
								x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}

	public static boolean leftOfTheLine(double x0, double y0,
		double x1, double y1, double x2, double y2)
	{
		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0);
	}

	public static boolean ontheSameLine(double x0, double y0,
		double x1, double y1, double x2, double y2)
	{
		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0);
	}

	public static boolean onTheLineSegment(double x0, double y0, 
		double x1, double y1,double x2, double y2)
	{
		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0);
	}
}