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
			if (i==number-1)
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