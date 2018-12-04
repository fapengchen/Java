import java.util.Scanner;

public class GuessnumberoneTime
{
	public static void main(String[] args)
	{
		int number = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
		while (number != guess)
		{
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
			if (number == guess)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");

		}

	}
}