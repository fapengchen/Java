import java.util.Scanner;

class Work_3_3_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x = 0;

		System.out.print("y :");
		int y = input.nextInt();

		if (y >= 0)
			x = 1;
		System.out.println("x :" + x);
	}
}

class Work_3_3_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("score :");
		double score = input.nextDouble();

		if (score > 90)
			score = (1 + 0.03) * score;

		System.out.println("score :" + score);
	}
}