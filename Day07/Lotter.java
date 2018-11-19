import java.util.Scanner;

public class Lotter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int lottery = (int)(Math.random() * 100);

		System.out.print("Enter yo7ur lottery pick (two digites): ");
		int guess = input.nextInt();

		int lottery1 = lottery / 10;
		int lottery2 = lottery % 10;

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		if (guess == lottery)
			System.out.println("Exact match you win $10,000");
		else if (lottery1 == guessDigit2 && lottery2 == guessDigit2)
			System.out.println("Exact match you win $3,000");
		else if (lottery1 == guessDigit1
			  || lottery1 == guessDigit2
			  || lottery2 == guessDigit1
			  || lottery2 == guessDigit2)
			System.out.println("Exact match you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}