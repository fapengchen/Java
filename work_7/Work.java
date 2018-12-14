import java.util.Scanner;

class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		int[] scores = new int[n];

		System.out.print("Enter 4 scores: ");
		for (int i = 0;i < n; i++)
		{
			scores[i] = input.nextInt();
		}
		int best = scoreMax(scores);
		for (int i =0; i < scores.length;i++)
		{
			char rating = performanceRating(scores[i],best);
			System.out.printf("Student %d score is %d and grade is %c \n",i,scores[i],rating);
		}

	}

	public static int scoreMax(int[] scores)
	{
		int max = scores[0];
		for (int i = 0;i < scores.length;i++)
		{
			if (scores[i] > max)
				max = scores[i];
		}
		return max;
	}
	public static char performanceRating(int score,int best)
	{
		if (score >= best - 10)
			return 'A';
		else if (score >= best - 20)
			return 'B';
		else if (score >= best - 30)
			return 'C';
		else if (score >= best - 40)
			return 'D';
		else
			return 'F';
	}
}

class Work_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter 10 integers: ");

		for (int i = 0;i < 10;i++)
		{
			numbers[i] = input.nextInt();
		}
		for (int i = numbers.length - 1;i >= 0;i--)
		{
			System.out.println(numbers[i] + " ");
		}

	}

}

class Work_3
{
	public static void main(String[] args)
	{
		
	}
}