import java.util.Scanner;

class Work_3_4_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Score :");
		double Score = input.nextDouble();

		if (score > 90)
			score = (1 + 0.03) * score;
		else
			score = (1 - 0.01) * score;

		System.out.println("Score :" + score);
	}
}