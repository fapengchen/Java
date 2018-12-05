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