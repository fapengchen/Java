import java.util.Scanner;

public class RepeatAdditionQuiz
{
	public static void main(String[] args)
	{
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.print(
			"What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		while(answer != number1 + number2)
		{
			System.out.print("Wrong answer. Try again. what is " + 
				number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}