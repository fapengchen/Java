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
		System.out.println("From left to right: ");
		double sum = 0;
		for (double i=1;i <= 50000;i++)
		{
			sum = sum + (1/i);
		}
		System.out.println(sum);
		System.out.println("From right to left: ");
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

class Work_26
{
	public static void main(String[] args)
	{
		double e = 1;
		double item = 1;
		
		for (int i =1;i<=100000;i++)
		{	
			item = item / i;
			e += item;
			if (i % 10000 == 0)
				System.out.println("e: " + e);
		}


	}
}

class Work_27
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 101;i <= 2100;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				count += 1;
				if (count % 10 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
	

		}
	}
}

class Work_28
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year and the day of the week on the first day of the year: ");
		int year = input.nextInt();
		int week = input.nextInt();
		String M = "";
		int W = 0;
		boolean leap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))? true : false;
		for (int i=1;i<=12;i++)
		{
			if (i==1)
			{
				M="January";
			}
			else if (i == 2)
			{
				M="February";
				W=(31%7+week)%7;
				week=W;
			}
			else if (i == 3)
			{
				M="March";
				if (leap)
					W=(29%7+week)%7;
				else
					W=(29%7+week)%7;
				week=W;
			}
			else if (i == 4)
			{
				M="February";
				W=(31%7+week)%7;
				week=W;
			}
			else if (i == 5)
			{
				M="May";
				W=(30%7+week)%7;
				week=W;
			}
			else if (i == 6)
			{
				M="June";
				W=(31%7+week)%7;
				week=W;
			}
			else if (i == 7)
			{
				M="July";
				W=(30%7+week)%7;
				week=W;
			}
			else if (i == 8)
			{
				M="August";
				W=(31%7+week)%7;
				week=W;
			}
			else if (i == 9)
			{
				M="September";
				W=(31%7+week)%7;
				week=W;
			}
			else if (i == 10)
			{
				M="October";
				W=(30%7+week)%7;
				week=W;
			}
			else if (i == 11)
			{
				M="November";
				W=(31%7+week)%7;
				week=W;
			}
			else if (i == 12)
			{
				M="December";
				W=(30%7+week)%7;
				week=W;
			}

			switch(week)
			{
				case 1: System.out.println(M+" 1 "+year+" is Monday");break;
	            case 2: System.out.println(M+" 1 "+year+" is Tuesday");break;
	            case 3: System.out.println(M+" 1 "+year+" is Wednesday");break;
	            case 4: System.out.println(M+" 1 "+year+" is Thursday");break;
	            case 5: System.out.println(M+" 1 "+year+" is Friday");break;
	            case 6: System.out.println(M+" 1 "+year+" is Saturday");break;
	            case 0: System.out.println(M+" 1 "+year+" is Sunday");break;
			}

		}

	}
}

class Work_29
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year and the day of the week on the first day of the year: ");
		int year = input.nextInt();
		int week = input.nextInt();
		String M = "";
		int W = 0;
		int n = 0;
		boolean leap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))? true : false;
		String calendar = "";
		for (int i = 1; i <= 12; i++)
		{
			calendar = "";
			if (i==1)
			{
				M="January";
				n = 31;

			}
			else if (i == 2)
			{
				M="February";
				W=(31%7+week)%7;
				week=W;
				if (leap)
					n = 29;
				else
					n = 28;


			}
			else if (i == 3)
			{
				M="March";
				if (leap)
					W=(29%7+week)%7;
				else
					W=(28%7+week)%7;
				week=W;
				n = 31;

			}
			else if (i == 4)
			{
				M="February";
				W=(31%7+week)%7;
				week=W;
				n = 30;

			}
			else if (i == 5)
			{
				M="May";
				W=(30%7+week)%7;
				week=W;
				n = 31;

			}
			else if (i == 6)
			{
				M="June";
				W=(31%7+week)%7;
				week=W;
				n = 30;

			}
			else if (i == 7)
			{
				M="July";
				W=(30%7+week)%7;
				week=W;
				n = 31;


			}
			else if (i == 8)
			{
				M="August";
				W=(31%7+week)%7;
				week=W;
				n = 31;

			}
			else if (i == 9)
			{
				M="September";
				W=(31%7+week)%7;
				week=W;
				n = 30;

			}
			else if (i == 10)
			{
				M="October";
				W=(30%7+week)%7;
				week=W;
				n = 31;

			}
			else if (i == 11)
			{
				M="November";
				W=(31%7+week)%7;
				week=W;
				n = 30;

			}
			else if (i == 12)
			{
				System.out.println(week);
				M="December";
				W=(30%7+week)%7;
				week=W;
				n = 31;
			}
			if (week == 0)
				for (int j = 1; j < 7;j++)
						calendar += "\t";
			else
				for (int j = 1; j < week;j++)
						calendar += "\t";
			for (int z = 1;z<=n;z++)
			{
				if ((z+(week-1)) % 7  == 0)
				{
					calendar = calendar + z + "\n";
				}

				else
					calendar = calendar + z +"\t";
			}

			System.out.printf("\t\t%s %d\n",M,year);
			System.out.println("______________________________________________________________");
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n","Mon","Tue","Wed","Thu","Fri","Sat","Sun");
			System.out.println(calendar);
			System.out.println("");
			
		}
	}

}
class Work_30
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal and annual interest rate and storage time (month): ");
		double principal = input.nextDouble();
		double interest = input.nextDouble();
		int month = input.nextInt();
		double balance = 0;
		double month_interest = (interest / 1200);
		for (int i=1;i <= month;i++)
			balance = (principal + balance) * (1 + month_interest);
		System.out.printf("After %d months, the account balance is: %.3f \n",month,balance);
	}
}

class Work_31
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double total = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double rates = input.nextDouble();
		System.out.print("Enter maturity period(number of months): ");
		int month = input.nextInt();
		System.out.println("Month  CD Value");
		for (int i = 1;i <= month;i++)
		{
			total = total + total * rates / 1200;
			System.out.printf("%d\t%.2f\n",i,total);
		}
	}
}

class Work_32
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int lottery = (int)(Math.random() * 100);

		while (lottery % 11 == 0)
			lottery = (int)(Math.random() * 100);
		System.out.println(lottery);
		System.out.print("Enter yo7ur lottery pick (two digites): ");
		int guess = input.nextInt();

		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		if (guess == lottery)
			System.out.println("Exact match you win $10,000");
		else if (guessDigit2 == lotteryDigit1
			  && guessDigit1 == lotteryDigit2)
			System.out.println("Exact match you win $3,000");
		else if (guessDigit1 == lotteryDigit1
			  || guessDigit1 == lotteryDigit2
			  || guessDigit2 == lotteryDigit1
			  || guessDigit2 == lotteryDigit2)
			System.out.println("Exact match you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}

class Work_33
{
	public static void main(String[] args)
	{
		int sum = 0;
		System.out.print("The perfect number less than 1000 is: ");
		for (int i = 1;i<=10000;i++)
		{
			sum = 0;
			for (int j = 1;j < i;j++)
			{
				if (i % j == 0)
					sum += j;

			}
			if (sum == i)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}

class Work_34
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int box = 0;
		int guess = 0;
		int boxw = 0;
		int guessw = 0;
		do
		{
			System.out.print("scissor (0), rock (1), paper (2): ");
			guess = input.nextInt();
			box = (int)(Math.random() * 3);
			switch (guess)
			{
				case 0:
					if (box == 0)
					{
						System.out.println("The computer is scissor. You are scissor too. It is a draw");
						guessw = 0;
						boxw = 0;
					}
					else if (box == 1)
					{
						System.out.println("The computer is rock You are scissor . You lose");
						guessw = 0;
						boxw += 1;				
					}
					else
					{
						System.out.println("The computer is paper You are scissor . You win");
						guessw += 1;
						boxw = 0;
					}
					break;

				case 1:
					if (box == 1)
					{
						System.out.println("The computer is rock. You are rock too. It is a draw");
						guessw = 0;
						boxw = 0;
					}
					else if (box == 2)
					{
						System.out.println("The computer is paper. You are rock. You lose");
						guessw = 0;
						boxw += 1;
					}
					else
					{
						System.out.println("The computer is scissor. You are rock. You win");
						guessw += 1;
						boxw = 0;
					}
					break;
				case 2:
					if (box == 2)
					{
						System.out.println("The computer is paper. You are paper too. It is a draw");
						guessw = 0;
						boxw = 0;
					}
					else if (box == 0)
					{
						System.out.println("The computer is scissor. You are paper . You lose");
						guessw = 0;
						boxw += 1;	
					}
					else
					{
						System.out.println("The computer is rock. You are paper . You win");
						guessw += 1;
						boxw = 0;
					}

			}
			System.out.println("box: "+ boxw + " guess: " + guessw);


		}while (boxw < 2 && guessw < 2);
		if (boxw > guessw)
			System.out.println("Computer won");
		else
			System.out.println("You won");

	}
}

class Work_35
{
	public static void main(String[] args)
	{
		double sum = 0;
		for (int i = 1;i <= 624;i++)
		{
			sum += 1 / (i + Math.sqrt(i+1));
		}
		System.out.println("And for the " + sum);
	}
}

class Work_36
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String digits = input.nextLine();

		int sum = 0;

		for (int i = 0;i <= 8;i++)
			sum += (digits.charAt(i)-'0') * (i +1);		

		int d10 = sum % 11;

		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + digits +  "x");
		else
			System.out.println("The ISBN-10 number is " + digits + d10);
	}
}

class Work_37
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		int number = input.nextInt();
		String binary = "";
		while (number > 0)
		{
			binary = number % 2 + binary;
			number = number / 2;
		}
		System.out.println("Binary for: " + binary);
	}
}
class Work_38
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		int number = input.nextInt();
		String octal = "";
		while (number > 0)
		{
			octal = number % 8 + octal;
			number = number / 8;
		}
		System.out.println("octal for: " + octal);
	}
}

class Work_39
{
	public static void main(String[] args)
	{
		final int BASIC_SALARY = 5000;
		final double GROWTH = 0.01;
		double wages = 0;//工资
		double sales = 0;//销售额
		double commission = 0;//提成
		while(wages < 30000)
		{
			wages = 0;	
			sales += GROWTH;
			if (sales > 10000)
				commission = 5000 * 0.08 + 5000 * 0.1 + (sales - 10000) * 0.12;
			else if (sales < 10000 && sales >= 5000)
				commission = 5000 * 0.08 + (sales - 5000) * 0.1;
			else
				commission = sales * 0.08;
			wages = wages + BASIC_SALARY + commission;
		}

		System.out.printf("The minimum annual sales volume of 30000 is %.3f\n",sales);
	}
}
class Work_40
{
	public static void main(String[] args)
	{
		int positive = 0;
		int reverse = 0;
		int r = 0;
		for (int i = 0;i<=100000;i++)
		{
			r = (int)(Math.random() * 2);
			if (r==0)
				positive++;
			else
				reverse++;
		}
		System.out.println("positive: " + positive);
		System.out.println("reverse: " + reverse);

	}
}
class Work_41
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		String numbers = input.nextLine();

		char max=' ';
		int count = 1;

		for (int i = 0;i < numbers.length();i++)
		{
			if (max < numbers.charAt(i))
			{
				max = numbers.charAt(i);
				count = 1;
						
			}
			else if (max == numbers.charAt(i))
			{
				count++;
			}
		}

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}
}

class Work_42
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		final int BASIC_SALARY = 5000;
		final double GROWTH = 0.01;
		System.out.print("Enter the expected commission: ");
		double commission_sought = input.nextDouble();//期望提成
		double commission = 0;//提成
		double sales = 0;//销售额
		for (sales = 0.01;commission <= commission_sought; sales +=0.01)
		{
			if (sales > 10000)
				commission = 5000 * 0.08 + 5000 * 0.1 + (sales - 10000) * 0.12;
			else if (sales < 10000 && sales >= 5000)
				commission = 5000 * 0.08 + (sales - 5000) * 0.1;
			else
				commission = sales * 0.08;

		}

		System.out.printf("The minimum annual sales volume of 30000 is %.3f\n",sales);
	}
}








