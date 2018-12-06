import java.util.Scanner;

class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer, the input ends if it is 0: ");
		String integer = input.nextLine();

		int n = 0;
		double sum = 0;
		int positive = 0;
		int negative = 0;
		int data = 0;

		boolean indication = false;

		while (integer.charAt(n) != '0')
		{
			data = 0;
			if (Character.isDigit(integer.charAt(n)))
			{
				data = Integer.parseInt(integer.substring(n,n+1));
				if (indication)
				{
					data = -1 * data;
				}
				if (data > 0)
					positive++;
				else
					negative++;
				sum = sum + data;
			}

			indication = (integer.charAt(n) == '-')?true:false;
			n++;
			if (n-1 > integer.length())
			{
				System.out.print("Enter an integer, the input ends if it is 0: ");
				integer = input.nextLine();
				n = 0;
			}

		}

		if (integer.charAt(0) != '0' || sum != 0)
		{
			double average = sum /(positive + negative);
			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.printf("The total is %.1f \n",sum);
			System.out.printf("The average is %.2f \n",average);
		}
		else
			System.out.println("No numbers are entered except 0");
	}
}

class Work_2
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);

		while  (count < NUMBER_OF_QUESTIONS)
		{
			int number1 = 1 + (int)(Math.random() * 15);
			int number2 = 1 + (int)(Math.random() * 15);

			if (number1 < number2)
			{
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			System.out.print(
				"What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			if (number1 - number2 == answer)
			{
				System.out.println("You are correct!");
				correctCount++;
			}
			else
				System.out.println("Your answer is wrong.\n" + number1
					+ " + " + number2 + " should be " + (number1 + number2));

			count++;
			output += "\n" + number1 + " + " + number2 + " = " + answer + " " + 
				((number1 + number2 == answer)? "correct":"wrong");
		}
		

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.print("Correct count is " + correctCount + 
			"\nTest time is " + testTime / 1000 + " seconds\n" + output +"\n");
	}
}

class Work_3
{
	public static void main(String[] args)
	{
		
		double pound = 2.2;
		System.out.println("kg         pound");
		for (int i = 1;i <= 199;i+=2)
		{
			System.out.printf("%d         %3.1f \n",i,i*pound);
		}
	}
}
class Work_4
{
	public static void main(String[] args)
	{
		double kilometer = 1.609;
		System.out.println("statute         kilometer");
		for (int i = 1;i <= 10;i++)
		{
			System.out.printf("%d         %.3f \n",i,i*kilometer);
		}
	}
}

class Work_5
{
	public static void main(String[] args)
	{
		System.out.println("kg         pound         pound         kg");
		double kp = 2.2;
		double pk = 0.4545;
		for (int i = 1,j=20;i <= 199 || j <= 515;i+=2,j+=5)
		{
			System.out.printf("%d         %.1f         %d         %.2f\n",i,i*kp,j,j*pk);
		}

	}
}

class Work_6
{
	public static void main(String[] args)
	{
		System.out.println("statute         kilometer         kilometer         statute");
		double sk = 1.609;
		double ks = 0.6215;
		for (int i = 1,j=20;i <= 10 || j <= 65;i++,j+=5)
		{
			System.out.printf("%d         %.3f         %d         %.3f\n",i,i*sk,j,j*ks);
		}
	}
}

class Work_7
{
	public static void main(String[] args)
	{
		int tuition = 10000;
		int sum = 0;
		for (int i=1;i<=14;i++)
		{
			tuition = (int)((1+0.05) * tuition);
			if (i == 10)
				System.out.println("Student fees after 10 years: " + tuition);
			if (i>=11)
				sum += tuition;

			
		}
		System.out.println("Total tuition after 10 years and 4 years: "+ sum);
	}
}

class Work_8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int number = input.nextInt();

		input.nextLine();
		System.out.print("Enter student name: ");
		String names = input.nextLine();

		System.out.print("Enter student grades: ");
		String grades = input.nextLine();

		int n = 0;
		int g = 0;

		int k = 0;
		int j = 0;

		int max = 0;
		String max_name = "";

		String name = "";
		String stringGrade = "";

		int grade = 0;
		
		for (int i = 0;i < number; i++)
		{
			k = names.indexOf(' ',n);
			j = grades.indexOf(' ',g);
			if (i == number-1)
			{
				k = names.length();
				j = grades.length();
			}
			name = names.substring(n,k);
			stringGrade = grades.substring(g,j);	
			n = k+1;
			g = j+1;
			grade = Integer.parseInt(stringGrade);
			if (grade > max)
			{
				max = grade;
				max_name = name;
			}

		}

		System.out.println("The name of the highest grade is " + max_name + " results for " + max);

	}
}

class Work_9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int number = input.nextInt();

		input.nextLine();
		System.out.print("Enter student name: ");
		String names = input.nextLine();

		System.out.print("Enter student grades: ");
		String grades = input.nextLine();

		int n = 0;
		int g = 0;

		int k = 0;
		int j = 0;

		int first = 0;
		String first_name = "";

		int second = 0;
		String second_name = "";

		String name = "";
		String stringGrade = "";

		int grade = 0;
		
		for (int i = 0;i < number; i++)
		{
			k = names.indexOf(' ',n);
			j = grades.indexOf(' ',g);
			if (i == number-1)
			{
				k = names.length();
				j = grades.length();
			}
			name = names.substring(n,k);
			stringGrade = grades.substring(g,j);	
			n = k+1;
			g = j+1;
			grade = Integer.parseInt(stringGrade);
			if (grade > second)
			{
				second = grade;
				second_name = name;
				if (second > first)
				{
					int temp = second;
					second = first;
					first = temp;

					String n_temp = second_name;
					second_name = first_name;
					first_name = n_temp;
				}
			}

		}

		System.out.println("The first name and grade is " + first_name + " " + first);
		System.out.println("The second name and grade is " + second_name + " " + second);

	}
}


class Work_10
{
	public static void main(String[] args)
	{
		int n = 0;
		String x = "";
		for (int i = 100; i<=1000;i++)
		{
			if ((i % 5 == 0) && (i % 6 == 0))
			{
				n++;
				x = (n % 10 != 0)? i+" ": i+ "\n";
				System.out.print(x);
			}

		}
		System.out.println("");
	}
}

class Work_11
{
	public static void main(String[] args)
	{
		int n = 0;
		String x = "";
		for (int i = 100; i <= 200;i++)
		{
			if ((i % 5 == 0) ^ (i % 6 == 0))
			{
				n++;
				x = (n % 10 != 0)? i+" ": i+ "\n";
				System.out.print(x);
			}

		}
		System.out.println("");
	}
}

class Work_12
{
	public static void main(String[] args)
	{
		int n = 0;
		while( n*n <= 12000)
		{
			n++;
		}
		System.out.println("The smallest integer n squared greater than 12,000 is " + n);
	}
}

class Work_13
{
	public static void main(String[] args)
	{
		int n = 0;
		while( Math.pow(n, 3) <= 12000)
		{
			++n;
		}
		System.out.println("The maximum integer n to the third power less than 12,000 is " + (n-1));
	}
}

class Work_14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two positive integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int d = Math.min(n1,n2);
		System.out.println(d);
		boolean common = true;
		while (common)
		{
			System.out.println(d);
			if ((n1 % d == 0) && ( n2 % d == 0))
				common = false;
			else
				d--;
		}
		System.out.printf("The largest common divisor of %d and %d is %d \n",n1,n2,d);
	}
}

class Work_15
{
	public static void main(String[] args)
	{
		
		for (int i=33,n=1;i<=126;i++,n++)
		{
			if (n % 10 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i);

		}
		System.out.println();
	}
}

class Work_16
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		for (int i=2;i < n;i++)
		{
			while(n % i==0)
			{
				if (n % i == 0)
					System.out.print(i + " ");
				n = n / i;
			}

		}
		System.out.println(n);

	}
}

class Work_17
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lies: ");
		int number = input.nextInt();
		for (int i=1;i<=number;i++)
		{
			for (int z = number;z > i ;z--)
			{
				System.out.print("  ");
			}
			for (int j = i;j > 1;j--)
			{
				System.out.print(j + " ");

			}
			for (int k = 1;k <= i;k++)
			{
				System.out.print(k + " ");

			}
			System.out.println("");
		}
	}
}

class Work_18
{
	public static void main(String[] args)
	{
		for (int i = 1;i <= 6;i++)
		{
			for (int j = 1;j <= i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}

		System.out.println("\n");
		for (int i = 6;i >= 1;i--)
		{
			for (int j = 1;j <= i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}

		System.out.println("\n");
		for (int i = 1;i <= 6;i++)
		{
			for (int z = 6;z > i ;z--)
			{
				System.out.print("  ");
			}
			for (int j = i;j >= 1;j--)
			{

				System.out.print(j+ " ");
			}
			System.out.println("");
		}

		System.out.println("\n");
		for (int i = 6;i >= 1;i--)
		{
			for (int z = 1;z <= 6-i ;z++)
			{
				System.out.print("  ");
			}
			for (int j = 1;j <= i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
}

class Work_19
{
	public static void main(String[] args)
	{
		for (int i = 0;i < 8;i++)
		{
			for (int z = 8 - i;z > 1;z--)
			{
				System.out.print("  ");
			}
			for (int j = 0;j < i;j++)
				System.out.printf("%-1d ",(int)Math.pow(2,j));
			for (int k = i;k >= 0;k--)
				System.out.printf("%-1d ",(int)Math.pow(2,k));
			System.out.println("");
		}


	}
}
class Work_20
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_PRIMES = 1000;
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		int count = 0;
		int number = 2;

		while(number <= NUMBER_OF_PRIMES)
		{

			boolean isPrime = true;

			for (int divisor = 2; divisor < number;divisor++)
			{
				if(number % divisor == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{	
				count++;
				if (count % 8 == 0)
					System.out.printf("%d\n",number);
				else
					System.out.printf("%d\t",number);
			}

			number++;

		}
		System.out.println("");
	}
}


class Work_21
{
	public static void main(String[] args)
	{

		final int YEAR_MONTHLY = 12;
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double amount = input.nextInt();

		System.out.print("Number of Years: ");
		int year = input.nextInt();

		System.out.println("Interest Rate    Monthly PayMent    Total Payment");

		double rate = 5;

		double monthly_rate = 0;
		double monthly_money = 0;
		double total_payment = 0;
		while(rate <= 8)
		{

			monthly_rate = (rate / 1200);
			monthly_money = (amount * monthly_rate)/
			(1 - 1/Math.pow((1 + monthly_rate),year * YEAR_MONTHLY));
			total_payment = monthly_money * year * YEAR_MONTHLY;
			System.out.printf("%.3f%%    %.2f    %.2f \n",rate,monthly_money,total_payment);

			rate = (1.0 / 8) + rate;
		}
		
	}
}

class Work_22
{
	public static void main(String[] args)
	{

		final int YEAR_MONTHLY = 12;
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double balance = input.nextDouble();

		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();

		System.out.print("Annual Interest Rate: ");
		double rate = input.nextDouble();

		double monthly_rate =  (rate / 1200);
		double monthly_money = (balance * monthly_rate)/
			(1 - 1/Math.pow((1 + monthly_rate),numberOfYears * YEAR_MONTHLY));
		double total_payment = monthly_money * numberOfYears * YEAR_MONTHLY;

		System.out.printf("\nMonthly Payment: %.2f\n",monthly_money);
		System.out.printf("Total Payment: %.2f\n\n",total_payment);

		System.out.println("");
		System.out.printf("Payment#\tInterest\tPrincipal\tBalance\n");
		double interest = 0;
		double principal = 0;
		for (int i=1;i<=numberOfYears*YEAR_MONTHLY;i++)
		{
			interest = balance * monthly_rate;
			principal = monthly_money - interest;
			balance =  balance - principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,balance);
		}


	}
}

class Work_23
{
	public static void main(String[] args)
	{
		System.out.println("From left to right：");
		double sum = 0;
		for (double i=1;i <= 50000;i++)
		{
			sum = sum + (1/i);
		}
		System.out.println(sum);
		System.out.println("From right to left：");
		double sum2 = 0;
		for (double j=50000;j >= 1;j--)
		{
			sum2 = sum2 + (1/j);
		}
		System.out.println(sum2);
	}
}
class Work_24
{
	public static void main(String[] args)
	{
		double sum = 0;
		for (int i = 97; i >= 1; i -= 2)
		{
			sum = sum + (i / (i + 2.0));		
		}

		System.out.println("sum: :" + sum);
	}
}

class Work_25
{
	public static void main(String[] args)
	{
		double sum = 0;
		double pi = 0;
		for (int i = 97; i <= 100000; i++)
		{
			sum = sum + (Math.pow((-1),i+1)/(2.0 * i - 1.0));
			if (i % 10000 == 0)
			{
				pi = 4 * sum;
				System.out.println("PI: :" + pi);	
			}

		}

		System.out.println("sum: :" + sum);
	}
}
