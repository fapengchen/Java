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
		
		System.out.print("Enter the integers between 1 and 100: ");

		int[] numbers = input_numbers();
		int[] groups = groups_number(numbers);
		for (int i=0;i < groups.length;i++)
		{
			if (groups[i] > 0)
			{
				if (groups[i] == 1)
					System.out.printf("%d occurs %d time\n",i,groups[i]);
				else
					System.out.printf("%d occurs %d times\n",i,groups[i]);
			}
		}
	}

	public static int[] input_numbers()
	{
		Scanner scanner = new Scanner(System.in);
	    int[] num = new int[100];
	    int i = 0;
	    int input;
	    while (i >= 0) 
	    {
	        input = scanner.nextInt();
	        if (input != 0) 
	        {
	            num[i] = input;
	            i++;
	        } 
	        else 
	            break;
	    }
	    return num;
	}
	public static int[] groups_number(int[] numbers)
	{
		int[] groups = new int[101];

		for (int i = 0; i < numbers.length;i++)
		{
			if (numbers[i] > 0)
			{
				groups[numbers[i]]++;
			}
		}
		return groups;
	}
}

class Work_4
{
public static void main(String[] args)
	{
		
		System.out.print("The input results: ");

		int[] numbers = input_numbers();
		int avg = 0;
		int sum = 0;
		int n = 0 ;
		for (int i=0;i < numbers.length;i++)
		{
			if (numbers[i] > 0)
			{
				sum += numbers[i];
				n++;
			}
		}
		avg = sum / n;

		int greater = 0;
		int smaller = 0;

		for (int e: numbers)
		{
			
			if (e > 0)
			{
				if (e > avg)
					greater++;
				else
					smaller++;
			}

		}
		System.out.println("greater: " + greater);
		System.out.println("smaller: " + smaller);
	}

	public static int[] input_numbers()
	{
		Scanner scanner = new Scanner(System.in);
	    int[] num = new int[100];
	    int i = 0;
	    int input;
	    while (i >= 0) 
	    {
	        input = scanner.nextInt();
	        if (input > 0) 
	        {
	            num[i] = input;
	            i++;
	        } 
	        else 
	            break;
	    }
	    return num;
	}
}

class Work_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the numbers: ");
		int[] numbers = new int[10];
		int n = 0;
		int s = 0;
		for (int i = 0; i < numbers.length;i++)
		{
			n = input.nextInt();
			if (repeatNumber(numbers,n))
			{
				numbers[i] = n;
				s++;
			}	

		}
		System.out.println("The number of distinct number is " + s);
		System.out.print("The distinct numbers are: ");
		for (int e:numbers)
		{
			if (e > 0)
				System.out.print(" " + e);
		}
		System.out.println();
	}
	public static boolean repeatNumber(int[] numbers,int n)
	{
		for (int i = 0;i < numbers.length;i++)
		{
			if (n == numbers[i])
			{
				return false;
			}
		}
		return true;
	} 
}